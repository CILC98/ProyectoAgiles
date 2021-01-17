package ec.edu.epn.proyecto;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ModeloBusquedaTest {

    @Test
    public void given_Filtros_when_devolverInformacionFiltrada_ok(){
        ModeloBusqueda m = new ModeloBusqueda();
        String filtroFuente1 [] = {"El Comercio"};
        ArrayList <Noticia> actual1 = m.devolverInformacionFiltrada(filtroFuente1);
        for (Noticia i : actual1){
            assertThat(i.getFuente(),is("El Comercio"));
        }
        String filtroFuente2 [] = {"El Universo"};
        ArrayList <Noticia> actual2 = m.devolverInformacionFiltrada(filtroFuente2);
        for (Noticia i : actual2){
            assertThat(i.getFuente(),is("El Universo"));
        }
    }

    @Test
    public void given_Filtros_when_devolverInformacionFiltrada_notNull(){
        ModeloBusqueda m = new ModeloBusqueda();
        String filtrosuser [] = {"holi","123","abc-123"};
        int actual = m.devolverInformacionFiltrada(filtrosuser).size();
        assertNotNull(actual);
    }

    @Test
    public void given_filtros_when_devolverInformacion_notNull(){
        ModeloBusqueda m = new ModeloBusqueda();
        ArrayList<Noticia> noticias = m.devolverInformacion();
        assertNotNull(noticias);
    }
}