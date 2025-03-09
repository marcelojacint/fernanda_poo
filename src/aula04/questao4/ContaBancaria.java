package aula04.questao4;

public class ContaBancaria {

    private double saldo;

    private Cliente cliente;

    public ContaBancaria() {
        saldo = 0;
    }

    public ContaBancaria(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String consultarSaldo() {
        if (cliente != null) {
            return String.format("%.2f", saldo);
        }
        return "Usuário não cadastrado!";
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor insuficiente!");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
        } else {
            System.out.println("saque falhou!");
        }
    }

    public void transferir(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("Transferido com sucesso!");
        } else {
            System.out.println("transferência falhou!");
        }

    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
