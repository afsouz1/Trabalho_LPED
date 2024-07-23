package atv4;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 4
// Aluno: Alan Ferreira de Souza
// ADS3 - 2024

public class ImprimirNumAnteriores {
    public static void main(String[] args) {
        int num=0;
        Scanner in = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro positivo maior do que zero: ");
        num = in.nextInt();
        if(num>0){
            System.out.println("Número digitado: "+num);
            while(num>0){
                System.out.println("Número anterior: "+(num-1));
                num--;
            }
        System.out.println("\nFim do sistema. Obrigado\n\n");
        }else{
            System.out.println("\nErro 404: Caractere digitado inválido, refaça a operação.\n\n");
        }
        in.close();
    }
}
