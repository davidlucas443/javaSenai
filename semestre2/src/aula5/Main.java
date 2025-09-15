package Chache_banco;

import java.util.ArrayList;
import java.util.Scanner;

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
        banco.add(new Pessoa("Deivao", 6, 18));
        banco.add(new Pessoa("Vitinho", 7, 21));
        banco.add(new Pessoa("Felipe", 8, 18));
        banco.add(new Pessoa("Erik", 9, 30));
        banco.add(new Pessoa("Gabriel", 10, 18));
        banco.add(new Pessoa("Heitor", 11, 18));

        if(banco.size() > 10 ) {

            banco.remove(1);
        }

        System.out.println("---Bem-vindo ao Deivao-Bank---");

        while (true) {

            System.out.println("Informe seu id");
            int idBusca = sc.nextInt();

            Pessoa encontrada = null;


            for (Pessoa p : banco) {

                if (p.getId() == idBusca) {

                    encontrada = p;
                    break;
                }
            }

            if (encontrada != null) {

                cache.add(encontrada);
                System.out.println("Buscado no banco e adicionado ao cache");
                for(Pessoa p : cache) {
                    System.out.println(p);
                }
            } else {

                System.out.println("id inválido, tente novamente");
                continue;
            }

            System.out.println("Deseja verificar se seu id foi salvo no cache ?(sim/nao)");
            String opcao = sc.next();

            if (opcao.equalsIgnoreCase("sim") || opcao.toLowerCase().startsWith("s")) {

                while (true) {
                    System.out.println("Confirme seu id");
                    int idBuscada = sc.nextInt();

                    Pessoa achada = null;

                    for (Pessoa j : cache) {


                        if (j.getId() == idBuscada) {

                            achada = j;
                            System.out.println("Pessoa encontrada no cache");
                            System.out.println("Muito obrigado por usar nossos serviços");
                            return;

                        } else {

                            System.out.println("Esse não e o seu id");
                            break;
                        }
                    }
                }
            }
            else if (opcao.equalsIgnoreCase("não") || opcao.toLowerCase().startsWith("n")) ;

            {

                System.out.println("Muito obrigado por usar nossos serviços");
                return;
            }
        }
    }
}