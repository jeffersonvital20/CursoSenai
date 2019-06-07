import java.util.Scanner;

public class Aula_16_switch_01 {
    public static void main(String[] args){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o primeiro numero?");
        x = in.nextDouble();
        System.out.println("Qual o segundo numero?");
        y = in.nextDouble();
        switch (y==0? 0:1){
            case 0:
                System.out.println("O segundo numero não é igual a zero");
            break;
            case 1:
                System.out.println(x/y);
            break;
            default:
                 System.out.println("faio");
            break;
        }

    }
}
