import java.util.Scanner;

public class Aula_03_pideal {
    public static void main(String[] args){

        double pesoIdealHomem,pesoIdealMulher,altura=1.77;
        Scanner in = new Scanner(System.in);
        System.out.println("Calcula o peso ideal");
        System.out.println("Qual a altura utilizada para o calculo?");
        altura = in.nextDouble();
        pesoIdealHomem = (72.7*altura) -58;
        pesoIdealMulher = (62.1*altura) -44.7;

        System.out.println("O peso ideal do homem de altura "+altura+" eh: "+pesoIdealHomem);
        System.out.println("O peso ideal do mulher de altura "+altura+" eh: "+pesoIdealMulher);
    }
}
