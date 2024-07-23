import java.util.Scanner;

public class questaoQuatro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, calc = 0;
        System.out.println("\n\nInsira um número INTEIRO POSITIVO para imprimir a tabuada de 1 a 10: \n");
        num = in.nextInt();
        for(int i=0;i<10;i++){
            calc = num*(i+1);
            System.out.println(num+"x"+(i+1)+"="+calc);
        }
        in.close();
    }
}