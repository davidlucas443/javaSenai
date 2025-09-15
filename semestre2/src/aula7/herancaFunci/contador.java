public class contador extends Funcionario {

    private int numCrc;

    public int getNumCrc() {
        return numCrc;
    }

    public void setNumCrc(int numCrc) {
        this.numCrc = numCrc;
    }

    public contador(String nome, double salario, int rg, int numCrc) {
        super(nome, salario, rg);
        this.numCrc = numCrc;
    }
}
