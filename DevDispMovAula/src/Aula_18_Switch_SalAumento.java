import java.util.Scanner;

public class Aula_18_Switch_SalAumento {
    public static void main(String[] args){
        double salario,aumento;
        String cargo;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("|   cargos      |  Aumento    |");
        System.out.println("-------------------------------");
        System.out.println("|   Tecnico     |    50 %     |");
        System.out.println("|   gerente     |    30 %     |");
        System.out.println("|   Outros      |    20 %     |");
        System.out.println("-------------------------------");
        System.out.println("Qual o salario?");
        salario = in.nextDouble();
        System.out.println("Qual o cargo?");
        cargo = in.next();

        switch (cargo.toLowerCase()){
            case "tecnico" :
                aumento =salario * 0.5;
                salario += aumento;
                System.out.println("O seu novo salario é :"+salario+"o aumento foi de "+aumento);
            break;
            case "gerente" :
                aumento =salario * 0.3;
                salario += aumento;
                System.out.println("O seu novo salario é :"+salario+"o aumento foi de "+aumento);
                break;
            default:
                aumento =salario * 0.2;
                salario += aumento;
                System.out.println("O seu novo salario é :"+salario+"o aumento foi de "+aumento);
                break;
        }
    }
}
