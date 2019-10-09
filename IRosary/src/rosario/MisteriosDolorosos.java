package rosario;

import gui.main;
import javax.microedition.lcdui.Image;

public class MisteriosDolorosos extends MisteriosMarianos {

    public MisteriosDolorosos(main p) throws Exception {
        super(p);
        img[0] = Image.createImage("/img/Dolorosos/dolor1.png");
        img[1] = Image.createImage("/img/Dolorosos/dolor2.png");
        img[2] = Image.createImage("/img/Dolorosos/dolor3.png");
        img[3] = Image.createImage("/img/Dolorosos/dolor4.png");
        img[4] = Image.createImage("/img/Dolorosos/dolor5.png");
        primeraCarga();
    }
}
