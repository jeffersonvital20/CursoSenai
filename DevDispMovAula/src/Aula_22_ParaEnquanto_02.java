public class Aula_22_ParaEnquanto_02 {
    public static void main(String[] args){
        int somafor=0,somawhile=0,j=0;

        for (int i=0 ; i<=1000;i++){
            somafor = somafor+i;
        }
        while (j<=1000){
            somawhile =somawhile+j;
            j++;
        }
        System.out.println(somafor+" "+somawhile);
    }
}
