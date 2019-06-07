import java.util.Scanner;
public class Aula_12_ImparParTest {
    public static void main(String[] args){
        boolean teste;
        int num =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero para saber se é par ou impar.");
        num = in.nextInt();

        if (num%2==0){
            System.out.println("o número "+ num + " é par");
        }else {
            System.out.println("o número "+ num + " é impar");
        }

    }


}
