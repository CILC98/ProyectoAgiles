package ec.edu.epn.proyecto;


import java.util.ArrayList;

public class BuscadorNoticiasCovid {
    public static void main(String[] args) {
        VistaPantalla v = new VistaPantalla();
        System.out.println("---Consulta--");
        ArrayList<Noticia> noticiasConsultadas= v.obtenerConsulta();
        System.out.println("---Consulta Filtrada--");
        String [] filtros = {"COVID","El Universo"};
        ArrayList<Noticia> noticiasFiltradas= v.getInformacionFiltrada(filtros);
    }
}
