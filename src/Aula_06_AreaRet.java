import java.util.Scanner;
/**
 *
 * @author jefferson
 */
public class Aula_06_AreaRet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double lado1, lado2;
        
        System.out.println("Calculando a area do Retangulo:");
        System.out.println("Digite o lado 1 do retangulo e tecle Enter:");
        lado1 = in.nextDouble();
             
        System.out.println("Digite o lado 2 do retangulo e tecle Enter:");
        lado2 = in.nextDouble();
        
        double area = lado1 * lado2;
        
        System.out.println("Area do retangulo: " + area);
        
        
        
        
    }
}
