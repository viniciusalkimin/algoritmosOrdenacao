package SelectionSort;

public class SelectionSortMaiorEMenor {
    public static void main(String[] args) {
        double[] salary = new double[4];
        salary[0] = 3_200;
        salary[1] = 6_000;
        salary[2] = 5_000;
        salary[3] = 2_200;

        double menorSalario = 0;
        double maiorSalario = 0;

        for (int i = 0; i < salary.length; i++) {
        if ( menorSalario == 0 || maiorSalario == 0) {
            menorSalario = salary[i];
            maiorSalario = salary[i];
        }
        if(salary[i] < menorSalario) {
            menorSalario = salary[i];
        }
        if(salary[i] > maiorSalario) {
            maiorSalario = salary[i];
        }
        }
        System.out.println("O maior salário é RS " + maiorSalario + " e o menor é R$ " + menorSalario);

    }
}
