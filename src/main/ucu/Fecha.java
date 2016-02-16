package ucu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fernando on 24/06/15.
 */
public class Fecha {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
    SimpleDateFormat dateFormat3 = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");

    public Date fecha = new Date(0L);
    public Fecha(Integer año, Integer mes, Integer dia) {
        fecha = new Date(año -1900, mes, dia);
    }

    @Override
    public String toString() {
        return dateFormat.format(fecha);
    }
}
