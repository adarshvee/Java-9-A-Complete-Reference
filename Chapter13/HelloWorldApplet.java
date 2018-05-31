/*
 * Applet using AWT - My first ever Applet
 */
package Chapter13;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author Adarsh V
 */

/*
<applet code = "HelloWorldApplet" width = 200 height = 60>
*/
public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World from an Applet", 20, 20);
        
    }
}
