
package testetcc;

import java.io.*;
import java.util.*;

public class TesteTCC {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String arquivo = "/home/luiz/Documentos/style.css";
        String arquivoTmp = "/home/luiz/Documentos/stylemin4.css";

        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTmp));
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));

        String linha;
        String letra = "";
        while ((linha = reader.readLine()) != null) {
            letra += linha;
        }
        
        letra = letra.replaceAll("\\sx{2,}",""); 
        System.out.println(letra);
        
        writer.write(letra);
        
        new File(arquivoTmp).createNewFile();
        //new File(arquivoTmp).renameTo(new File(arquivo));
        
        writer.close();        
        reader.close();
    }
    
}
