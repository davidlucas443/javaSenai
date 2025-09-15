public class Carro extends Veiculo{

    private float velCar = 100;

    public Carro(float distancia, float velCar) {
        super(distancia);
        this.velCar = velCar;
    }

    @Override
    public float calcularTemp(float distancia) {

        return distancia = distancia / velCar;

    }

}

