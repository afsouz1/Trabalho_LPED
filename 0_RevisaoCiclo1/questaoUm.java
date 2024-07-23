import java.util.Scanner;

/**
 * questaoUm
 */
public class questaoUm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade = 0;

        System.out.print("\n\nInsira sua idade:  ");
        idade = in.nextInt();
        if (idade <13) {
            System.out.println("\nIdade "+idade+" classificada como CRIANÇA\n\n");
        }else if(idade <=17){
            System.out.println("\nIdade "+idade+" classificada como ADOLESCENTE\n\n");
        }else if(idade <=64){
            System.out.println("\nIdade "+idade+" classificada como ADULTO\n\n");
        }else if(idade >64){
            System.out.println("\nIdade "+idade+" classificada como IDOSO\n\n");
        }else{
            System.out.println("ERRO");
        }

        in.close();
    }
}