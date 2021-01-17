package ec.edu.epn.proyecto;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VistaPantallaTest {
    @Test
    public void given_Noticias_when_actualizarVista_ok(){
        VistaPantalla v = new VistaPantalla();
        ArrayList <Noticia> noticias = new ArrayList();
        Noticia noticia1 = new Noticia("Cifras COVID-19 de los hospitales de Guayaquil no coinciden con las " +
                "señaladas " + "por ministro de Salud", "El Universo",
                "https://www.eluniverso.com/guayaquil/2020/12/29/nota/9087883/cifras-covid-19-hospitales-no-coinciden" +
                        "-senaladas-ministro-salud", "30/12/20");

        Noticia noticia2 = new Noticia("Las fiestas tradicionales del año viejo se suspendieron por el coronavirus",
                "El Comercio", "https://www.elcomercio.com/actualidad/fiestas-tradicionales-suspendidas-coro" +
                "navirus-ecuador.html", "30/12/20");
        noticias.add(noticia1);
        noticias.add(noticia2);
        assertEquals(noticias,v.actualizarVista(noticias));
    }

    @Test
    public void given_Filtros_when_getInformaciónFiltrada_ok(){
        VistaPantalla v = new VistaPantalla();
        String filtros [] = {"COVID-19"};
        boolean bandera = true;
        for (Noticia i : v.getInformacionFiltrada(filtros)){
                if (!i.getTítulo().contains(filtros[0])){
                    bandera = false;
                    break;
                }
        }
        assertTrue(bandera);
    }

    @Test
    public void given_Filtros_when_getInformaciónFiltrada_long_cero(){
        VistaPantalla v = new VistaPantalla();
        String filtrosuser [] = {"holi","123","abc-123"};
        int actual = v.getInformacionFiltrada(filtrosuser).size();
        int expected = 0;
        assertEquals(0,actual);
    }

    @Test
    public void given_Filtros_when_getInformaciónConsulta_notNull(){
        VistaPantalla v = new VistaPantalla();
        ArrayList<Noticia> noticias = v.obtenerConsulta();
        assertNotNull(noticias);
    }

}