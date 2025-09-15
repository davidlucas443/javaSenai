package contaBancaria;

public class ContaCorrente extends Conta {

        private double tarifaCC = 12;

    public ContaCorrente(int numero, int agencia, String titular, double saldo, double tarifaCC) {
        super(numero, agencia, titular, saldo);
        this.tarifaCC = tarifaCC;
    }

    @Override
    void calcularTarifaMensal() {

    }


    @Override
        void calcularTarifaMensal(double saldo)
    {
             double saldo1 = saldo =- tarifaCC;
    }

    public double getTarifaCC() {
        return tarifaCC;
    }

    public void setTarifaCC(double tarifaCC) {
        this.tarifaCC = tarifaCC;
    }
}
