import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GameMap {
    /*
    constructor
    @param width width of the map
    @param height height of the map
    @param gameLevel difficulty level of the game
     */
    private final int LEVEL1 = 0;
    private final int LEVEL2 = 1;
    private final int LEVEL3 = 2;
    private int currentLevel;
    private final int range = 25;

    private HashMap<String, ArrayList<Point>> map;

    public GameMap(int width, int height, int gameLevel) {
        if (gameLevel == 0)
            currentLevel = LEVEL1;
        else if (gameLevel == 1)
            currentLevel = LEVEL2;
        else if (gameLevel == 2)
            currentLevel = LEVEL3;
        else
            currentLevel = LEVEL1;

        // define the map
        map = new HashMap<>();
        int step = width / range;
        if (currentLevel == LEVEL1) {
            ArrayList<Point> aList = new ArrayList<>();
            aList.add(new Point(width - range, range));
            map.put("x" + range + "y" + range, aList);
            int x2 = width - range;
            ArrayList<Point> bList = new ArrayList<>();
            bList.add(new Point(x2, range));
            map.put("x" + x2 + "y" + range, bList);
        }
    }

    // returns a random location on the map
    public Point getLocation() {
        int rand = (int) (Math.random() * map.size()) + 1;
        int count = 0;
        Set<String> entry = map.keySet();
        int x = 0;
        int y = 0;
        for (String s : entry) {
            count++;
            if (count == rand) {
                x = Integer.parseInt(s.substring(s.indexOf("x") + 1, s.indexOf("y")));
                y = Integer.parseInt(s.substring(s.indexOf("y") + 1));
                break;
            }
        }
        return new Point(x, y);
    }

}
