import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    //Construtor

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        for (Produto produtoMostrar : produtos) {
            System.out.println("Lista de compra: " + produtoMostrar);
        }
    }

    //Adição de dados num Array/List
    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        System.out.println(total);
        return total;
    }

}

