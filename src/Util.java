package src;
import javax.swing.JOptionPane;

public class Util {

    static Estoque estoque = new Estoque();

    public static void cadastrarProduto(){

        String nome, validade;
        int quantidade;

        nome = JOptionPane.showInputDialog(null, "Nome do produto para cadastro: ".trim());

        No aux = Estoque.pesquisar(nome);

        if(aux == null){
            
            validade = JOptionPane.showInputDialog("Data de validade do produto (yy/mm/dd):");
            quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade em estoque do produto: "));

            Produto produto = new Produto(nome, validade, quantidade);
            Estoque.inserir(produto);

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!");
        } else{
            JOptionPane.showMessageDialog(null, "Este produto já está no sistema!");
        }
    }
    
    public static void listarProdutos(){

        Estoque.imprimir();
        
    }


    }

      

