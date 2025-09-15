public class Biclicleta extends Veiculo {

    private float velBici = 20;

    public Biclicleta(float distancia, float velBici) {
        super(distancia);
        this.velBici = velBici;
    }
    @Override
    public float calcularTemp(float distancia) {

        return distancia = (distancia / velBici);

    }
}

