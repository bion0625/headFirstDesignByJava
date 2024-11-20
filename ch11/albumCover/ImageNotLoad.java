package ch11.albumCover;

import javax.swing.*;
import java.awt.*;

public class ImageNotLoad implements Icon {

    ImageProxy imageProxy;

    public ImageNotLoad(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x+300, y+190);
        if (!imageProxy.isRetrieving()) {
            imageProxy.setRetrieving(true);

            imageProxy.setRetrievalThread(new Thread(() -> {
                try {
                    imageProxy.setImageIcon(new ImageIcon(imageProxy.getImageUrl(), "Album Cover"));
                    imageProxy.setIsImageLoad(imageProxy.getImageLoad());
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }));
            imageProxy.getRetrievalThread().start();
        }
    }
}
