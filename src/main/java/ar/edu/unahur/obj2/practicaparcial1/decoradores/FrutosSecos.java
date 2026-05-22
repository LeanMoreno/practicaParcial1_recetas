package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public class FrutosSecos extends IngredienteDecorator{

    public FrutosSecos(IReceta receta) {
        super(receta);
    }

    @Override
    protected String getNombreIngrediente() {
        return "Frutos Secos";
    }

    @Override
    protected Integer getValorAdicional() {
        return 594;
    }

}
