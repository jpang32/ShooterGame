import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Bullet extends Ellipse2D.Double {

    private int velocity;

    public Bullet(double x, double y, double width, double height, int velocity) {
        setFrame(x, y, width, height);
        this.velocity = velocity;
    }

    public void tick() {
        this.y += this.velocity;
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.fill(this);

    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }
}
