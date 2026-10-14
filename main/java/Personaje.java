public class Personaje implements Destruible,ElementoDinamico {

    private String nombre;
    private int vida;
    private int posicionX;
    private int posicionY;

    public Personaje(String nombre, int vida, int posicionX, int posicionY){
        this.nombre = nombre;
        this.vida = vida;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }
    public int getPosicionX(){
        return posicionX;
    }
    public int getPosicionY(){
        return posicionY;
    }

    public void setPosicion(int x, int y){
        this.posicionX = x;
        this.posicionY = y;
    }

    public void recibirDaño(int daño){
        this.vida -= daño;
    }


    @Override
    public void destruir() {
        System.out.println(nombre + " ha muerto");
    }

    @Override
    public void mover(String direccion, int distancia) {
        System.out.println(nombre +"se movio a" + direccion + " distancia: " + distancia);
    }
}
