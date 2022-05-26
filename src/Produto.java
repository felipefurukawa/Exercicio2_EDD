package src;

public class Produto {

        String nome;
        String validade;
        int estoque;
        
        public Produto(String nome, String validade, int estoque) {
            this.nome = nome;
            this.validade = validade;
            this.estoque = estoque;
        }
        
        public Produto(String nome) {
            this.nome = nome;
        }
        
        
        public void reduzirEstoque(int quantidade) {
            estoque = estoque - quantidade;
        }
    
        
        @Override
        public String toString() {
            String dados = "";
            dados += "Nome = " + this.nome + "\n";
            dados += "Validade = " + this.validade + "\n";
            dados += "Estoque = " + this.estoque + "\n";
            dados += "-----------" + "\n";
            return dados;
        }
    }


