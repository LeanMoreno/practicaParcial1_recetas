package ar.edu.unahur.obj2.practicaparcial1.receta;

public class Receta implements IReceta{
    private String nombre;
    private String autor;
    private Integer valorNutricionalBase;
    private Integer aniosTradicion;

    public Receta(String nombre, String autor, Integer valorNutricionalBase, Integer aniosTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricionalBase = valorNutricionalBase;
        this.aniosTradicion = aniosTradicion;
    }

    

    @Override
    public String getAutor() {
        return autor;
    }

    @Override //A este no hace falta poner una variable porque es una condicion.
    public Boolean esTradicional() {
        return Boolean.valueOf(aniosTradicion >= 20); //Si o si se escribe asi en java las condiciones.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getValorNutricionalBase() {
        return valorNutricionalBase;
    }

    public void setValorNutricionalBase(Integer valorNutricionalBase) {
        this.valorNutricionalBase = valorNutricionalBase;
    }

    public void setAniosTradicion(Integer aniosTradicion) {
        this.aniosTradicion = aniosTradicion;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAniosTradicion() {
        return aniosTradicion;
    }

    @Override
    public Integer getValorNutricional() {
        return valorNutricionalBase;
    }

    
    

}
