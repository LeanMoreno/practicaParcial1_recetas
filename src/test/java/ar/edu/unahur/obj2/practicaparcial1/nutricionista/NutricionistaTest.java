package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.cliente.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.criterios.Tradicional;
import ar.edu.unahur.obj2.practicaparcial1.decoradores.SemillasDeChia;
import ar.edu.unahur.obj2.practicaparcial1.receta.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.receta.Receta;

public class NutricionistaTest {
    Nutricionista nutricionista = Nutricionista.getInstance();

    @Test
    void visitarAUnClienteDebeCrearBatidoMagico(){
        Cliente cliente = new Cliente(12121212);
        
        nutricionista.visitarCliente(cliente);
        IReceta recetaCliente = cliente.getRecetasRecibidas().get(0); //Devuelve la primer receta de la lista.

        assertEquals("Batido Magico", recetaCliente.getNombre());
    }

    @Test
    void unaRecetaDecoradaSePuedeEntregarAlCliente(){
        Cliente cliente = new Cliente(12121212);

        IReceta polentaConSemilla = new SemillasDeChia(
            new Receta("Polenta", "yo mismo", 1000, 90));

        nutricionista.agregarReceta(polentaConSemilla);
        new Tradicional();
        cliente.setCriterio(Tradicional.getInstance());
        nutricionista.visitarCliente(cliente);

        IReceta recetaCliente = cliente.getRecetasRecibidas().get(0);

        assertEquals("Polenta con Semillas de Chia", recetaCliente.getNombre());
        assertEquals(1490, recetaCliente.getValorNutricional());
        
    }

}
