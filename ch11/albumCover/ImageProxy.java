package ch11.albumCover;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageUrl;
    private Thread retrievalThread;
    boolean retrieving = false;

    private Icon isImageLoad;
    private ImageLoad imageLoad;
    private ImageNotLoad imageNotLoad;

    public ImageProxy(URL url) {
        this.imageUrl = url;
        if (imageIcon != null) {
            imageLoad = new ImageLoad(imageIcon);
            setIsImageLoad(imageLoad);
        }
        else {
            imageNotLoad = new ImageNotLoad(this);
            setIsImageLoad(imageNotLoad);
        }
    }

    @Override
    public int getIconWidth() {
        return isImageLoad.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return isImageLoad.getIconHeight();
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        isImageLoad.paintIcon(c, g, x, y);
    }

    public ImageLoad getImageLoad() {
        imageLoad = new ImageLoad(imageIcon);
        return this.imageLoad;
    }
    public ImageNotLoad getImageNotLoad() {
        return this.imageNotLoad;
    }

    public void setIsImageLoad(Icon icon) {
        this.isImageLoad = icon;
    }

    public boolean isRetrieving() {
        return this.retrieving;
    }
    public void setRetrieving(boolean retrieving) {
        this.retrieving = retrieving;
    }

    public Thread getRetrievalThread() {
        return this.retrievalThread;
    }

    public URL getImageUrl() {
        return this.imageUrl;
    }

    public void setRetrievalThread(Thread retrievalThread) {
        this.retrievalThread = retrievalThread;
    }
}
