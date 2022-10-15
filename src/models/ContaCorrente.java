package models;

class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("======CONTA CORRENTE======");
        System.out.println(toString());
        System.out.println("==========================");
    }
}
