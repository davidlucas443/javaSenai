import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        microondas eletro = new microondas("Microondas","britania", 1000,"inox",110, 100);

        System.out.println(eletro.getNome()+" " +eletro.getMarca()+" " +eletro.getPreço()+" " +eletro.getCor()+" " + eletro.getTensão()+" " +eletro.getCapacidade());

        batedeira bat = new batedeira("Batedeira","britania",500,"branca",100,100);

        System.out.println(bat.getNome()+" " +bat.getMarca()+" " +bat.getPreço()+" " +bat.getCor()+ " " +bat.getTensão()+" " +bat.getPotencia());

    }


}
