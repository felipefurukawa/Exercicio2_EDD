package src;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String input;
        String menu = menu();
        boolean exit = false;

        while (!exit) {
            input = JOptionPane.showInputDialog(menu());
            try {
                switch(input) {
					case "1":
						Util.cadastrarProduto();
						break;
					case "2":
						Util.listarProduto();
						break;
					case "3":
						Util.VenderProduto();
						break;
                	case "4":
						exit = true;
						break;
					default:
                    JOptionPane.showMessageDialog(null,"Comando inválido! \nPor favor digite um numero entre 1 e 4");
                    throw new UnsupportedOperationException();
                }
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null,"Aplicação finalizada!");
    }

    public static String menu(){

        String aux = "Mercearia FESTA DO FIGO";
               aux += "\n1. Cadastrar produto";
               aux += "\n2. Listar produtos";
               aux += "\n3. Vender produto";
               aux += "\n4. Encerrar aplicação";
             
        return aux;
    }
}