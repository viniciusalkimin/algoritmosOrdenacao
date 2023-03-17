package SelectionSort;

public class SelectionSortMaisBarato {
    public static void main(String[] args) {


        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto("Lamborghini",1_000_000);
        produtos[1] = new Produto("Jeep", 46_000);
        produtos[2] = new Produto("Brasilia", 16_000);
        produtos[3] = new Produto("Smart" ,46_000);
        produtos[4] = new Produto("Fusca", 17_000);

        int menorValor = 0;
        for (int atual = 0; atual < 5; atual++) {
            if (produtos[atual].getPreco() < produtos[menorValor].getPreco()) {
                menorValor = atual;
            }
        }

        System.out.println("O mais barato é :" + produtos[menorValor]);
    }
}

