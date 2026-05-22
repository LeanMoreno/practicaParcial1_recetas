package ar.edu.unahur.obj2.practicaparcial1.criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public class Premium implements ICriterio{
    private final List<String> autores; //Si fuera vacio por defecto iria new ArrayList<>.

    public Premium(List<String> autores) {
        this.autores = autores;
    }

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(autores.contains(receta.getAutor()));
    }

}
