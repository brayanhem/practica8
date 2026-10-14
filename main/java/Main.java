public class Main {
    public static void main(String[] args) {
        Inventario miInventario = new Inventario(10);
        miInventario.agragarItem(new Arma("Espada", 50, 1.5));
        miInventario.agragarItem(new Recompensa("Moneda", 100, "Oro"));

        Nivel nivel1 = new Nivel("Bosque", 1, "Normal", miInventario);

        nivel1.agregarCheckPoint(new CheckPoint("Punto 1", 10, 10));
        nivel1.agregarObstaculo(new Obstaculo("Roca", 10, 5, 5));

        nivel1.agregarElementoDinamico(new Personaje("Héroe", 100, 0, 0));
        nivel1.agregarElementoDinamico(new Utileria("Poción", "Cura vida", 2, 2));

        nivel1.mostrarEstado();
        nivel1.moverElementosDinamicos();
    }
}
