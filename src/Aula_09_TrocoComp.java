import java.util.Scanner;
/**
 *
 * @author jefferson
 */
public class Aula_09_TrocoComp {
    public static void main(String[] args){
        Scanner compra = new Scanner(System.in);        
        double pagamento, preco, troco;        
        System.out.println("---------------------");
        System.out.println("|Calculando o Troco:|");
        System.out.println("---------------------");
        System.out.println("Digite o valor pago e tecle Enter:");
        pagamento = compra.nextDouble();        
        System.out.println("Digite o valor da compra e tecle Enter:");
        preco = compra.nextDouble();
        
        troco = pagamento-preco;        
                
        System.out.println("Troco: " + troco);
        
        
        
    }
}
