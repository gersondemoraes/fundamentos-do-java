package core;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    // não existe polimorfismo sem herança e sem redefinição de comportamento
    // polimorfismo com a classe Conta Bancaria
    public boolean debitar(double valor) {
        if (super.saldo + this.limite >= valor) {
            super.saldo -= valor;
            return true;
        }
        return false;
    }

    public double getlimite() {
        return limite;
    }
    public void setlimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        return "ContaEspecial{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}


