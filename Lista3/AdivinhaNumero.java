package Lista3;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 1
//Aluno: Alan Ferreira de Souza
//ADS3 - 2024
 
public class AdivinhaNumero {
    @SuppressWarnings("static-access")
    public void main(String[] args){

        //Ir para menu:
        Lista3.Launcher menu = new Launcher();
        int opt1 = 0;
        //Até aqui

        int control = 0, num = 45, numInsert;
        Scanner in = new Scanner(System.in);
        System.out.println("\n\nAdvinhe um número de 1 a 100");
        
        do{
            System.out.print("\nInsira o número:   ");
            numInsert = in.nextInt();
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
        //Ir para menu
        System.out.println("\nDeseja realizar outra atividade?\n (1)Sim; (0)Não\n Opção:  ");
        opt1 = in.nextInt();
        if(opt1==1){
            menu.main(args);
        }else{
            System.out.println("Fim do sistema");
        }//Até aqui
        in.close();
    }
}