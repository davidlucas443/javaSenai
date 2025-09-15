public class Onibus extends Veiculo {

    private float velOni = 60;
    private int numPa = 5;

    public Onibus(float distancia, float velOni, int numPa) {
        super(distancia);
        this.velOni = velOni;
        this.numPa = numPa;
    }

    @Override
    public float calcularTemp(float distancia) {

        return distancia = (distancia / velOni)*60 + 15*numPa;

    }
}


