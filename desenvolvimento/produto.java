package sample;
import sample.model.produto;


public class Main {




    public static void main(String[] args) {

        produto produto = new produto();
        produto.setNome("Laranja");
        produto.setPreço("3,50");

        System.out.println(produto);
    }
}


package sample.model;

public class produto {
    private String nome;
    private double preço;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
