package hmm.mathias.editor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoService {

    public static String CriarHashDeAlteracao(String dados){
        try {
            MessageDigest shaDigest = MessageDigest.getInstance("SHA-256");

            byte[] bytes = shaDigest.digest(dados.getBytes());
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
