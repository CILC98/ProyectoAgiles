package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class ModeloBusqueda {
    ArrayList<String> fuentes = new ArrayList();
    ArrayList<Noticia> noticias = new ArrayList();

    public ModeloBusqueda() {
        Noticia noticia = new Noticia("Cifras COVID-19 de los hospitales de Guayaquil no coinciden con las " +
                "señaladas " + "por ministro de Salud", "El Universo",
                "https://www.eluniverso.com/guayaquil/2020/12/29/nota/9087883/cifras-covid-19-hospitales-no-coinciden" +
                        "-senaladas-ministro-salud", "30/12/20");
        this.noticias.add(noticia);

        noticia = new Noticia("Las fiestas tradicionales del año viejo se suspendieron por el coronavirus",
                "El Comercio", "https://www.elcomercio.com/actualidad/fiestas-tradicionales-suspendidas-coro" +
                "navirus-ecuador.html", "30/12/20");
        this.noticias.add(noticia);
    }

    public void agregarFuente(String fuente) {
        this.fuentes.add(fuente);
    }

    public void quitarFuente(String fuente) {
        for (int i = 0 ; i<this.fuentes.size(); i++){
            if (this.fuentes.get(i).equals(fuente)){
                this.fuentes.remove(i);
                break;
            }
        }
    }

    public void agregarNoticia(Noticia noticia) {
        this.noticias.add(noticia);
    }

    public void quitarNoticia(Noticia noticia) {
        for (int i = 0 ; i<this.noticias.size(); i++){
            if (this.noticias.get(i).equals(noticia)){
                this.noticias.remove(i);
                break;
            }
        }
    }

    public ArrayList devolverInformacionFiltrada(String filtro []){
        ArrayList noticiasBuscadas = new ArrayList();
        for (String palabra : filtro) {
            for (Noticia noticia: this.noticias) {
                if ((noticia.getTítulo().contains(palabra) || noticia.getFuente().contains(palabra)) &&
                !noticiasBuscadas.contains(noticia)) {
                    noticiasBuscadas.add(noticia);
                    break;
                }
            }
        }
        return noticiasBuscadas;
    }

    public ArrayList devolverInformacion(){
        ArrayList noticiasBuscadas = this.noticias;
        return noticiasBuscadas;
    }
}
