
import java.util.Scanner;
/**
 *
 * @author jefferson
 */
public class Aula_08_MedBim {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        
        
        System.out.println("Calculando a Media Anual:");
        System.out.println("Digite a nota 1 e tecle Enter:");
        nota1 = in.nextDouble();
        
        System.out.println("Digite a nota 2 e tecle Enter:");
        nota2 = in.nextDouble();
        
        System.out.println("Digite a nota 3 e tecle Enter:");
        nota3 = in.nextDouble();
        
        System.out.println("Digite a nota 4 e tecle Enter:");
        nota4 = in.nextDouble();        
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("Media Anual: " + media);
        
        if (media<5) {
        	System.out.println("O aluno esta reprovado");
        } 
        else if (media<=7) {
            System.out.println("O aluno esta de recuperacao");
        }
        else{
            System.out.println("O aluno esta aprovado");
        }
     
    }
}
