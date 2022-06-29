import javax.swing.JFrame;
import java.awt.event.*;    

public class Frame extends JFrame implements KeyListener{
    private boolean on = false;
    public Frame(){
        super();

        this.setFocusable(true);
        this.requestFocus(true);
        this.addKeyListener(this);
        this.setSize(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {   
        if(e.getKeyCode() == KeyEvent.VK_F5){
            on = !on;
        }else{
            System.out.println("hello");
        }
    }

    public boolean getOn(){
        return on;
    }
}
