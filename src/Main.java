import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael Batista");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.depositar(100);
        System.out.println("Antes da transferencia");
        cc.imprimirExtrato();
        cp.imprimirExtrato();


        cc.transferir(cp, 100);

        System.out.println("Depois da transferencia");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}