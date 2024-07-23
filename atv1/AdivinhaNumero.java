package atv1;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 1
//Aluno: Alan Ferreira de Souza
//ADS3 - 2024
 
public class AdivinhaNumero {
    public void main(String[] args){
        int control = 0, num = 45, numInsert;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\nAdvinhe um número de 1 a 100");
        
        do{
            System.out.print("\nInsira o número:   ");
            numInsert = entrada.nextInt();
            if(numInsert < num){
                System.out.println("O número digitado "+numInsert+" é MENOR que o número definido, tente novamente");
            }else if(numInsert > num){
                System.out.println("O número digitado "+numInsert+" é MAIOR que o número definido, tente novamente");
            }else if(numInsert == num){
                System.out.println("O número digitado "+numInsert+" é o número definido, PARABÉNS!!");
                control = 1;
            }else{
                System.out.println("Erro 404, digite novamente");
            }
        }while(control == 0);
        entrada.close();
    }
}