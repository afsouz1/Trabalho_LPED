

/*
    Leia um valor em ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser
decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50,
0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas e moedas necessárias.
 */

import java.util.Scanner;

public class MoedasENotas {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = 0.00;
        int nota5 = 5, nota10 = 10, nota20 = 20, nota50 = 50, nota100 = 100, calc = 0;
        System.out.print("\n\nInsira um valor monetário para dividi-lo em notas e moedas:");      
        num = in.nextDouble();

        

        
        in.close();
    }
    
}
