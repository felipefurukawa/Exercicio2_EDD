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
        } else {
            JOptionPane.showMessageDialog(null, "Este produto já está no sistema!");
        }
    }
    
    public static void listarProdutos(){

        Estoque.imprimir();
        
    }

    public static void VenderProduto(){

        String nome = JOptionPane.showInputDialog("Nome do produto a ser vendido: ");
        No aux = Estoque.pesquisar(nome);

        if(aux == null){

            JOptionPane.showMessageDialog(null, "O produto digitado não foi encontrado 🙃");

        } else{

            JOptionPane.showMessageDialog(null, "Produto: " + aux.produto.nome +
                "\nData de validade: " + aux.produto.validade + "\nQuantidade em estoque: " + 
            aux.produto.estoque);

            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual será a quantidade de produtos a ser vendida? "));

            if(quantidade > aux.produto.estoque) {

                JOptionPane.showMessageDialog(null, "A quantidade inserida ultrapassa nossa disponibilidade 😰");
           
            } else {

                aux.produto.reduzirEstoque(quantidade);

                JOptionPane.showMessageDialog(null, "A venda foi um sucesso! 🤑");

                if(aux.produto.estoque == 0) {
                    Estoque.Remover(nome);
                }
            }
        }
    }
}

      

