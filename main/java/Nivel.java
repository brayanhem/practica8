import java.util.ArrayList;
import java.util.Random;

public class Nivel {
    private String nombre;
    private int numero;
    private String dificultad;

    private ArrayList<Obstaculo> obstaculos;
    private ArrayList<CheckPoint>  checkPoints;
    private ArrayList<ElementoDinamico>  elementosDinamicos;
    private Inventario inventario;

    public Nivel(String nombre, int numero, String dificultad, Inventario inventario) {
        this.nombre = nombre;
        this.numero = numero;
        this.dificultad = dificultad;
        this.inventario = inventario;
        this.obstaculos = new ArrayList<>();
        this.checkPoints = new ArrayList<>();
        this.elementosDinamicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void agregarObstaculo(Obstaculo obstaculo) {
        obstaculos.add(obstaculo);
    }

    public void agregarCheckPoint(CheckPoint checkPoint) {
        checkPoints.add(checkPoint);
    }

    public void agregarElementoDinamico(ElementoDinamico elementoDinamico) {
        elementosDinamicos.add(elementoDinamico);
    }

    public void moverElementosDinamicos(){
        String[] direcciones={"Norte","Sur","Este","Oeste"};
        Random rand = new Random();

        for(ElementoDinamico elemento: elementosDinamicos){
        String dirAleatoria = direcciones[rand.nextInt(direcciones.length)];
        int distAleatoria = rand.nextInt(10) + 1;
        elemento.mover(dirAleatoria, distAleatoria);
        }
    }

    public void mostrarEstado(){
        System.out.println("Nivel: " + nombre + " | Dificultad: " + dificultad);
        System.out.println("Dinámicos: " + elementosDinamicos.size() + " | Obstáculos: " + obstaculos.size());
    }
}
