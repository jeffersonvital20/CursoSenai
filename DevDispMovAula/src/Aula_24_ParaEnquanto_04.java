import java.util.Scanner;

public class Aula_24_ParaEnquanto_04 {
    public static void main(String[] args) {
        int x = 0, op;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("----------------------------------");
            System.out.println("| 1 | Faça a tabuada de um numero|");
            System.out.println("----------------------------------");
            System.out.println("| 2 | Faça a tabuada de 1 á 13   |");
            System.out.println("----------------------------------");
            System.out.println("| 0 |          Sair              |");
            System.out.println("----------------------------------");
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Qual o número você quer a tabuada?");
                    x = in.nextInt();
                    for (int j = 1; j <= 13; j++) {
                        System.out.println("------------------");
                        System.out.println("| " + x + " * " + j + " | " + x * j + "  |");
                        System.out.println("------------------");
                    }
                    System.out.print(" ");
                break;
                case 2:
                    for (int i = 1; i <= 13; i++) {
                        System.out.print(" ");
                        for (int j = 1; j <= 10; j++) {
                            System.out.println("------------------");
                            System.out.println("| " + i + " * " + j + " | " + i * j + "  |");
                            System.out.println("------------------");
                        }
                        System.out.print(" ");
                    }
                break;
                case 0:
                    op=0;
                break;
                default:
                     System.out.println("opção invalida");
                break;
            }
        }while (op != 0);
    }
}
