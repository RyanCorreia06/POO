import java.util.ArrayList;
import java.util.List;

public abstract class Forma {
    List<Float> arestas = new ArrayList<>();

    List<Float> getArestas() {
        return this.arestas;
    }

    void setArestas(List<Float> a) {
        this.arestas = a;
    }

    void calculaArea() {
        System.out.println("Área não definida");
    }
}
