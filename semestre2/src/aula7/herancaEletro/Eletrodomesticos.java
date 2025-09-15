public class Eletrodomesticos {

    private String nome;
    private String Marca;
    private double preço;
    private String cor;
    private int tensão;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTensão() {
        return tensão;
    }

    public Eletrodomesticos(String nome, String marca, double preço, String cor, int tensão) {
        this.nome = nome;
        Marca = marca;
        this.preço = preço;
        this.cor = cor;
        this.tensão = tensão;
    }

    public void setTensão( int tensão) {
        this.tensão = tensão;


    }
}
