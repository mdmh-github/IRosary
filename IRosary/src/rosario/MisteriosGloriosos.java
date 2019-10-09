package rosario;

import gui.main;
import javax.microedition.lcdui.Image;

public class MisteriosGloriosos extends MisteriosMarianos {

    public MisteriosGloriosos(main p) throws Exception {
        super(p);
        img[0] = Image.createImage("/img/Gloriosos/gloria1.png");
        img[1] = Image.createImage("/img/Gloriosos/gloria2.png");
        img[2] = Image.createImage("/img/Gloriosos/gloria3.png");
        img[3] = Image.createImage("/img/Gloriosos/gloria4.png");
        img[4] = Image.createImage("/img/Gloriosos/gloria5.png");      
        primeraCarga();
    }
}
