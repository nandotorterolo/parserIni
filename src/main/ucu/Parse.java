package ucu;

import java_cup.runtime.DefaultSymbolFactory;
import java_cup.runtime.Symbol;

import java.io.CharArrayReader;
import java.io.Reader;
import java.util.HashMap;

/**
 * Created by fernando on 25/06/15.
 */
public class Parse {

    static Reader reader;
    static Scanner scanner = new Scanner(null);
    static Parser parser = new Parser(scanner, new DefaultSymbolFactory());
    static Symbol symbol;

    public static Object parse(String val) {

        reader = new CharArrayReader(val.toCharArray());
        scanner.yyreset(reader);
        parser.setScanner(scanner);

        try {
            symbol = parser.parse();
            return symbol.value;
        } catch (Exception e) {
            e.printStackTrace();
            // throw new IllegalStateException("parsing" + val, e);
            return new IllegalStateException("parsing" + val, e);
        }
    }

    public static HashMap<String,HashMap<String, String>> getFile() {
        return parser.file;
    }

//    public static void registrar(String key, SFXFactory clazz) {
//        parser.rConstructors.put(key, clazz);
//    }
}
