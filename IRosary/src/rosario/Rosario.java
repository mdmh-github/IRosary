package rosario;

import gui.main;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class Rosario extends Canvas {

    protected Image img[],  imagenLetania,  fondoMisterios;
    protected String letanias[],  parteA,  parteB;
    protected boolean hacerCuentas;
    protected main padre;
    public final byte MISTERIOS = 1,  LETANIAS = 2,  FIN = 100,  pos = (Graphics.LEFT | Graphics.TOP);
    protected final static Font font = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_PLAIN, Font.SIZE_LARGE);
    protected byte cuentaActual,  misterioActual,  letaniaActual,  estado;
    protected int misterioFinal,  letaniaFinal,  l;

    public Rosario(main p) throws IOException {
        fondoMisterios = Image.createImage("/img/Menu/fondoMisterios.png");
        padre = p;
        hacerCuentas = false;
        setFullScreenMode(true);
    }

    protected void keyPressed(int keyCode) {
        if (estado == FIN || keyCode == -7) {
            padre.getDisplay().setCurrent(padre);
        } else if (keyCode == Canvas.KEY_NUM0) {
            hacerCuentas = !hacerCuentas;
        }
        switch (getGameAction(keyCode)) {
            case Canvas.LEFT:
                switch (estado) {
                    case MISTERIOS:
                        if (cuentaActual != 0 && hacerCuentas) {
                            cuentaActual--;
                        } else {
                            cuentaActual = 10;
                            previusMisterio();
                        }
                        break;
                    case LETANIAS:
                        previusLetania();
                        break;
                }
                break;
            case Canvas.RIGHT:
                switch (estado) {
                    case MISTERIOS:
                        if (cuentaActual != 10 && hacerCuentas) {
                            cuentaActual++;
                        } else {
                            cuentaActual = 0;
                            nextMisterio();
                        }

                        break;
                    case LETANIAS:
                        nextLetania();
                        break;
                }
                break;
        }
        repaint();
    }

    //METODOS DE ACCIONES
    protected void paint(Graphics g) {
        switch (estado) {
            case MISTERIOS:
                g.drawImage(fondoMisterios, 0, 0, pos);
                g.drawImage(img[misterioActual], 0, 60, pos);
                if (hacerCuentas) {
                    g.setColor(0, 0, 255);
                    g.drawString("" + cuentaActual, 30, 30, pos);
                }
                g.setFont(font);
                if (cuentaActual == 0) {
                    g.drawString("Padre Nuestro...", 1, 155, pos);
                    return;
                }
                g.drawString(parteA, 1, 155, pos);
                g.drawString(parteB, 1, 170, pos);
                break;


            case LETANIAS:
                if (letanias == null) {
                    estado = FIN;
                    return;
                }
                g.drawImage(imagenLetania, 0, 0, pos);
                g.setFont(font);
                for (l = 20; l != 200 && estado != FIN; l = l + 20) {
                    g.drawString(letanias[letaniaActual], 0, l, pos);
                    nextLetania();
                }
                break;
        }
    }

    protected void primeraCarga() {
        misterioFinal = img.length;
        letaniaFinal = (letanias != null) ? letanias.length : 0;
        reiniciar();
    }

    public void reiniciar() {
        misterioActual = 0;
        cuentaActual = 0;
        letaniaActual = 0;
        estado = MISTERIOS;
    }

    public void pasarCuenta() {
        cuentaActual++;
    }

    //METODOS NEXY Y PREVIUS
    public final void previusMisterio() {
        if (misterioActual - 1 > -1) {
            misterioActual--;
            cuentaActual = 0;
        }
    }

    public final void previusLetania() {
        if (letaniaActual - 1 > -1) {
            letaniaActual--;
        }
    }

    public final void nextMisterio() {
        if (misterioActual + 1 < misterioFinal) {
            misterioActual++;
            cuentaActual = 0;
        } else {
            estado = LETANIAS;
        }
    }

    public final void nextLetania() {
        if (letaniaActual + 1 < letaniaFinal) {
            letaniaActual++;
        } else {
            estado = FIN;
        }
    }
}