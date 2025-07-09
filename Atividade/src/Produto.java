public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public void mostrarProdutos() {
        System.out.println("Produtos: " + nome + " por " + preco);
    }


//getters e setters

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    //Necessário para Chamar a lista de compras no adicionarProduto - Carrinho
    @Override
    public String toString() {
        return nome + " - R$" + String.format("%.2f", preco);
    }
}

