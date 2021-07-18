package model;


public class Curso {
    //Atributos
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    //Constructor ctor
    public Curso(int codigo, String nombre, char jornada, int fCodigo, String fNombre) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
        formador = new Formador(fNombre, fCodigo);
    }

    //Metodos
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
}
