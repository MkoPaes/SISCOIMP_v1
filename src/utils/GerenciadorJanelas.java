package utils;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GerenciadorJanelas {
    private static JDesktopPane jdp;
    
    public GerenciadorJanelas (JDesktopPane jdp) {
        GerenciadorJanelas.jdp = jdp;
    }
    
    public void abrirJanela (JInternalFrame jif) {
        if (jif.isVisible()){
            jif.toFront();
            jif.requestFocus();
        } else {
            jdp.add(jif);
            jif.setVisible(true);
        }
    }
}
