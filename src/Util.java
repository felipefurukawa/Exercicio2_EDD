package src;
import javax.swing.JOptionPane;

public class Util {

    No inicio;
    No fim;
    
    public static void cadastrarProduto() {
        
        String nome,validade;
                int quantidade;            
                nome = JOptionPane.showInputDialog("Nome do produto para cadastro: ").trim();
                validade = JOptionPane.showInputDialog("Data de validade do produto (yy/mm/dd):");
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque do produto: "));
                      
                Util.inserir(new Produto(nome,validade,quantidade));
    }

    public void inserir(Produto produto) {

        No aux = new No(produto);
        No existe = inicio;
        boolean achou  = false;
        
        while(existe!= null){
            if(existe.produto.getNome().equals(aux.produto.getNome())){
                JOptionPane.showMessageDialog(null,"Produto já cadastrado!");
                achou = true;
                break;
            }else{
                existe=existe.dir;
            } 



        



    }

      

}
