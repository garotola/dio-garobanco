package models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void addConta(Conta conta){
        contas.add(conta);

    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Conta> listaDeContasCorrente(){
        return contas.stream().filter(conta -> conta instanceof ContaCorrente).collect(Collectors.toList());
    }

    public List<Conta> listaDeContasPoupanca(){
        return contas.stream().filter(conta -> conta instanceof ContaPoupanca).collect(Collectors.toList());
    }

    public List<Conta> listaDeClienteDeUmaAgencia(int agencia){
        return contas.stream().filter(conta -> conta.agencia == agencia).collect(Collectors.toList());
    }

    public Conta criarContaCorrente(Cliente cliente){
        Conta conta =  new ContaCorrente(cliente);
        addConta(conta);
        return conta;
    }

    public Conta criarContaPoupanca(Cliente cliente){
        Conta conta = new ContaPoupanca(cliente);
        addConta(conta);
        return conta;
    }


}
