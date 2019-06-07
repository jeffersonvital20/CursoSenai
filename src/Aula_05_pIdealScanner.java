import java.util.Scanner;
/**
 *
 * @author jefferson
 */
public class Aula_05_pIdealScanner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a sua altura:");
        
        double altura = in.nextDouble(), pIdeal_m, pIdeal_f;
        
        pIdeal_m = (72.7 * altura) - 58;
        pIdeal_f = (62.1 * altura) - 44.7;
        
        System.out.println("Resultado masculino: " + pIdeal_m);
        System.out.println("Resultado feminino: " + pIdeal_f);
    }
}
