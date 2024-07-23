package Lista3;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 3
// Aluno: Alan Ferreira de Souza
// ADS3 - 2024

public class ImprimirNumerosImpares {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Lista3.MenuInit menu = new MenuInit();
        @SuppressWarnings("unused")
        int num=100, opt=0;
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nImprimir números ímpares de 100 a 200:\nDigite 1 para iniciar:   ");
        opt = in.nextInt();
        while(num<=200){
            if(num%2!=0){
                System.out.println(num);
            }
            num++;
        }
        menu.main(args); 
        in.close();
    }
}