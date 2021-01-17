package ec.edu.epn.proyecto;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GestorConsultaTest {

    @Test
    public void given_filtros_when_obtenerNoticias_notNull(){
        GestorConsulta g = new GestorConsulta();
        ArrayList<Noticia> noticias = g.solicitarNoticias();
        assertNotNull(noticias);
    }

}