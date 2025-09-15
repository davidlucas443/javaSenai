package contaBancaria;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }
    @Override
    void calcularTarifaMensal() {
    }

    @Override
    void calcularTarifaMensal(double saldo) {

    }
}
