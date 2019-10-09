package rosario;

import gui.main;
import javax.microedition.lcdui.Image;

public class MisteriosLuminosos extends MisteriosMarianos {

    public MisteriosLuminosos(main p) throws Exception {
        super(p);
        img[0] = Image.createImage("/img/Luminosos/lum1.png");
        img[1] = Image.createImage("/img/Luminosos/lum2.png");
        img[2] = Image.createImage("/img/Luminosos/lum3.png");
        img[3] = Image.createImage("/img/Luminosos/lum4.png");
        img[4] = Image.createImage("/img/Luminosos/lum5.png");
        primeraCarga();
    }
}
