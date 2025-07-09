import java.io.*;
import java.lang.Thread;

public class PagamentoPix implements IMetodoPagamento {

    public void realizarPagamento(double valor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted!");
        }
        System.out.println("Compra realizada");
    }
}
