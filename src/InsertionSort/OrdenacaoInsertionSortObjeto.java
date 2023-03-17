package InsertionSort;

import SelectionSort.Produto;

public class OrdenacaoInsertionSortObjeto {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jeep", 46000);
        produtos[2] = new Produto("Brasilia", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);

        for (int atual = 0; atual < produtos.length; atual++) {
            int analise = atual;
            while (analise - 1 >= 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                Produto pAtual = produtos[analise];
                Produto pAnterior = produtos[analise - 1];
                produtos[analise - 1] = pAtual;
                produtos[analise] = pAnterior;
                analise--;

            }
        }

        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - " + p.getPreco());
        }
    }
}
