package rosario;

import gui.main;
import javax.microedition.lcdui.Image;

public class MisteriosGozosos extends MisteriosMarianos {

    public MisteriosGozosos(main p) throws Exception {
        super(p);
        img[0] = Image.createImage("/img/Gozosos/gozo1.png");
        img[1] = Image.createImage("/img/Gozosos/gozo2.png");
        img[2] = Image.createImage("/img/Gozosos/gozo3.png");
        img[3] = Image.createImage("/img/Gozosos/gozo4.png");
        img[4] = Image.createImage("/img/Gozosos/gozo5.png");
        primeraCarga();
    }
}
