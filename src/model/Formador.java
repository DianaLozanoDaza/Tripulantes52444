package model;

public class Formador {
    //Atributos
    private String nombre;
    private int codigo;

    //Constructor ctor
    public Formador(String nombre, int codigo){
        super();
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Metodos get
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
