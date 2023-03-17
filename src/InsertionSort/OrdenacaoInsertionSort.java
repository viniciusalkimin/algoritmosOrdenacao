package InsertionSort;

public class OrdenacaoInsertionSort {
    public static void main(String[] args) {

//        int[] produtosD = new int[5];
//        produtosD[0] = 13;
//        produtosD[1] = 3;
//        produtosD[2] = 1;
//        produtosD[3] = 5;
//        produtosD[4] = 6;

        double[] produtosD = new double[5];
        produtosD[0] = 1000000.0;
        produtosD[1] = 46000.0;
        produtosD[2] = 16000.0;
        produtosD[3] = 46000.0;
        produtosD[4] = 17000.0;

        for (int atual = 0; atual < produtosD.length; atual++) {
            int analise = atual;
            while (analise - 1 >= 0 && produtosD[analise] < produtosD[analise - 1]) {
                double aux = produtosD[analise - 1];
                produtosD[analise - 1] = produtosD[analise];
                produtosD[analise] = aux;
                analise--;
            }
        }

        for (double d : produtosD) {
            System.out.println(d);
        }

    }

//        for (int atual = 1; atual < produtosD.length; atual++) {
//            int anterior = atual - 1;
//            while (anterior >=0 && produtosD[atual] < produtosD[anterior]) {
//                double aux = produtosD[anterior];
//                produtosD[anterior] = produtosD[atual];
//                produtosD[atual] = aux;
//                anterior--;
//            }
//        }
}

