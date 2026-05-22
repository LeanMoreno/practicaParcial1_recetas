package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public abstract class IngredienteDecorator implements IReceta{
    private final IReceta receta; //La clase u objeto que va a envolver.

    public IngredienteDecorator(IReceta receta) {
        this.receta = receta;
    }

    @Override
    public Boolean esTradicional() {
        return receta.esTradicional();
    }

    @Override
    public Integer getAniosTradicion() {
        return receta.getAniosTradicion();
    }

    @Override
    public String getAutor() {
        return receta.getAutor(); //El autor de la receta original, el ingrediente no tiene autor.
    }

    //template method
    @Override
    public String getNombre() {
        return receta.getNombre() + " con " + getNombreIngrediente();
    }

    protected abstract String getNombreIngrediente();

    //template method
    @Override
    public Integer getValorNutricional() {
        return receta.getValorNutricional() + getValorAdicional();
    }

    protected abstract Integer getValorAdicional();

}
