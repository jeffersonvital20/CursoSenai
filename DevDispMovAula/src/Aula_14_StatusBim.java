import java.util.Scanner;

public class Aula_14_StatusBim {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double media;

        System.out.println("Qual a média do aluno?");
        media = in.nextDouble();

        if (media >= 7){
            System.out.println("O aluno foi aprovado com a media: "+media);
        }
        else if (media > 5){
            System.out.println("O aluno ficou de recuperação com a media: "+media);
        }else {
            System.out.println("O aluno foi reprovado com a media: "+media);
        }
    }
}
