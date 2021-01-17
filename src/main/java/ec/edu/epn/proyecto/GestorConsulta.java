package ec.edu.epn.proyecto;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestorConsulta {

    public ArrayList obtenerNoticias() {
        ArrayList noticias = new ModeloBusqueda().devolverInformacion();
        return noticias;
    }


}
