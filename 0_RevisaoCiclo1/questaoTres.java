import java.util.Scanner;

/**
 * questaoTres
 */
public class questaoTres {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, cont = 0;
        System.out.print("\n\nInsira um número inteiro positivo para determinar se é primo ou não: ");
        num = in.nextInt();

        //Teste 1: Identificar se é par
        if(num == 2){
            System.out.println("Número digitado "+num+" é PRIMO");
        }else if(num % 2 == 0){
            System.out.println("Número digitado "+num+" NÃO é PRIMO");
        }else{
            for(int i=num;i<num;i--){
                if(num/i == 0){
                    cont++;
                }
            }
        }

        

        in.close();
    }
}