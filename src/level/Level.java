package level;

import graphics.Screen;

public abstract class Level {
    protected int width, height;
    protected int[] tiles;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new int[width * height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
    }

    protected void generateLevel() {
    }

    private void loadLevel(String path) {
    }

    protected void time() {
    }

    public void update() {
    }

    public void render(int xScroll, int yScroll, Screen screen) {
    }

}
