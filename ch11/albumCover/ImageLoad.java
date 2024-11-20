package ch11.albumCover;

import javax.swing.*;
import java.awt.*;

public class ImageLoad implements Icon {

    ImageIcon imageIcon;

    public ImageLoad(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }
}
