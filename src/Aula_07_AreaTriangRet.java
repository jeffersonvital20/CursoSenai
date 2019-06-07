
import java.util.Scanner;
/**
 *
 * @author jefferson
 */
public class Aula_07_AreaTriangRet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        double base, altura;        
        
        System.out.println("Calculando a Area do Triangulo:");
        System.out.println("Digite a base do triangulo e tecle Enter:");
        base = in.nextDouble();
             
        System.out.println("Digite a altura do triangulo e tecle Enter:");
        altura = in.nextDouble();
        
        double area2 = (base * altura)/2;
        
                
        System.out.println("Area do triangulo retangulo: " + area2);
        
        
        
    }
}
