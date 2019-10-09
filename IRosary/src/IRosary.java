import gui.main;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

public class IRosary extends MIDlet {

    main main;
    Display d;

    public void startApp() {
      
        d = Display.getDisplay(this);
          main = new main(d,this);
        d.setCurrent(main);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
