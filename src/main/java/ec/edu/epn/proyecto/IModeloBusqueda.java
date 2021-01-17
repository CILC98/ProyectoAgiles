package ec.edu.epn.proyecto;

import java.util.ArrayList;

public interface IModeloBusqueda {

    public ArrayList<Noticia> obtenerNoticiaWeb (String[] filtros);
}
