package ec.edu.epn.proyecto;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FiltracionNoticias {

    public String verificarInformacion(String filtros []){
        boolean bandera = true;
        for (int i = 0 ; i < filtros.length ; i++ ){
            Pattern pat = Pattern.compile("[A-Za-z\\-0-9\\s]{1,}");
            Matcher mat = pat.matcher(filtros[i]);
            if (!mat.matches()){
                bandera = false;
                break;
            }
        }
        String respuesta = comunicarVerificacion(bandera);
        return respuesta ;
    }

    public ArrayList<Noticia> obtenerNoticias(String filtros []){
        if (verificarInformacion(filtros).equals("VALIDO")){
            ArrayList noticias = new ModeloBusqueda().devolverInformacionFiltrada(filtros);
            return noticias;
        }else{
            ArrayList noticias = null;
            return noticias;
        }
    }

    public String comunicarVerificacion(boolean bandera){
        String respuesta = "";
        if (bandera){
            respuesta +="VALIDO";
        }else{
            respuesta +="INVALIDO";
        }
        return respuesta;
    }
}
