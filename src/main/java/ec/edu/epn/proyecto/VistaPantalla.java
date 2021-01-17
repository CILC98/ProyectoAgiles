package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class VistaPantalla {
    public ArrayList<Noticia> actualizarVista(ArrayList<Noticia> noticia){
        for (int i = 0 ; i < noticia.size() ; i++){
            System.out.println(noticia.get(i).getTítulo());
            System.out.println(noticia.get(i).getFecha());
            System.out.println(noticia.get(i).getFuente());
        }
        return noticia;
    }

    public ArrayList<Noticia> getInformacionFiltrada(String filtros[]){
        ArrayList noticias ;
        noticias = new FiltracionNoticias().obtenerNoticias(filtros);
        actualizarVista(noticias);
        return noticias;
    }
}
