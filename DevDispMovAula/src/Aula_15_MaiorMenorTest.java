import java.util.Scanner;

public class Aula_15_MaiorMenorTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1,n2,n3,maior,menor;
        System.out.println("Qual o primeiro numero?");
        n1 = in.nextInt();
        System.out.println("Qual o segundo numero?");
        n2 = in.nextInt();
        System.out.println("Qual o terceiro numero?");
        n3 = in.nextInt();
        menor = 0;
        maior = n1;
        if (maior > n2){
            menor = n2;
            if (menor > n3){
                menor = n3;
            }
        }
        else if (maior > n3) {
            menor = n1;
            if (menor > n2){
                menor = n2;
            }
        }
        else{
            menor = n1;
            if (n2>n3){
                maior = n2;
            }else{
                maior = n3;
            }
        }

        System.out.println("O maior: "+maior+", o menor: "+menor);

    }
}
