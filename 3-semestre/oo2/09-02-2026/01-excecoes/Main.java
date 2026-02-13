import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        String res = m.lerArquivo("arq.txt");
        System.out.println("Resultado Final: " + res);
    }

    public String lerArquivo(String nomeArq) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArq))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            return "OK"; 
            
        } catch (FileNotFoundException e) {
            return "Arquivo não encontrado.";
        } catch (IOException e) {
            return "Erro na leitura do arquivo.";
        } catch (Exception e) {
            return "Erro inesperado: " + e.getMessage();
        }
    }
}