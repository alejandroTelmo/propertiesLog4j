package test;

import modelos.Afiliado;
import org.junit.jupiter.api.Test;

import org.apache.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoTest {
    public static Logger log=Logger.getLogger(AfiliadoTest.class);
    @Test
    public void calcularPuntosAfiliado(){
        Afiliado afiliado=new Afiliado();
        afiliado.setVentas(10);
        afiliado.setPuntos(10);
        assertEquals(150,afiliado.calcularPuntos());
    }
@Test
    public void mostrarCategoriaTest(){
        log.info("Se invoca el metodo mostrarCategoriaTest");
        Afiliado afiliado=new Afiliado();
    log.info("Se creo el objeto afiliado");
        afiliado.setVentas(2);
    afiliado.setPuntos(10);
    log.info("Se seteo las ventas");
        assertEquals(30,afiliado.calcularPuntos());
    log.info("Se comprobo los puntos");
        assertEquals("Novato",afiliado.mostrarCategoria());
    log.info("Se comprobo la categoria");
}
}