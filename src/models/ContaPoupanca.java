package models;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("======CONTA POUPANÇA======");
        System.out.println(toString());
        System.out.println("==========================");
    }
}

