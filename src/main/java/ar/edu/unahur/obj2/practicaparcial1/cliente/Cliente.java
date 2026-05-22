package ar.edu.unahur.obj2.practicaparcial1.cliente;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.criterios.ICriterio;
import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;

public class Cliente {
    private final Integer dni;
    private final List<IReceta> recetasRecibidas = new ArrayList<>();
    private ICriterio criterio = new ComeTutti();

    //Constructor por si queres crear un cliente con el Dni y cambiarle el criterio que tiene por defecto.
    public Cliente(Integer dni, ICriterio criterio) {
        this.dni = dni;
        this.criterio = criterio;
    }

    //Constructor por si solo queres crear un cliente con el Dni y dejarle el criterio por defecto.
    public Cliente(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public List<IReceta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public ICriterio getCriterio() {
        return criterio;
    }

    public void setCriterio(ICriterio criterio) {
        this.criterio = criterio;
    }

    public void recibirReceta(IReceta receta){
        recetasRecibidas.add(receta);
    }

    public Integer valorTotalReceta(IReceta receta){
        return receta.getValorNutricional();
    }

    public Boolean leGustaLaReceta(IReceta receta){
        return Boolean.valueOf(criterio.leGusta(receta)); //Le preguntas al criterio del cliente si le gusta la receta.
    }

    
}
