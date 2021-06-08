import java.awt.*;
import java.util.ArrayList;

public class Player extends Rectangle implements Shooter {

    private ArrayList<Bullet> bullets = new ArrayList<Bullet>();

    public Player(int x, int y, int width, int height) {

        setBounds(x, y, width, height);

    }

    public void tick() {

        ArrayList<Bullet> offScreen = new ArrayList<Bullet>();

        for (Bullet b : this.bullets) {
            b.tick();
            if (b.getY() + b.getHeight() < 0) {
                offScreen.add(b);
            }
        }

        this.bullets.removeAll(offScreen);

    }

    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.fillRect(this.x, this.y, this.width, this.height);

        for (Bullet b : this.bullets) {
            b.draw(g);
        }
    }

    public void shoot(int velocity) {

        Bullet b = new Bullet(this.x + this.width / 2.0 - 5, this.y, 10, 10, -10);

        bullets.add(b);
    }

    public void setDx(int dx) {
        this.x += dx;
    }

    public void setDy(int dy) {
        this.y += dy;
    }
}
