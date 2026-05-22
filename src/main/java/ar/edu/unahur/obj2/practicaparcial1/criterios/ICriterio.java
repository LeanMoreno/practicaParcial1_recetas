package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

//Todo el package criterios es el patron Strategy.
public interface ICriterio {
    Boolean leGusta(IReceta receta);
}
