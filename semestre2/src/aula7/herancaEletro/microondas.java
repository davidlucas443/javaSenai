public class microondas extends Eletrodomesticos {

    private int capacidade = 10;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public microondas(String nome, String marca, double preço, String cor, int tensão, int capacidade) {
        super(nome, marca, preço, cor, tensão);
        this.capacidade = capacidade;
    }
}


