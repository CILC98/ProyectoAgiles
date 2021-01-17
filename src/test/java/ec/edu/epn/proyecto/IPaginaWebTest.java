package ec.edu.epn.proyecto;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IPaginaWebTest {
    @Test
    public void given_Filtros_when_realizarBusqueda_ok(){
        IPaginaWeb ip = Mockito.mock(IPaginaWeb.class);
        VistaPantalla v = new VistaPantalla();
        String filtros [] = {"COVID-19","El Universo","El Comercio"};
        ArrayList <Noticia> noticias = v.getInformacionFiltrada(filtros);
        Mockito.when(ip.realizarBusqueda(filtros)).thenReturn(noticias);
        assertEquals(noticias,ip.realizarBusqueda(filtros));
    }
}