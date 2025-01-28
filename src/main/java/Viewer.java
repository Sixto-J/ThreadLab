import java.awt.*;

public class Viewer extends Canvas implements Runnable{

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
        //setBackground (Color.GRAY);
        //setSize(300, 200);
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }
}
