package contaBancaria;

public class ContaPessoaJuridica extends Conta {

    private double tarifaPj = 20;
    private double taxa = 1.5;

    public ContaPessoaJuridica(int numero, int agencia, String titular, double saldo, double tarifaPj, double taxa) {
        super(numero, agencia, titular, saldo);
        this.tarifaPj = tarifaPj;
        this.taxa = taxa;
    }

    @Override
    void calcularTarifaMensal() {

    }

    @Override
    void calcularTarifaMensal(double saldo){
        double saldo1 = saldo - tarifaPj - 1.50;

    }

    public double getTarifaPj() {
        return tarifaPj;
    }

    public void setTarifaPj(double tarifaPj) {
        this.tarifaPj = tarifaPj;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
