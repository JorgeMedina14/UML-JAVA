import java.util.concurrent.RecursiveTask;

public abstract class Personajee {
    private String nombre;
    private String descripcion;
    private Long tamano;
    private int poder;
    private int vida;

    public Personajee(String nombre, String descripcion, Long tamano ,int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.vida = vida;
    }

    public abstract void Desplazarse();

    public int MostrarVida() {
        return vida;
    }

    public void MostrarPoder() {
    }
}
