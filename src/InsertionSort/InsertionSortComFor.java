package InsertionSort;

public class InsertionSortComFor {
    public static void main(String[] args) {

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
}
