
package foto;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;


public class fondoIma implements Border{
    public BufferedImage back;
    
    public fondoIma(String img){
        try {
            URL imagePath = new URL(getClass().getResource(img).toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {
        }
    }

    public fondoIma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, x, y, width,height,null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
