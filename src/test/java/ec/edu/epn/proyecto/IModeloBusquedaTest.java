package ec.edu.epn.proyecto;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IModeloBusquedaTest {
    @Test
    public void given_filtros_when_buscarNoticiasWeb_ok(){
        IModeloBusqueda im = Mockito.mock(IModeloBusqueda.class);
        String filtros [] = {"COVID-19"};
        ArrayList<Noticia> noticias = new ArrayList();
        noticias.add(new Noticia("Cifras COVID-19 de los hospitales de Guayaquil no coinciden con las " +
                "señaladas " + "por ministro de Salud", "El Universo",
                "https://www.eluniverso.com/guayaquil/2020/12/29/nota/9087883/cifras-covid-19-hospitales-no-coinciden" +
                        "-senaladas-ministro-salud", "30/12/20"));
        noticias.add(new Noticia("Las fiestas tradicionales del año viejo se suspendieron por el coronavirus",
                "El Comercio", "https://www.elcomercio.com/actualidad/fiestas-tradicionales-suspendidas-coro" +
                "navirus-ecuador.html", "30/12/20"));
        Mockito.when(im.obtenerNoticiaWeb(filtros)).thenReturn(noticias);
        assertEquals(noticias,im.obtenerNoticiaWeb(filtros));
    }
}