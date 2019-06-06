import java.util.Scanner;
/**
 *
 * @author jefferson
 */
public class Aula_04_baseScanner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o gasto de Janeiro:");
        double gastJan = in.nextDouble();
        System.out.println("Digite o gasto de Fevereiro:");
        double gastFev = in.nextDouble();
        System.out.println("Digite o gasto de Março:");
        double gastMar = in.nextDouble();
        
        double gastTotal = gastJan + gastFev + gastMar;
        
        System.out.println("O gasto trimestral foi: R$ " + gastTotal);
    }
}
