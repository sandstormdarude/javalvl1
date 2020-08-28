package homework1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Background {
    private Color bgColor = new Color (
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255) );


    public void setBackground (GameCanvas canvas, float deltaTime) {
        if (deltaTime > 10000)
            canvas.setBackground(bgColor);
         deltaTime = 0;



    }

}
