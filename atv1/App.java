package atv1;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Cria a janela que mostra texto na tela - Biblioteca JOptionPane
        // Use o showMessageDialog para mostrar caixas de diálogo na tela
        JOptionPane teste = new JOptionPane();
        JOptionPane.showMessageDialog(teste, "Olá mundo", "TESTE", 0);

        // Cria uma String de nome valor e atribui o texto oi a ela. Cria outra String
        // valorDoInput e não atribui nada a ela
        String valor = "oi", valorDoInput;

        // Cria uma janela de entrada de dados utilizando o método showInputDialog
        // salva na variável valorDoInput o valor recebido na tela
        // O código (String) converte o valor digitado no campo de texto de JOptionPane
        // para String
        valorDoInput = (String) JOptionPane.showInputDialog(teste, valor);

        // Integer.parseInt() serve para converter o valor recebido na caixa da linha 19
        // para inteiro
        int valorInteiro = Integer.parseInt(valorDoInput);

        // Uma caixa de diálogo que mostrará a variável valorInteiro. As "" são uma
        // gambiarra para tornar o inteiro uma String sem ter de fazer conversões.
        JOptionPane.showMessageDialog(teste, valorInteiro + "", "TESTE", 0);

    }
}