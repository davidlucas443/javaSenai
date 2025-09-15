public class Funcionario {
    private String nome;
    private double salario;
    private int Rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getRg() {
        return Rg;
    }

    public Funcionario(String nome, double salario, int rg){
        this.nome = nome;
        this.salario = salario;
        this.Rg = rg;
    }

    @Override
    public String toString() {
        return "herancaFunci.Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", Rg=" + Rg +
                '}';
    }

    public void setRg(int rg) {
        Rg = rg;
    }

    public double calculoSalario(double salario){
        return salario = salario-100;
    }
}

