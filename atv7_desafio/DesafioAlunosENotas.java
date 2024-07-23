package atv7_desafio;
import java.util.Scanner;

// LPED - Lista 3 - Atividade 7 - Desafio
// Aluno: Alan Ferreira de Souza
// ADS3 - 2024

/*
    Você foi encarregado de desenvolver um programa em Java para determinar se os 
    alunos foram aprovados ou reprovados com base em suas notas em três disciplinas. O
    programa deve solicitar ao usuário que insira os dados de três alunos, incluindo seus 
    nomes, notas em cada disciplina e calcular se a média de cada aluno é maior ou igual 
    a 7. Se a média for maior ou igual a 7, o aluno é considerado aprovado; caso 
    contrário, é considerado reprovado.
    Além disso, é necessário garantir que não haja alunos com o mesmo nome. Caso dois 
    ou mais alunos tenham o mesmo nome, o programa deve exibir uma mensagem de 
    erro e solicitar que o usuário insira novamente os dados.
    Escreva um programa Java que realize as seguintes operações:
        1. Solicite ao usuário que insira os dados de três alunos, incluindo o nome de cada 
        aluno, as notas em três disciplinas (por exemplo, Matemática, Ciências e Português).
        2. Verifique se há alunos com o mesmo nome.
        3. Calcule a média das notas de cada aluno.
        4. Determine se cada aluno foi aprovado ou reprovado com base em sua média.
        5. Exiba o nome de cada aluno, suas notas em cada disciplina, a média e se foram 
        aprovados ou reprovados.
 */

public class DesafioAlunosENotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TAM = 3;
        String nome[] = new String[TAM],status[] = new String[TAM];
        float nota1[] = new float[TAM],nota2[] = new float[TAM],nota3[] = new float[TAM], media[] = new float[TAM];
        
        System.out.println("\n\n\nCadastrar Alunos e Notas: ");
        for(int i=0;i<TAM;i++){
            //if(i!=0){
            //    in.nextLine();
            //}
            System.out.print("\nNome do aluno "+(i+1)+":      ");
            nome[i] = in.next();
            System.out.println("Nome inserido: "+nome[i]);
            String nomeGravar = nome[i];
            int controle = 0;
            int setFim = i;
            for(int j=0;j<setFim;j++){
                if(nomeGravar.equals(nome[j])){
                    System.out.println("\nErro - nome inserido já no banco de dados, refaça a operação\n");
                    controle = 1;
                }
            }
            if(controle==1){
                i--;
            }else{
                System.out.print("Nota de Matemática:  ");
                nota1[i] = in.nextFloat();
                System.out.print("Nota de Ciências:    ");
                nota2[i] = in.nextFloat();
                System.out.print("Nota de Português:   ");
                nota3[i] = in.nextFloat();
                media[i] = ((nota1[i]+nota2[i]+nota3[i])/TAM);
            }
        }

        for(int i=0;i<TAM;i++){
            if(media[i]<7){
                status[i] = "Reprovado";
            }else if(media[i]>=7){
                status[i] = "Aprovado";
            }else{
                System.out.println("Err001 - refaça a operação");
                break;
            }
        }
        System.out.println("\n\nResultado:");

        for(int i=0;i<TAM;i++){
            System.out.println("\nAluno   "+nome[i]);
            System.out.println("Média:  "+media[i]);
            System.out.println("Status: "+status[i]);
        }
        System.out.println("\n\n\n");

        in.close();
    }
    
}
