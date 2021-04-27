package hmm.mathias.editor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ConfigService {
    static String defaultConfigFile = "config.cfg";
    static String separator = ":=";
    static String lastPath = "LastPath";

    public static void setCaminhoPadrao(Path caminho){
        try{
            File configFile = new File(defaultConfigFile);
            if(configFile.exists()){
                configFile.delete();
            }

            String fullConfig = lastPath + separator + caminho;
            Files.write(Path.of(defaultConfigFile), fullConfig.getBytes(StandardCharsets.UTF_8));
        }catch (Exception ex){

        }


    }
    public static Path getCaminhoPadrao() throws IOException {
        String solvedPath =  System.getProperty("user.dir");

        String defaultPath =  System.getProperty("user.dir");
        Path configPath = Path.of(defaultPath).resolve(defaultConfigFile);
        if(!Files.exists(configPath)) return Path.of(solvedPath);
        Scanner myReader = new Scanner(configPath);
        while (myReader.hasNextLine()) {
            String linha = myReader.nextLine();
            String[] dados = linha.split(separator);
            if(dados[0].replace(" ", "").equals(lastPath)){
                solvedPath = dados[1].replace(" ", "");
            }
        }
        return Path.of(solvedPath);
    }
}
