import javax.swing.JFrame;
import java.awt.GridLayout;

public class Frame extends JFrame {

    public Frame() {
        //Sets operation that happens when user closes Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Sets title
        setTitle("Game");
        //Sets size
        setSize(500, 500);
        //User unable to resize window
        setResizable(false);

        init();
    }

    public void init() {

        //Sets window relative to specified component (null means window is in center of screen)
        setLocationRelativeTo(null);

        setLayout(new GridLayout(1, 1, 0, 0));

        Screen s = new Screen();

        //adds child to Frame
        add(s);
        //Shows window
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame f = new Frame();
    }
}
