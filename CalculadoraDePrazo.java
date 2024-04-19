import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculadoraDePrazo {
public static void main(String[] args) {         
        try { 
            Scanner leitura = new Scanner(System.in);
            // Leitura da Data Inicial
            System.out.println("Digite a Data que se inicia o prazo, no formato DD/MM/AA: ");
            String dataStr = leitura.next();
    
            // Leitura da quantidade de prazo
            System.out.println("Digite o prazo em dias: ");
            int prazoRecebido = leitura.nextInt();
        
            // Criação do formato escolhido da data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

            // Formatação da data
            LocalDate dataInicial = LocalDate.parse(dataStr, formatter);

            // Calcular o prazo dado em cima da Data Inicial
            LocalDate novaData = dataInicial.plusDays(prazoRecebido);
            String dataSomada = novaData.format(formatter)  ;

            // Impressão da data já somada
            System.out.println("O prazo se encerra em " + dataSomada);
            leitura.close();
        
        } catch (Exception e) {
            //Retorno sobre erro na dada informada
            System.out.println("Formato inválido. Por favor, digite a data no formato DD/MM/AA.");
        }        
    }
}
