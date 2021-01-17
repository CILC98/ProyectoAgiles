package ec.edu.epn.proyecto;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestorConsulta {

    public ArrayList solicitarNoticias() {
        ArrayList noticias = new ModeloBusqueda().devolverNoticias();
        return noticias;
    }


}
