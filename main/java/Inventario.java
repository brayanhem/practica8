import java.util.ArrayList;

public class Inventario {

    private int capacidadMaxima;
    private ArrayList<Inventariable> items;

    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.items = new ArrayList<>();
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<Inventariable> getItems() {
        return items;
    }

    public boolean agragarItem(Inventariable item){
        if(items.size()<capacidadMaxima){
            items.add(item);
            item.registrar();
            return true;
        }
        return false;
    }

    public boolean borrarItem(Inventariable item){
        if(items.remove(item)){
            item.borrar();
            return true;
        }
        return false;
    }

    public void listarItem(){
        System.out.println("Items en inventario: "+items.size());
    }


}
