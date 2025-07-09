public class Loja {
    protected IMetodoPagamento pagamento; // Interface no Construto, Alterar forma na Main

    public Loja(IMetodoPagamento pagamento){
        this.pagamento = pagamento;
    }

    public void realizarCompra(double valor){
        pagamento.realizarPagamento(valor);// Chama as classes das classes da interface

    }

}
