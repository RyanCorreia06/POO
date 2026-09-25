public class Quadrado extends Forma {

    @Override
    void calculaArea() {
        float lado = getArestas().get(0);
        float area = lado * lado;
        System.out.println("Área do Quadrado: " + area);
    }
}
