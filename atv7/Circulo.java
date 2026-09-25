public class Circulo extends Forma {

    @Override
    void calculaArea() {
        float raio = getArestas().get(0);
        float area = (float) (Math.PI * Math.pow(raio, 2));
        System.out.println("Área do Círculo: " + area);
    }
}
