package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

//Esto es un Singleton, pero tranquilamente puede ser como Come Tutti, lo hizo el profe asi para mostrarlo.
public class Tradicional implements ICriterio{
    private static Tradicional instance = new Tradicional();
    public Tradicional() {}

    public static Tradicional getInstance(){
        return instance;
    }

    //Asi con solo esto seria como el ComeTutti.
    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(receta.esTradicional());
    }

}
