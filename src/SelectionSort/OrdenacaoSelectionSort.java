package SelectionSort;

public class OrdenacaoSelectionSort {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jeep", 46000);
        produtos[2] = new Produto("Brasilia", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);

        Double[] produtosD = new Double[5];
        produtosD[0] = 1000000.0;
        produtosD[1] = 46000.0;
        produtosD[2] = 16000.0;
        produtosD[3] = 46000.0;
        produtosD[4] = 17000.0;

        for(int atual = 0; atual < produtos.length; atual++) {
            int menor = atual;
            for(int i = atual + 1; i < produtos.length; i++) {
                if (produtos[i].getPreco() < produtos[menor].getPreco()) {
                    menor = i;
                }
            }
            Produto prodMenor = produtos[menor];
            Produto prodAtual = produtos[atual];
            produtos[atual] = prodMenor;
            produtos[menor] = prodAtual;
        }

        for(Produto produto : produtos) {
            System.out.println(produto.getNome() +" - " + produto.getPreco());
        }

    }
}
