package model;

import java.util.ArrayList;

public class Curso {
    //Constante
    public final static int MAXIMO_TRIPULANTES = 5;

    //Atributos
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    //De curso hacia tripulante: Lista
    private ArrayList<Tripulante> tripulantes;

    //Constructor ctor
    public Curso(int codigo, String nombre, char jornada, int fCodigo, String fNombre) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
        formador = new Formador(fNombre, fCodigo);
        tripulantes = new ArrayList<>(); //inicializar para convertirla en objeto
    }

    //Metodos


    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getJornada() {
        return jornada;
    }

    public Formador getFormador() {
        return formador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String agregarTripulante(Tripulante t){
        if (tripulantes.size() ==MAXIMO_TRIPULANTES){
            return "No se puede agregar mas de " + MAXIMO_TRIPULANTES + "tripulantes";
        }
        tripulantes.add(t);
        return "Tripulante agregado al curso" + nombre;
    }

    //Calcular promedio de los estudiantes
    public double calcularPromedioCurso() throws Exception {
        if (tripulantes.size()==0){//Lanzar exception
            throw new Exception("No hay tripulantes registrados en el curso");
        }

        double total = 0.0;
        for (Tripulante tripulante : tripulantes) {
            total += tripulante.getAverage();
        }
        return total/tripulantes.size();
    }


}


