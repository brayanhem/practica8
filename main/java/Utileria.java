public class Utileria implements ElementoDinamico{

    private String nombre;
    private String descripcion;
    private int posicionX;
    private int posicionY;

    public Utileria(String nombre, String descripcion, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPosicionX() {
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

    public void usar(){
        System.out.println("Usando"+nombre);
    }
    @Override
    public void mover(String direccion, int distancia) {
        System.out.println(nombre+"se desplazo a:"+direccion+":"+distancia  );
    }
}
