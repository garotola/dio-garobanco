package models;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;
    protected Integer agencia;
    protected Integer numero;
    protected double saldo;
    protected Cliente cliente;
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = ++SEQUENCIAL;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            //System.out.println("Saque realizado");
        }else{
            throw new IllegalArgumentException("Saque não corresponde ao saldo disponivel.");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        try{
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência Realizada");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Transferência não realizada");
        }catch (NullPointerException e){
            System.out.println("Conta Destino Inexistente");
            System.out.println("Transferência não realizada");
        }
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Conta : \n" +
                "Titular : " + cliente.getNome() +
                "\nAgencia=" + agencia +
                "\nNumero=" + numero +
                "\nSaldo=" + saldo;

    }
}
