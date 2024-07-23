import java.util.Scanner;

/**
 * questaoDois
 */
public class questaoDois {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anos = 0, meses = 0, dias = 0, calc = 0;
        System.out.println("\n\nInsira a sua idade em Anos, Meses e Dias: \n");
        System.out.print(" Anos:  ");
        anos = in.nextInt();
        System.out.print(" Meses: ");
        meses = in.nextInt();
        System.out.print(" Dias:  ");
        dias = in.nextInt();

        calc = (anos*360)+(meses*30)+dias;

        System.out.println("\n\nVocê tem "+calc+" dias vividos (até o momento)\n\n");
        in.close();
    }
}