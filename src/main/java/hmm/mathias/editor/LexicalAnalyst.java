package hmm.mathias.editor;

import hmm.mathias.compiler.FoxtranConstants;
import hmm.mathias.compiler.FoxtranTokenManager;
import hmm.mathias.compiler.Token;
import hmm.mathias.compiler.TokenMgrError;

import java.util.ArrayList;


public class LexicalAnalyst {
    public ArrayList<String> FeedbackMessage;
    boolean HasError = false;
    boolean LogSuccess = false;
    private ArrayList<Integer> SkipTokens;
    private FoxtranTokenManager TokenManager;



    public LexicalAnalyst (FoxtranTokenManager tokenManager, boolean logSuccess){
        TokenManager = tokenManager;
        FeedbackMessage = new ArrayList<>();
        SkipTokens = new ArrayList<>();
        HasError = false;
        LogSuccess = logSuccess;
    }

    public void AddSkipToken(int token){
        if(SkipTokens.contains(token)) return;
        SkipTokens.add(token);
    }

    public void RemoveSkipToken(FoxtranConstants token){
        if(SkipTokens.contains(token))
            SkipTokens.remove(token);
    }

    public void LexicalParse(){
        Token currentToken = null;
        do{
            try{
                currentToken = TokenManager.getNextToken();
                if(SkipTokens.contains(currentToken.kind))
                    continue;
                if(LogSuccess){
                    if(currentToken.specialToken != null)
                        AdicionarMensagemDeToken(currentToken.specialToken);

                    AdicionarMensagemDeToken(currentToken);
                }
            }catch (TokenMgrError tokenError){
                FeedbackMessage.add(tokenError.getMessage());
                HasError = true;
                continue;
            }
        }while(currentToken.kind != FoxtranConstants.EOF);
    }

    private void AdicionarMensagemDeToken(Token currentToken){
        String token = String.format("'%s'",  currentToken.toString());
        String lineCol = String.format("em (L:%s,C:%s)", currentToken.beginLine, currentToken.beginColumn);

        StringBuilder newEntry = new StringBuilder(String.format("%-22s", GetTokenType(currentToken)))
                .append(String.format("%-10s", token))
                .append(String.format(" %-20s", lineCol))
                .append(String.format(" ID: %s", currentToken.kind));

        FeedbackMessage.add(newEntry.toString());
    }

    private String GetTokenType(Token token){
        if(token == null)
            return "";

        int tokenId = token.kind;

        if(tokenId >= 6 && tokenId <= 26)
            return "<PALAVRA RESERVADA>";
        if(tokenId > 26 && tokenId <= 52)
            return "<SIMBOLO RESERVADO>";

        //>50
        return FoxtranConstants.tokenImage[tokenId];
    }
}
