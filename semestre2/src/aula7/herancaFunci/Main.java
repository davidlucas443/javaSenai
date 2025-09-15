public class Main {
    public static void main(String[] args) {

        contador cont = new contador("David",2000, 288123, 2324);

        Engenheiro eng = new Engenheiro("denis", 7500,31313142, 3132);

        Eletricista eletr = new Eletricista("David",2000, 288123,false);

        System.out.println(eng.getNome());
        eng.setNome("Heitor");

        System.out.println(eng.getNome() + " " + eng.getSalario() +  " " + eng.getRg() + " " + eng.getNumCrea());

        System.out.println(eletr.calculoSalario(2000));

        System.out.println(cont.calculoSalario(2000));
    }

}