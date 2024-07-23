package Lista3;

import java.util.Scanner;

public class MenuInit {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Lista3.Launcher menu = new Launcher();
        Scanner in = new Scanner(System.in);
        int option1=0;
        System.out.print("Deseja realizar outra atividade?\n(1)Sim; (0)Não\n Opção:  ");
        option1 = in.nextInt();
        if(option1==1){
            menu.main(args);
        }else{
            System.out.println("Fim do sistema");
        }
        in.close();
    }
}
