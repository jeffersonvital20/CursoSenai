import java.util.Scanner;

public class Aula_19_Switch_Calc {
    public static void main(String[] args){
        double x,y;
        String op;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("|       Calculadora      |");
        System.out.println("--------------------------");
        System.out.println("Digite o primeiro número.");
        x = in.nextDouble();
        System.out.println("Digite o segundo número.");
        y = in.nextDouble();
        System.out.println("--------------------------");
        System.out.println("|  Selecione a operação  |");
        System.out.println("--------------------------");
        System.out.println("|    Somar   |     +     |");
        System.out.println("--------------------------");
        System.out.println("|  Diminuir  |     -     |");
        System.out.println("--------------------------");
        System.out.println("| Multiplicar|     *     |");
        System.out.println("--------------------------");
        System.out.println("|   Divisão  |     /     |");
        System.out.println("--------------------------");
        op = in.next();
        switch (op.toLowerCase()){
            case "+":
            case "somar":
                System.out.println("O resultado da soma é: "+(x+y));
            break;
            case "-":
            case "diminuir":
                System.out.println("O resultado da subtração é: " +( x - y));
            break;
            case "*":
            case "multiplicar":
                System.out.println("O resultado da multiplicação é: "+(x*y));
            break;
            case "/":
            case "divisao":
                if (y!=0)
                    System.out.println("O resultado da divisão é: "+(x/y));
                else if(x!=0)
                    System.out.println("O resultado da divisão é: "+(y/x));
                else
                    System.out.println("O numero não pode ser dividido por zero");
            break;
            default:
                System.out.println("Escolheu a opção errada burro!!");
            break;

        }

    }
}
