package rosario;

import gui.main;
import javax.microedition.lcdui.Image;

public class MisteriosMisericordia extends Rosario {

    public MisteriosMisericordia(main p) throws Exception {
        super(p);
        img = new Image[5];
        letanias = null;
        parteA = "Por su dolorosa Pasion";
        parteB = "ten misericordia de nosotros y del mundo entero";
        img[0] = Image.createImage("/img/Misericordiosos/mis.png");
        img[1] = img[0];
        img[2] = img[0];
        img[3] = img[0];
        img[4] = img[0];
        imagenLetania = Image.createImage("/img/Misericordiosos/misericordia.png");
        primeraCarga();
    }
}
