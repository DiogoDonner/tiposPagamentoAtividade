import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        IMetodoPagamento metodoPagamento = new PagamentoCartaoCredito(); // ou PagamentoBoleto, etc.
        Loja minhaLoja = new Loja(metodoPagamento);
        // Chamadas das classes e interfaces


        Produto p1 = new Produto("Calca", 150.50);
        Produto p2 = new Produto("Bermuda", 99.00);

        //Adição de Produtos

        p1.mostrarProdutos();
        p2.mostrarProdutos();

        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p1);
        minhaLoja.realizarCompra(carrinho.calcularTotal());

        //Comandos para as classes


    }
}