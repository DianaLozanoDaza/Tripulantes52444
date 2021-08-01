


import model.Curso;
import model.Tripulante;
import view.Vista;

public class App {
    public static void main(String[] args) {

        Curso programacion1 = new Curso (1234, "Fundamentos de programaciòn", 'M', 7400, "Dev 1");
        programacion1.getNombre();

        try {
            programacion1.calcularPromedioCurso();
        } catch (Exception e) {
            e.getMessage();
        }

        Tripulante t = new Tripulante();
        t.setNombre("Primer tripulante");
        t.setNota1(5);
        t.setNota2(4.5);
        t.setNota3(4);
        Tripulante t2 = new Tripulante();
        t2.setNombre("2o tripulante");
        t2.setNota1(3);
        t2.setNota2(3.5);
        t2.setNota3(2);
        Tripulante t3 = new Tripulante();
        t3.setNombre("3o tripulante");
        t3.setNota1(5);
        t3.setNota2(3.5);
        t3.setNota3(2);
        Tripulante t4 = new Tripulante();
        t4.setNombre("4o tripulante");
        t4.setNota1(4);
        t4.setNota2(2.5);
        t4.setNota3(3);
        Tripulante t5 = new Tripulante();
        t5.setNombre("5o tripulante");
        t5.setNota1(4);
        t5.setNota2(4.5);
        t5.setNota3(4);

        programacion1.agregarTripulante(t);
        programacion1.agregarTripulante(t2);
        programacion1.agregarTripulante(t3);
        programacion1.agregarTripulante(t4);
        programacion1.agregarTripulante(t5);

        /*for (Tripulante desarrollador : programacion1.getTripulantes()){
            (desarrollador.getHighNote(); //Nota mas alta
            (desarrollador.getNombre();
        }

        try {
            (programacion1.calcularPromedioCurso();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        Vista v = new Vista();
        v.setVisible(true);
    }
}
