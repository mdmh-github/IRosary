package ayuda;


import java.util.Vector;

/**
 * @author Maktub
 */
public abstract class MisMetodos {

    private static Vector v = new Vector(5, 3);   
    public static String[] split(String s, String separador) {

        v.removeAllElements();
        int index = s.indexOf(separador);
        while (index >= 0) {
            v.addElement(s.substring(0, index));
            s = s.substring(index + separador.length());
            index = s.indexOf(separador);
        }
        v.addElement(s);
        String[] result = new String[v.size()];
        if (v.size() > 0) {
            for (int i = 0; i < v.size(); i++) {
                result[i] = (String) v.elementAt(i);
            }
        }
        return result;
    }
}

