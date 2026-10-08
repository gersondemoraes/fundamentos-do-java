package core;

public class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular) {
        super();
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    // polimorfimso com a classe ContaEspecial
    public boolean debitar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

//    public void setNumero(int numero) {
//        this.numero = numero;
//    }

    public String getTitular() {
        return titular;
    }

//    public void setTitular(String titular) {
//        this.titular = titular;
//    }

    public double getSaldo() {
        return saldo;
    }

//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }

    public String toString() {
        return "Conta Bancária[numero=" + numero + ", " +"titular=" + titular +", " +"saldo=" + saldo + "]";
    }
}
