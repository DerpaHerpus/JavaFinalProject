import java.io.File;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javafx.scene.image.Image;

public class Player extends Sprite implements Constants
{
  private final int START_Y = 280;
  private final int START_X = 270;

  Image playerImg = new Image("Player.png");
  private int width;

  public Player()
  {
    initPlayer();
  }

  private void initPlayer()
  {
    ImageIcon ii = new ImageIcon(playerImg);
    width = ii.getimage().getWidth(null);

    setImage(ii.getImage());
    setX(START_X);
    setY(START_Y);
  }

}
