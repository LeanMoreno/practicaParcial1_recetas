package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public class RodajasDePalta extends IngredienteDecorator{

    public RodajasDePalta(IReceta receta) {
        super(receta);
    }

    @Override
    protected String getNombreIngrediente() {
        return "Rodajas de Palta";    
    }

    @Override
    protected Integer getValorAdicional() {
        return 160;
    }

}
