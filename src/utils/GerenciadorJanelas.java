package utils;

import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class GerenciadorJanelas {
    private static JDesktopPane jdp;
    
    public GerenciadorJanelas (JDesktopPane jdp) {
        GerenciadorJanelas.jdp = jdp;
    }
    
    public GerenciadorJanelas(){}
    
    public void abrirJanela (JInternalFrame jif) {
        if (jif.isVisible()){
            jif.toFront();
            jif.requestFocus();
        } else {
            jdp.add(jif);
            jif.setVisible(true);
        }
    }
    
    public void abrirFrame (JFrame jf) {
        if (jf.isVisible()){
            jf.toFront();
            jf.requestFocus();
        } else {
            jf.setVisible(true);
        }
    }
    
    public void abrirDialog (JDialog jd) {
        if (jd.isVisible()){
            jd.toFront();
            jd.requestFocus();
        } else {
            jd.setVisible(true);
        }
        
    }
}
