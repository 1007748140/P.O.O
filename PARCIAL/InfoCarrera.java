public class InfoCarrera {
    private Carrera carrera;
    private double promedioNotas;
    private double promedioEdad;

    public InfoCarrera(Carrera carrera, double promedioNotas, double promedioEdad) {
        this.carrera = carrera;
        this.promedioNotas = promedioNotas;
        this.promedioEdad = promedioEdad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    public String toString() {
        return "Carrera: " + carrera.getNombre() +
                ", Promedio de notas: " + promedioNotas +
                ", Promedio de edad: " + promedioEdad;
    }
}
