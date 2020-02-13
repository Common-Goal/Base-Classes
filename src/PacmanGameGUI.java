import javax.swing.*;
import java.awt.*;

public class PacmanGameGUI extends JFrame {
    private static PacMan pMan;
    private final static int pManDiameter = 20;
    private static GameMap map;
    private static AnimationPanel animate;

    public PacmanGameGUI() {
        // gets the system Display size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int) screenSize.getWidth() / 2;
        int h = (int) screenSize.getHeight() / 2;

        setTitle("PAC MAN");
        setSize(new Dimension(w, h));
        map = new GameMap(w, h, 0);
        Point loc = map.getLocation();
        pMan = new PacMan(loc.x, loc.y);
        animate = new AnimationPanel();
        setContentPane(animate);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

    private static class AnimationPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            //set the rendering hint, this makes the drawing smoother
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            // draw the pacman
            g.setColor(Color.BLUE);
            g.fillOval(pMan.getLocX() - pManDiameter / 2, pMan.getLocY() - pManDiameter / 2, pManDiameter, pManDiameter);


        }
    }

    public static void main(String[] args) {
        new PacmanGameGUI();
    }

}
