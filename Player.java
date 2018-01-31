import java.awt.event.KeyEvent;
import java.swing.ImageIcon;

public class Player extends Sprite implements commons
{
  private final int START_Y = 280;
  private final int START_X = 270;

  private final String playerImg = ;//PUT PLAYER SPIRTE HERE
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
