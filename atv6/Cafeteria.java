package atv6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 6
// Aluno: Alan Ferreira de Souza
// ADS3 - 2024

/*
    Você é dono de uma cafeteria e está desenvolvendo um programa em JAVA para
    ser usado pelos funcionários. Esse programa receberá do funcionário o código do
    item conforme o cardápio a seguir e a quantidade desse produto. Considere que
    cada pedido será calculado com apenas um item de cada vez.

    Após a recepção dos dados faça:
        a) Mostre na tela a descrição do que foi pedido;
        b) Calcule e mostre o valor final do pedido recebido por esse funcionário.

    input:
        1 - Cód produto
        2 - Qtd

    output:
    cod: 101    item: Chás             valor:  5.99
    cod: 102    item: Cappuccino       valor: 15.99
    cod: 105    item: Chocolate Quente valor: 20.99
    cod: 200    item: Salgado          valor:  7.99

        1 - Descrição
        2 - Valor total
 */

public class Cafeteria {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        try {//comando CLEAR - APAGAR SE ESTIVER USANDO WINDOWS
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }//apagar até aqui

        int TAM=5;
        int cod[] = new int[TAM], qtd[] = new int[TAM], ctrl[] = new int[TAM], opt=1;
        double vlunit[] = new double[TAM],totalGeral=0;
        String prod[] = new String[TAM];
        @SuppressWarnings("unused")
        String enter, nome;
        //ctrl[] = [0,0,0,0,0];
        System.out.println("\n\n-------- SISTEMA DE COMPRAS - CAFETERIA IFTM --------");
        System.out.println("  Cadastrar Compras\n  Gerar Fatura");
        System.out.println("\n\n----------------- TABELA DE PREÇOS -----------------");
        System.out.println("cod: 101    item: Chás             valor:  5.99");
        System.out.println("cod: 102    item: Cappuccino       valor: 15.99");
        System.out.println("cod: 105    item: Chocolate Quente valor: 20.99");
        System.out.println("cod: 200    item: Salgado          valor:  7.99");
        System.out.println("\n----------------- REGISTRAR PEDIDO -----------------");
        System.out.print("Nome do cliente: ");
        
        nome = in.nextLine();

        for(int i=0;i<TAM;i++){
            if(opt==0)
                break;
            System.out.println("\n-----------------------------------------");
            System.out.println("Item "+(i+1));
            System.out.print("Insira o código do item:     ");
            cod[i] = in.nextInt();
            System.out.print("Insira a quantidade pedida:  ");
            qtd[i] = in.nextInt();
            System.out.print("\nDeseja inserir item na compra?\n (1)Sim;\n (0)Não\n Opção:  ");
            opt = in.nextInt();
            ctrl[i] = 1;
            if(cod[i]==101){
                vlunit[i] = 5.99;
                prod[i] = "Chás diversos";
            }else if(cod[i]==102){
                vlunit[i] = 15.99;
                prod[i] = "Cappuccino   ";
            }else if(cod[i]==105){
                vlunit[i] = 20.99;
                prod[i] = "Choclt Quente";
            }else if(cod[i]==200){
                vlunit[i] = 7.99;
                prod[i] = "Salgado      ";
            }else{
                System.out.println("----------------ERR1 = Código digitado não cadastrado----------------");
            }
        }
        System.out.print("Pressione ENTER para gerar a fatura....");

        try {// COMANDO LIMPAR BUFFER
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {// COMANDO CLEAR - APAGAR SE TIVER USANDO WINDOWS
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }// APAGAR ATÉ AQUI

        double vltotal[] = new double[TAM];
        System.out.println("\n\n\n---------------------FATURA DE CONSUMO------------------------------");
        System.out.println("Nome do cliente:  "+nome);
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data:  "+dataAtual);
        System.out.println("\n--Item----Descrição---------Qtd------Vl_Unit--------Vl_Total--------");
        
        for(int i=0;i<TAM;i++){
            if(ctrl[i]==1){
                vltotal[i]= vlunit[i]*qtd[i];
                totalGeral = vltotal[i]+totalGeral;
                System.out.print("  "+(i+1));
                System.out.print("      "+prod[i]);
                System.out.print("      "+qtd[i]);
                System.out.print("        R$"+vlunit[i]);
                System.out.println("        R$"+vltotal[i]);
            }        
        }
        System.out.println("----------------------------------TOTAL GERAL ...  R$"+totalGeral+"-----------");
        System.out.println("\n\nAssinatura do Cliente: _______________________________________");
        System.out.println("\n\nDeus é fiel\n\n\n");
        System.out.println("----------------------------------------------------------------------");
        in.close();
    }
}
