package view;

import model.Curso;
import model.Formador;

public class Vista {

    public static void main(String[] args) {
        //Aqui se crea el objeto
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 7400, "Guillaume");
        Curso cursoItaliano = new Curso(52442, "Italiano", 'M', 7401, "Vladimir");

        Formador profesor = new Formador("Carlitos", 1234);
        System.out.println(profesor.getNombre());

        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoItaliano.getFormador().getCodigo());

        System.out.println(cursoFrances.getCodigo());
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoFrances.getJornada());


    }
}
