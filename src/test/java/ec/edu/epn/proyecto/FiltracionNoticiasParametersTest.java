package ec.edu.epn.proyecto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith( value = Parameterized.class)
public class FiltracionNoticiasParametersTest {

    private String[] filtros;
    private String expected;

    public FiltracionNoticiasParametersTest(String filtros, String expected) {
        this.filtros = new String[]{filtros};
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"covid-19","VALIDO"});
        objects.add(new Object[]{"covid","VALIDO"});
        objects.add(new Object[]{"covid19","VALIDO"});
        objects.add(new Object[]{"COVID","VALIDO"});
        return objects;
    }

    @Test
    public void given_Parametros_when_verificarInformacion_ok(){
        FiltracionNoticias f = new FiltracionNoticias();
        String respuesta = f.verificarInformacion(filtros);
        assertEquals(expected,respuesta);
    }
}