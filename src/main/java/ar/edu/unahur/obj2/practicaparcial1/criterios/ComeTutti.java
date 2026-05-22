package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public class ComeTutti implements ICriterio{

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.TRUE; //ASI SE ESCRIBE LOS BOOLEANOS EN JAVA. Devolvemos un True.
    }

}
