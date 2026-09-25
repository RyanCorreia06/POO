public class Triangulo extends Forma {

    @Override
    void calculaArea() {
        float base = getArestas().get(0);
        float altura = getArestas().get(1);
        float area = (base * altura) / 2;
        System.out.println("Área do Triângulo: " + area);
    }
}
