import models.*;

public class Main {
    public static void main(String[] args) {
        Banco banpara = new Banco("Banpara");
        Cliente cliente = new Cliente("Rafael Batista");

        Conta cp1 = banpara.criarContaPoupanca(cliente);
        Conta cp2 = banpara.criarContaPoupanca(cliente);

        System.out.println(banpara.getContas());
    }
}