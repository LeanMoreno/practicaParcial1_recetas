package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public class SemillasDeChia extends IngredienteDecorator{
    //Constructor
    public SemillasDeChia(IReceta receta) {
        super(receta);
    }

    @Override
    protected String getNombreIngrediente() {
        return "Semillas de Chia";
    }

    @Override
    protected Integer getValorAdicional() {
        return 490;
    }

}
