import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numParadas = 5;
        Scanner sc = new Scanner(System.in);

        Carro car = new Carro(100, 80);
        Biclicleta bici = new Biclicleta(100,20);
        Onibus oni = new Onibus(100,60,5);


        System.out.println("Para ir até o seu destino (piracabianinha,SP) existem 3 opções ");
        System.out.print("De Carro : " );
        System.out.print(car.calcularTemp(100)*60);
        System.out.println(" min");
        System.out.print("De bicicleta : " );
        System.out.print(bici.calcularTemp(100)*60);
        System.out.println(" min");
        System.out.print("De Onibus ( com 5 paradas ) : " );
        System.out.print(oni.calcularTemp(100));
        System.out.println(" min");
    }
}
