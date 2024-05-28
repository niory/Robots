package robots.gui;
import java.io.Serializable;

public class InternalFrameState implements Serializable {
    private static final long serialVersionUID = 1L;

    private int x;
    private int y;
    private int width;
    private int height;
    private boolean isIcon;

    public InternalFrameState(int x, int y, int width, int height, boolean isIcon) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isIcon = isIcon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isIcon() {
        return isIcon;
    }
}