package model;

import java.io.Serializable;
import java.io.File;
import java.util.ArrayList;

public class Resultado  implements Serializable{
    static String defaultPath="."+ File.separator + "results" + File.separator;

    private ArrayList<String> arquivosList;

    public Resultado(){
        arquivosList = new ArrayList<String>();
    }

    public ArrayList<String> getArquivosList() {
        return arquivosList;
    }

    public boolean addArquivo(String caminhoArquivo){
        //separa os diretórios do nome do arquivo
        String[] tokens = caminhoArquivo.split(".+?/(?=[^/]+$)");

        return arquivosList.add(defaultPath + tokens[1]);
    }
    
}
