package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.cliente.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.receta.Receta;

//Es un singleton porque solo hay UN nutricionista.
public class Nutricionista {
    private static Nutricionista instance = new Nutricionista();
    private static final List<IReceta> recetas= new ArrayList<>();
    private static String nombreAutor = "Lic.Escofier"; //Porque el batido magico tiene su nombre como autor.

    private Nutricionista() {}

    public static Nutricionista getInstance(){
        return instance;
    }

    public static String getNombre() {
        return nombreAutor;
    }

    public static void setNombre(String nombre) {
        Nutricionista.nombreAutor = nombre;
    }

    public void agregarReceta(IReceta receta){
        recetas.add(receta);
    }

    public void visitarCliente(Cliente cliente){
        IReceta recetaAEntregar = recetas.stream()
        .filter(r -> cliente.leGustaLaReceta(r)).findFirst()
        .orElse(new Receta("Batido Magico", nombreAutor, 2000, 0));

        cliente.recibirReceta(recetaAEntregar);
    }

}
