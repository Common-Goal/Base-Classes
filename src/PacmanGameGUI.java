import javax.swing.*;
import java.awt.*;

public class PacmanGameGUI extends JFrame {
    private static PacMan pMan;
    private static GameMap map;
    private static AnimationPanel animate;

    public PacmanGameGUI() {
        // gets the system Display size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int) screenSize.getWidth() / 2;
        int h = (int) screenSize.getHeight() / 3;

        setSize(new Dimension(w, h));
        map = new GameMap(w, h, 0);
        pMan = new PacMan()
        setContentPane(animate);


    }

    private static class AnimationPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }

}
