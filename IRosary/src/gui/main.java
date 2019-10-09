package gui;

import java.util.Calendar;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
import rosario.MisteriosDolorosos;
import rosario.MisteriosEspSanto;
import rosario.MisteriosGloriosos;
import rosario.MisteriosLuminosos;
import rosario.Rosario;
import rosario.MisteriosGozosos;
import rosario.MisteriosMisericordia;

public class main extends Canvas {

    private Image principal,  menu[],  izq,  der;
    private int pos = (Graphics.LEFT | Graphics.TOP),  x,  y;
    private int selector;
    private final int ROSARIOMA = 0,  ROSARIOE = 1,  ROSARIOMI = 2,  ACERCADE = 3;
    private Calendar calendar;
    private Rosario rosarioMariano,  rosarioEsp,  rosarioMis;
    private Display display;
    private boolean pi,  pd;
    private MIDlet midlet;

    public main(Display disp, MIDlet m) {
        try {
            display = disp;
            midlet = m;
            calendar = Calendar.getInstance();
            menu = new Image[4];
            principal = Image.createImage("/img/Menu/main.png");
            izq = Image.createImage("/img/Menu/izq.png");
            der = Image.createImage("/img/Menu/der.png");
            menu[0] = Image.createImage("/img/Menu/mar.png");
            menu[1] = Image.createImage("/img/Menu/esp.png");
            menu[2] = Image.createImage("/img/Menu/mis.png");
            menu[3] = Image.createImage("/img/Menu/gra.png");
            selector = 0;
            x = 10;
            y = 60;
            setFullScreenMode(true);
        } catch (Exception e) {
            System.out.println("errorrrr");
        }
    }

    public void paint(Graphics g) {
        g.drawImage(principal, 0, 0, pos);
        if (pd) {
            g.drawImage(der, 6, 126, pos);
        } else if (pi) {
            g.drawImage(izq, 140, 128, pos);
        }
        g.drawImage(menu[selector], 30, 123, pos);
    }

    protected void keyPressed(int keyCode) {

        switch (keyCode) {
            case -6:
                procesarPeticionMenu();
                break;
            case -7:
                midlet.notifyDestroyed();
                break;
        }
        switch (getGameAction(keyCode)) {
            case Canvas.FIRE:
                procesarPeticionMenu();
                break;
            case Canvas.LEFT:
                listaAlaIzquierda();
                break;
            case Canvas.RIGHT:
                listaAlaDerecha();
                break;
        }
        repaint();
    }

    protected void keyReleased(int keyCode) {
        switch (getGameAction(keyCode)) {
            case Canvas.RIGHT:
                pi = false;
                break;
            case Canvas.LEFT:
                pd = false;
                break;
        }
        repaint();
    }

    public Display getDisplay() {
        return display;
    }

    private void procesarPeticionMenu() {
        switch (selector) {
            case ROSARIOMA:
                setRosarioMariano();
                break;
            case ROSARIOE:
                setRosarioEspSanto();
                break;
            case ROSARIOMI:
                setRosarioMisericordia();
                break;
            case ACERCADE:
                break;
        }
    }

    private void setRosarioMariano() {
        if (rosarioMariano == null) {
            rosarioMariano = rosarioDeHoy();
        } else {
            rosarioMariano.reiniciar();
        }
        display.setCurrent(rosarioMariano);
    }

    private void setRosarioEspSanto() {
        if (rosarioEsp == null) {
            try {
                rosarioEsp = new MisteriosEspSanto(this);
            } catch (Exception e) {
            }
        } else {
            rosarioEsp.reiniciar();
        }
        display.setCurrent(rosarioEsp);
    }

    private void setRosarioMisericordia() {
        if (rosarioMis == null) {
            try {
                rosarioMis = new MisteriosMisericordia(this);
            } catch (Exception e) {
            }
        } else {
            rosarioMis.reiniciar();
        }
        display.setCurrent(rosarioMis);

    }

    private void listaAlaIzquierda() {
        switch (selector) {
            case 0:
                selector = menu.length - 1;
                break;
            default:
                pd = true;
                selector--;
                break;
        }
    }

    private void listaAlaDerecha() {
        switch (selector) {
            //ultmia posicion de items items
            case 3:
                selector = 0;
                break;
            default:
                pi = true;
                selector++;
                break;
        }
    }

    private Rosario rosarioDeHoy() {
        try {
            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.MONDAY:
                case Calendar.SATURDAY:
                    return new MisteriosGozosos(this);
                case Calendar.TUESDAY:
                case Calendar.FRIDAY:
                    return new MisteriosDolorosos(this);
                case Calendar.THURSDAY:
                    return new MisteriosLuminosos(this);
                default:
                    return new MisteriosGloriosos(this);
            }
        } catch (Exception e) {
            return null;
        }
    }
}