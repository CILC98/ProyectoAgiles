package ec.edu.epn.proyecto;

import java.util.ArrayList;

public interface IPaginaWeb {

    public ArrayList<Noticia> realizarBusqueda(String [] filtros);
}
