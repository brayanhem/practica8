public class Obstaculo implements Destruible{

    private String nombre;
    private int daño;
    private int posicionX;
    private int posicionY;

    public Obstaculo(String nombre, int daño, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.daño=daño;
        this.posicionX=posicionX;
        this.posicionY=posicionY;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño(){
        return daño;
    }

    public int getPosicionX(){
        return posicionX;
    }

    public int getPosicionY(){
        return posicionY;
    }
    @Override
    public void destruir() {
        System.out.println("Obstaculo destruido");
    }

}
