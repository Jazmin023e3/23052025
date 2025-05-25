public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Animal
        Animal miAnimal = new Animal();

        // Asignamos valores a las propiedades usando los métodos set
        miAnimal.setNombre("León");
        miAnimal.setOrden("Carnívoro");
        miAnimal.setExtremidades(4);

        // Mostramos la información del animal
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());
    }
}

// Clase Animal dentro del mismo archivo
class Animal {
    // Propiedades encapsuladas (private)
    private String nombre;
    private String orden;
    private int extremidades;

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}
