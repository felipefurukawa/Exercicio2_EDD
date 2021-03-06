package src;

import javax.swing.JOptionPane;

public class Estoque {
    
    static No inicio;
    static No fim;

    static int tamanhoEstq;

    public static void inserir(Produto produto) {

        No aux = new No(produto);

        No aux2 = inicio;
        int cont = 0;

        if(inicio == null){
            inicio = aux;
            fim = aux;
        } else if (aux.produto.validade.compareTo(fim.produto.validade) >= 0) {
            
            aux.esq = fim;
            fim.dir = aux;
            fim = aux;

        } else if (aux.produto.validade.compareTo(inicio.produto.validade) <= 0) {
            
            aux.dir = inicio;
            inicio.esq = aux;
            inicio = aux;

        } else {

            while (aux.produto.validade.compareTo(aux2.produto.validade) <= 0) {

				aux2 = aux2.dir;
				cont++;
			}
		aux2 = inicio;
		for(int i = 0; i < cont-1; i++) {
			aux2 = aux2.dir;
		}
        
        aux.esq = aux2;
		aux2.dir.esq = aux;
		aux.dir = aux2.dir;
		aux2.dir = aux;
        aux2 = aux2.dir;
        
		
		}
    }

    public static No pesquisar(String nome){
        No aux = inicio;
        boolean achou = false;
        while(aux != null && !achou){
            if (aux.produto.nome.equals(nome)){
                achou = true;
            } else{
                aux = aux.dir;
            }
        }
        return aux;
    }

    public static void imprimir(){

        No aux = inicio;
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Nenhum produto cadastrado!");
        }
            while(aux != null){
                JOptionPane.showMessageDialog(null,aux.produto);
                aux = aux.dir;
            }
    }

    public static boolean Remover(String nome){

        No aux = pesquisar(nome);
        boolean removido = false;

        if(aux != null){
            if(aux == inicio && aux == fim){
                aux.dir = null;
                aux.esq = null;
                inicio = null;
                fim = null;
            } else if(aux == inicio){
                inicio = aux.dir;
                inicio.esq = null;
                aux.dir = null;
            } else if(aux == fim){
                fim = aux.esq;
                fim.dir = null;
                aux.esq = null;
            } else {
                aux.esq.dir = aux.dir;
                aux.dir.esq = aux.esq;
                aux.dir = null;
                aux.esq = null;
            }
            removido = true;
        }
        return removido;
    }




}
