package ucu.teoria2;

import junit.framework.TestCase;

import ucu.Parse;
import org.junit.Assert;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Valores simples expresados con palabras reservadas:
 */
public class TestIniFile extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    public void testTrue() {
        String value = "[owner]\n" +
                "name=asfdasasdfsa\n" +
                "organization=asfdasdf.";
//        logger.log(Level.INFO, value);
        try {
            Parse.parse(value);
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getLocalizedMessage());
        }
    }



}
