package ucu;

import java.util.ArrayList;

/**
 * Created by fernando on 25/06/15.
 */
public class FechaFactory extends SFXFactory {

    @Override
    public Object Build(ArrayList<Object> Parameters) {
        return new Fecha((Integer)Parameters.get(0) , (Integer)Parameters.get(1) , (Integer)Parameters.get(2));
    }
}
