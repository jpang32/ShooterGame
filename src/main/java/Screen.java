import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;


public class Screen extends JPanel implements ActionListener, KeyListener {

    Timer t = new Timer(10, this);
    Player p = new Player(10, 430, 15, 15);
    SliderEnemy sTest = new SliderEnemy();

    public Screen() {
        addKeyListener(this);
        setFocusable(true);

        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        p.tick();

        //This will automatically call the paint function
        repaint();
    }

    @Override
    public void paint(Graphics g) {
       g.clearRect(0, 0, getWidth(), getHeight());

       sTest.draw(g);

       p.draw(g);
    }

    @Override
    public void keyTyped(KeyEvent k) {


    }

    @Override
    public void keyPressed(KeyEvent k) {

        switch(k.getKeyCode()) {
            case KeyEvent.VK_D:
                p.setDx(10);
                break;
            case KeyEvent.VK_A:
                p.setDx(-10);
                break;
            case KeyEvent.VK_SPACE:
                p.shoot(-10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent k) {

    }
}
