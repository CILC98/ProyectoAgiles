package ec.edu.epn.proyecto;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FiltracionNoticiasTest {
    @Test
    public void given_filtros_when_obtenerNoticias_ok(){
        String [] filtros = {"COVID-19","El Universo"};
        for (Noticia i : new FiltracionNoticias().obtenerNoticias(filtros)){
            assertTrue(i.getFuente().contains("El Universo") && i.getTítulo().contains("COVID-19"));
        }
    }

    @Test
    public void given_filtros_when_obtenerNoticias_noNull(){
        String [] filtros = {"ABC","OPT"};
        FiltracionNoticias f = new FiltracionNoticias();
        ArrayList<Noticia> actual= f.obtenerNoticias(filtros);
        assertSame(0,actual.size());
    }

    @Test
    public void given_filtros_when_VerificarInformacion_ok(){
        String [] filtros = {"ABC","OPT","COVID-19","*/19","#El_Universo"};
        FiltracionNoticias f = new FiltracionNoticias();
        String actual= f.verificarInformacion(filtros);
        assertNotSame("VALIDO",actual);
        String [] filtros1 = {"ABC","OPT","COVID-19"};
        actual= f.verificarInformacion(filtros1);
        assertNotSame("INVALIDO",actual);
    }
}