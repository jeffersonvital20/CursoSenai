import java.util.Scanner;
public class Aula_02_base {
    public static void main(String[] args){
        System.out.println("Curso mobile");
        //declaracao de vaiaveis
        int gastoJan=1500,gastoFev=2300,gastoMar=1700;
        int gastoTotal;
        Scanner in = new Scanner(System.in);
        //entrada de informacoes
        System.out.println("Este app calcula o valor do gasto trimestral.");
        System.out.println("Qual o gasto do mes de janeiro?");
        gastoJan = in.nextInt();
        System.out.println("Qual o gasto do mes de fevereiro?");
        gastoFev = in.nextInt();
        System.out.println("Qual o gasto do mes de Março?");
        gastoMar = in.nextInt();
        //processar de informacoes
        gastoTotal=gastoJan+gastoFev+gastoMar;

        //saida de dados
        System.out.println("O gasto total do trimestre e: R$"+gastoTotal);
    }
}
