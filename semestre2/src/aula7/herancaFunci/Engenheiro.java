public class Engenheiro extends Funcionario {
    public Engenheiro(String nome, double salario, int rg, int numCrea) {
        super(nome, salario, rg);
        this.numCrea = numCrea;
    }

    private int numCrea;

    public int getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(int numCrea) {
        this.numCrea = numCrea;
    }


}
