
// Package
package webbrowser;

// custom
import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.net.URISyntaxException;
import javax.swing.plaf.DesktopIconUI;


public class browser {

    public static void openNewTab(String website) {
    try {
        URI uri = new URI(website);
        Desktop.getDesktop().browse(uri);
    } catch ( URISyntaxException | IOException error) {
        error.printStackTrace();
    }
}
}
