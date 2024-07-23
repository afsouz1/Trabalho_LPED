package Lista3;
import java.util.Scanner;

public class Launcher {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Lista3.AdivinhaNumero atv1 = new AdivinhaNumero();
        Lista3.CalcMedia atv2 = new CalcMedia();
        Lista3.ImprimirNumerosImpares atv3 = new ImprimirNumerosImpares();
        Lista3.ImprimirNumAnteriores atv4 = new ImprimirNumAnteriores();
        Lista3.CalcularIdades atv5 = new CalcularIdades();
        Lista3.Cafeteria atv6 = new Cafeteria();
        Lista3.DesafioAlunosENotas atv7 = new DesafioAlunosENotas();

        int option=0;
        Scanner in = new Scanner(System.in);
        System.out.println("\n\n----MAIN MENU---------------");
        System.out.print("Selecione a atividade desejada:\n (1)Atividade 1;\n (2)Atividade 2;\n (3)Atividade 3;\n (4)Atividade 4;\n (5)Atividade 5;\n (6)Atividade 6;\n (7)Atividade 7;\n Opção:  ");
        option = in.nextInt();
        switch (option) {
            case 1:
                atv1.main(args);
                break;
            case 2:
                atv2.main(args);
                break;
            case 3:
                atv3.main(args);
                break;
            case 4:
                atv4.main(args);
                break;
            case 5:
                atv5.main(args);
                break;
            case 6:
                atv6.main(args);
                break;
            case 7:
                atv7.main(args);
                break;
            default:
                System.out.println("ERR001 - Opção inválida.");
                break;
        }
        in.close();
    }
    
}
