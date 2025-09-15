public class batedeira extends Eletrodomesticos {

    private int potencia = 100;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public batedeira(String nome, String marca, double preço, String cor, int tensão, int potencia) {
        super(nome, marca, preço, cor, tensão);
        this.potencia = potencia;
    }
}
