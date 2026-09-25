import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.setArestas(List.of(5f)); 
        formas.add(circulo);

        Quadrado quadrado = new Quadrado();
        quadrado.setArestas(List.of(4f)); 
        formas.add(quadrado);

        Triangulo triangulo = new Triangulo();
        triangulo.setArestas(List.of(6f, 3f)); 
        formas.add(triangulo);
      
        for (Forma f : formas) {
            f.calculaArea();
        }
    }
}
