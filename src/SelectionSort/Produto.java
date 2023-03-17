package SelectionSort;

public class Produto {
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(Produto produtoo) {
        this.nome = produtoo.getNome();
        this.preco = produtoo.getPreco();
    }

    public String getNome() {
        return nome;
    }
}
