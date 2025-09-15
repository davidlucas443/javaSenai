package contaBancaria;

abstract class Conta {

    private int numero;

    private int agencia;

    private String titular;

    private double saldo;

    public void exibirSaldo(){
        saldo = saldo;
    }

    abstract void calcularTarifaMensal();

    abstract void calcularTarifaMensal(double saldo);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }
}
