package rosario;

import gui.main;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public class MisteriosEspSanto extends Rosario {

    public MisteriosEspSanto(main p) throws IOException {
        super(p);
        img = new Image[7];
        img[0] = Image.createImage("/img/EspSanto/esp1.png");
        img[1] = Image.createImage("/img/EspSanto/esp2.png");
        img[2] = Image.createImage("/img/EspSanto/esp3.png");
        img[3] = Image.createImage("/img/EspSanto/esp4.png");
        img[4] = Image.createImage("/img/EspSanto/esp5.png");
        img[5] = Image.createImage("/img/EspSanto/esp6.png");
        img[6] = Image.createImage("/img/EspSanto/esp7.png");
        imagenLetania = Image.createImage("/img/Menu/letanias.png");
        parteA = "Ven, Espíritu Santo, llena los corazones de tus fieles.";
        parteB = "Y enciende en ellos el fuego de tu amor.";
        letanias = new String[]{
                    "Señor",
                    " ten piedad de nosotros.",
                    "Cristo",
                    " ten piedad de nosotros.",
                    "Señor",
                    " ten piedad de nosotros.",
                    "Padre omnipotente",
                    " ten piedad de nosotros.",
                    "Jesús",
                    "Hijo eterno del Padre",
                    " y Redentor del mundo",
                    " ten piedad de nosotros.",
                    "Espíritu Santo",
                    " santifícanos.",
                    "Trinidad santísima",
                    " óyenos.",
                    "Se Responde acada",
                    "invocacion :",
                    "ven a nosotros",
                    "Espíritu Santo",
                    " que procedes del Padre",
                    " y del Hijo.",
                    "Promesa del Padre.",
                    "Don de Dios Altísimo.",
                    "Rayo de luz celeste.",
                    "Fuente de agua viva.",
                    "Autor de todo bien.",
                    "Unción espiritual.",
                    "Caridad ardiente.",
                    "Fuego que consume.",
                    "Esp de amor y de verdad.",
                    "Esp de sabiduría y de ",
                    "entendimiento.",
                    "Esp de consejo y de ",
                    "fortaleza.",
                    "Esp de ciencia ",
                    "y de piedad.",
                    "Esp de temor de Dios.",
                    "Esp de gracia y oración.",
                    "Esp de paz y de dulzura.",
                    "Esp de modestia ",
                    "e inocencia.",
                    "Esp consolador.",
                    "Esp santificador.",
                    "Esp que gobiernas ",
                    " la Iglesia.",
                    "Esp que llenas ",
                    "el universo.",
                    "Esp de adopción de los ",
                    "hijos de Dios.",
                    "Unción espiritual.",
                    "Caridad ardiente.",
                    "Respondemos:",
                    "Te rogamos, óyenos",
                    "Esp Santo",
                    " ven a renovar la tierra.",
                    "Esp Santo",
                    " inflámanos con el",
                    " fuego de tu amor.",
                    "Esp Santo",
                    " danos el tesoro ",
                    "de tus gracias.",
                    "Esp Santo",
                    " enséñanos a orar.",
                    "Esp Santo",
                    " ilumínanos con tus ",
                    "inspiraciones.",
                    "Esp Santo",
                    " imprime tu ley en",
                    " nuestros corazones.",
                    "Esp Santo",
                    " condúcenos por la",
                    " vía de la salvación.",
                    "Esp Santo",
                    " inspíranos la ",
                    "práctica del bien.",
                    "Esp Santo",
                    " concédenos la única",
                    " ciencia necesaria.",
                    "Esp Santo",
                    " haz que perseveremos",
                    " en tu justicia.",
                    "Esp Santo",
                    " imprime en nosotros ",
                    " el horror al pecado.",
                    "Esp Santo",
                    " concédenos el mérito ",
                    " de todas las virtudes.",
                    "Esp Santo",
                    " sé Tú nuestra eterna ",
                    "recompensa.",
                    "Cordero de Dios que ",
                    "quitas el pecado",
                    " del mundo,",
                    "envía a nosotros tu Esp",
                    "Cordero de Dios que ",
                    "quitas el pecado",
                    " del mundo,",
                    "llena nuestras almas con",
                    " los dones del Esp Santo.",
                    "Cordero de Dios que ",
                    "quitas el pecado",
                    " del mundo,",
                    "haz que el Esp Santo",
                    " produzca en nosotros",
                    " sus frutos."
                };
        primeraCarga();
    }
}
