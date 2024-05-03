import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        List<InfoCarrera> infoCarreras = new ArrayList<>();

        // Obtener la lista de carreras
        ListaCarrera listaCarreras = new ListaCarrera();

        // Recorrer cada carrera
        for (Carrera carrera : listaCarreras.carreras) {
            double promedioNotas = 0.0;
            double sumaEdades = 0;
            int numEstudiantes = 0;

            // Recorrer cada estudiante
            for (Estudiante estudiante : listaEstudiante.estudiantes) {
                // Si el estudiante pertenece a la carrera actual
                if (estudiante.getCarrera() == carrera.getCodigo()) {
                    promedioNotas += estudiante.getPromedio();
                    sumaEdades += estudiante.getEdad();
                    numEstudiantes++;
                }
            }

            // Calcular el promedio de notas y edad
            promedioNotas /= numEstudiantes;
            double promedioEdad = (double) sumaEdades / numEstudiantes;

            // Agregar la información a la lista
            infoCarreras.add(new InfoCarrera(carrera, promedioNotas, promedioEdad));
        }

        // Llamar al método para imprimir el reporte
        imprimirReporte(infoCarreras);
    }

    public static void imprimirReporte(List<InfoCarrera> infoCarreras) {
        System.out.println("\nReporte de Carreras:");
        System.out.println("\n");

        double totalPromedioNotas = 0.0;
        double totalPromedioEdades = 0.0;
        int totalEstudiantes = 0;

        for (InfoCarrera infoCarrera : infoCarreras) {
            System.out.println("Carrera: " + infoCarrera.getCarrera().getNombre());
            System.out.println("Promedio de notas: " + infoCarrera.getPromedioNotas());
            System.out.println("Promedio de edad: " + infoCarrera.getPromedioEdad());
            System.out.println();

            totalPromedioNotas += infoCarrera.getPromedioNotas();
            totalPromedioEdades += infoCarrera.getPromedioEdad();
            totalEstudiantes += infoCarrera.getCarrera().getCodigo();
        }

        System.out.println("Totales:");
        System.out.println("Total promedio de notas: " + totalPromedioNotas / infoCarreras.size());
        System.out.println("Total promedio de edades: " + totalPromedioEdades / infoCarreras.size());
    }
}
