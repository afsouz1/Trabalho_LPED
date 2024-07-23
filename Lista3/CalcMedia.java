package Lista3;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 2
// Aluno: Alan Ferreira de Souza
// ADS3 - 2024

public class CalcMedia {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Lista3.MenuInit menu = new MenuInit();
        int num=0, soma=0, cont=0, media=0;
        System.out.println("\nInserir números inteiros positivos para calcular a média dos números inseridos, digitar -1 para finalizar");
        Scanner in = new Scanner(System.in);
        System.out.println("\nInserir números:");
        while(num >= 0){
            System.out.print("Número "+(cont+1)+": ");
            num = in.nextInt();
            if(num<0){
                break;
            }else{
                soma = num+soma;
                cont++;
            }
        }
        media = soma/cont;
        System.out.println("\nMédia dos "+cont+" números digitados: "+media+"\n\n");
        menu.main(args);        
        in.close();
    }
    
}