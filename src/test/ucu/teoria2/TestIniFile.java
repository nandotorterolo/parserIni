package ucu.teoria2;

import junit.framework.TestCase;

import ucu.Parse;
import org.junit.Assert;

import java.util.HashMap;
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
                "organization=asfdasdf\n";

        try {
            Parse.parse(value);

            HashMap<String,HashMap<String,String>> file = Parse.getFile();// .get("owner");
            if (file == null) {
                logger.log(Level.SEVERE, "file undefined error");
            }else {
                HashMap<String,String> section = file.get("[owner]");
                if (section == null) {
                    logger.log(Level.INFO, " section undefined");
                }else {
                    section.forEach((k,v) -> logger.log(Level.INFO, k + " " +v));

                }
            }
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e.getCause());
        }
    }



}
