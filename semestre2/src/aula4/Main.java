
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> banco = new ArrayList<>();

        ArrayList<Pessoa> cache = new ArrayList<>();

        banco.add(new Pessoa("David", 1, 18));
        banco.add(new Pessoa("Vitor", 2, 21));
        banco.add(new Pessoa("Caue", 3, 18));
        banco.add(new Pessoa("kenps", 4, 30));
        banco.add(new Pessoa("Ryan", 5, 18));




        System.out.println("Digite uma opção");
        int opcao = sc.nextInt();

        Pessoa encontrada = null;

        switch(opcao) {

            case 1 :
                System.out.println("Qual o id que você deseja acessar?");
                int idBusca = sc.nextInt();
            for (Pessoa p : banco) {

                if (p.getId() == idBusca) {

                    encontrada = p;
                    break;

                }
            }

            if (encontrada != null) {

                cache.add(encontrada);
                System.out.println("Pessoa buscada no banco e adicionada ao cache");

            }



            break;

            case 2 :
                System.out.println("Qual o id que você deseja acessar?");
              int idBuscada = sc.nextInt();
            Pessoa achada = null;

            for (Pessoa j : cache) {

                if (j.getId() == idBuscada) {

                    achada = j;
                    System.out.println("Pessoa encontrada no cache" + achada);
                    break;

                }

        }
            break;
            default:
                System.out.println("Saindo");

                break;
        }

        }
        }




