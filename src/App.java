import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

public class App {
    public static void main(String[] args) throws Exception {
        GraphicsDevice[] screens = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        Robot robot = new Robot(screens[1]);

        robot.mouseMove(633, 600);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        while(true){

                if(robot.getPixelColor(517, 226).getRed() == 0){
                    robot.mouseMove(517, 226);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(620, 226).getRed() == 255){
                    robot.mouseMove(620, 226);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(720, 226).getRed() == 255){
                    robot.mouseMove(720, 226);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(820, 226).getRed() == 255){
                    robot.mouseMove(820, 226);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);           
                }
                
                if(robot.getPixelColor(517, 360).getRed() == 255){
                    robot.mouseMove(517, 360);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(620, 360).getRed() == 255){
                    robot.mouseMove(620, 360);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(720, 360).getRed() == 255){
                    robot.mouseMove(720, 360);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(820, 360).getRed() == 255){
                    robot.mouseMove(820, 360);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }

                if(robot.getPixelColor(517, 460).getRed() == 255){
                    robot.mouseMove(517, 460);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(620, 460).getRed() == 255){
                    robot.mouseMove(620, 460);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(720, 460).getRed() == 255){
                    robot.mouseMove(720, 460);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(820, 460).getRed() == 255){
                    robot.mouseMove(820, 460);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }

                if(robot.getPixelColor(517, 560).getRed() == 255){
                    robot.mouseMove(517, 560);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(620, 560).getRed() == 255){
                    robot.mouseMove(620, 560);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(720, 560).getRed() == 255){
                    robot.mouseMove(720, 560);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                if(robot.getPixelColor(820, 560).getRed() == 255){
                    robot.mouseMove(820, 560);    
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
            
        }
    }
}
