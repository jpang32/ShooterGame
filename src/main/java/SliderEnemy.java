import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

public class SliderEnemy extends Area implements Enemy, Shooter, ActionListener {

    private Rectangle rec;

    // Triangle oriented upside-down. x and y defined as upper left-hand vertex.
    private int tri_width;
    private int tri_height;

    private Timer t = new Timer(10, this);

    public SliderEnemy() {
        this.rec = new Rectangle(10, 10, 30, 10);

        this.tri_width = 14;
        this.tri_height = 10;
    }

    public SliderEnemy(int rec_x, int rec_y, int rec_width, int rec_height,
                       int tri_width, int tri_height) {

        this.rec = new Rectangle(rec_x, rec_y, rec_width, rec_height);

        this.tri_width = tri_width;
        this.tri_height = tri_height;

    }

    public void draw(Graphics g) {
        // Graphics is the abstract class, Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        g2.fill(this.rec);

        int[] tri_x = new int[] {this.rec.x + this.rec.width / 2 - this.tri_width / 2,
                                 this.rec.x + this.rec.width / 2 + this.tri_width / 2,
                                 this.rec.x + this.rec.width / 2};
        int[] tri_y = new int[] {this.rec.y + this.rec.height,
                                 this.rec.y + this.rec.height,
                                 this.rec.y + this.rec.height + this.tri_height};
        g2.fillPolygon(tri_x, tri_y, 3);


    }

    @Override
    public void move() {

        


    }

    public void tick() {



    }

    @Override
    public void transition() {

    }

    @Override
    public boolean isHit(Bullet b) {

        return true;

    }

    @Override
    public void shoot(int velocity) {

    }
}
