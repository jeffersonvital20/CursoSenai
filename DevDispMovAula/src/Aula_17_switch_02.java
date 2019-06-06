import java.util.Scanner;

public class Aula_17_switch_02 {
    public static void main(String[] args){
        double x,y;
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o primeiro número?");
        x= in.nextDouble();
        System.out.println("Qual o segundo número?");
        y= in.nextDouble();

        switch ((x>0&y>0)?1:0){
            case 1:
                System.out.println("valores validos");
            break;
            case 0:
                System.out.println("valores invalidos");
            break;
            default:
                System.out.println("faiou");
            break;
        }
    }
}
