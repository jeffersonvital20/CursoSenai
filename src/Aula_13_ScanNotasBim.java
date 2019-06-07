import java.util.Scanner;

public class Aula_13_ScanNotasBim {
    public static void main(String[] args){
        double media,n1,n2,n3,n4;
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a nota da N1?");
        n1 = in.nextDouble();
        System.out.println("Qual a nota da N2?");
        n2 = in.nextDouble();
        System.out.println("Qual a nota da N3?");
        n3 = in.nextDouble();
        System.out.println("Qual a nota da N4?");
        n4 = in.nextDouble();
        media = (n1+n2+n3+n4)/4;
        if (media >= 7) {
            System.out.println("O aluno foi aprovado com a média: "+media);
        }else{
            System.out.println("O aluno foi reprovado com a média: "+media);
        }

    }
}
