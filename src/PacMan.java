
/*
Defines PacMan object that represents
a single player of a PacMan game
 */

public class PacMan {
    private int locX, locY;

    public PacMan(int locX, int locY) {
        this.locX = locX;
        this.locY = locY;
    }

    public void setLocX(int x) {
        locX = x;
    }

    public int getLocX() {
        return locX;
    }

    public void setLocY(int y) {
        locY = y;
    }

    public int getLocY() {
        return locY;
    }
}
