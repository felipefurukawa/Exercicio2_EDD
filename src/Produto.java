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
        
        
        public void reduzirEstoque(int quantidade) {
            estoque = estoque - quantidade;
        }
    
        @Override
        public String toString() {
            return "-----Produto-----\nNome: " + nome + "\nEstoque: " + estoque + "\nValidade: " + validade;
        }
    }


