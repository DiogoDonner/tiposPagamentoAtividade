public class PagamentoCartaoCredito implements IMetodoPagamento {
    public void realizarPagamento(double valor) {
        if (valor < 1000) {
            System.out.println("Compra Aprovada");
        } else {
            System.out.println("Compra recusada");
        }

    }
}
