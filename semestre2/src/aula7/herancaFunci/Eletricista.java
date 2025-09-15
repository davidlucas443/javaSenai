public class Eletricista extends Funcionario {
    private boolean nr10;


    public Eletricista(String nome, double salario, int rg, boolean nr10) {
        super(nome, salario, rg);
        this.nr10 = nr10;
    }
        @Override
        public double calculoSalario(double salario) {
            return salario = salario - 100 + 1000;
        }
}
