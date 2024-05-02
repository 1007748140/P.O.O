import java.util.ArrayList;
import java.util.List;

public class ListaCarrera {
    List<Carrera> carreras;
    public ListaCarrera() {
        carreras = new ArrayList<>();
        carreras.add(new Carrera(101, "Ingeniería de Sistemas"));
        carreras.add(new Carrera (102, "Ingeniería Industrial"));
        carreras.add(new Carrera (103, "Matemáticas"));
    }
}

