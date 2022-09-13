package utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ManipulaImagem {
    
    public static BufferedImage setDimensao(String caminho, int larguraDesejada, int alturaDesejada){
        Double largura = null;
        Double altura = null;
        Double proporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;
        
        try {
            imagem = ImageIO.read(new File(caminho));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ManipulaImagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        largura = (double) imagem.getWidth();
        altura = (double) imagem.getHeight();
        
        // Largura maior que a desejada
        if(largura >= larguraDesejada) {
            proporcao = (altura / largura); // Proporção da imagem original
            largura = (double) larguraDesejada;
            altura = (double) (largura * proporcao);
            // Se a altura for maior que a altura desejada, diminui a largura até que a altura
            // fique igual ao valor desejado, mantendo a proporção para a largura
            while(altura > alturaDesejada){
                largura = (double) (--larguraDesejada);
                altura = (largura * proporcao);
            }
        } 
        // Altura maior que a desejada
        else if (altura >= alturaDesejada){
            proporcao = (largura / altura); // Proporção da imagem original
            altura = (double) alturaDesejada;
            
            while(largura > larguraDesejada){
                altura = (double) (--alturaDesejada);
                largura = (altura * proporcao);
            }
        }
        
        novaImagem = new BufferedImage(largura.intValue(), altura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, largura.intValue(), altura.intValue(), null);
        
        return novaImagem;
    }
}
