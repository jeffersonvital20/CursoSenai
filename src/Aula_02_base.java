import java.util.Scanner;
public class Aula_02_base {
    public static void main(String[] args){
        System.out.println("Curso mobile");
        //declaração de vaiaveis
        int gastoJan=1500,gastoFev=2300,gastoMar=1700;
        int gastoTotal;
        Scanner in = new Scanner(System.in);
        //entrada de informções
        System.out.println("Este app calcula o valor do gasto trimestral.");
        System.out.println("Qual o gasto do mês de janeiro?");
        gastoJan = in.nextInt();
        System.out.println("Qual o gasto do mês de fevereiro?");
        gastoFev = in.nextInt();
        System.out.println("Qual o gasto do mês de Março?");
        gastoMar = in.nextInt();
        //processar de informações
        gastoTotal=gastoJan+gastoFev+gastoMar;

        //saida de dados
        System.out.println("O gasto total do trimestre é: R$"+gastoTotal);
    }
}
