public class Carrera {
    int codigo;
    String nombre;
    //Constructores, getters, setters, etc

    //Constructor

    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Getters y Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
