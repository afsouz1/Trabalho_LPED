package atv5;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 5
// Aluno: Alan Ferreira de Souza
// ADS3 - 2024

/*
    Faça um algoritmo que permita ao usuário informar a idade de quantas pessoas  ele
    desejar. Após isso, o algoritmo deve informar a quantidade de pessoas com  mais
    de 18 anos e a média de idade das pessoas com mais de 18 anos.
 */

public class CalcularIdades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, cont=0, soma=0, media=0;
        System.out.println("\nInserir as idades, digite -1 para sair");
        do{
            System.out.print("\nInsira a idade: \n");
            idade = in.nextInt();
            if(idade>18){
                cont++;
                soma = idade + soma;
            }
        }while(idade>=0);
        media = soma/cont;
        System.out.println("\nResultados:\n (a)Média das idades >18: "+media+" anos;\n (b)Quantidade de pessoas >18: "+cont+" pessoas;\n\n");
        in.close();
    }
}
