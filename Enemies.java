import javafx.scene.image.Image;
import java.awt.image;

public class Enemies extends Sprite
{
  private EnemyShot enemyShot;
  Image enemyImg = new Image("Enemy.png");

  public Enemies(int x, int y)
  {
    initEnemies(x, y);
  }
  private void initEnemies(int x, int y)
  {
    this.x = x;
    this.y = y;

    enemyShot = new EnemyShot(x, y);
    ImageIcon ii = new Image Icon(enemySprite);
    setImage(ii.getImage());
  }
  public void act(int direction)
  {
    this.x += direction;
  }
  public EnemyShot getEnemyShot()
  {
    return enemyShot;
  }
  public class EnemyShot extends Sprite
  {
    private final String enemyShotImg = //Put enemy shot sprite here;
    private boolean destroyed;

    public EnemyShot(int x, int y)
    {
      initEnemyShot(x, y);
    }
    private void initEnemyShot(int x, int y)
    {
      setDestroyed(true);
      this.x = x;
      this.y = y;
      ImageIcon ii = new ImageIcon(enemyShotImg);
      setImage(ii.getImage());
    }
    public void setDestroyed(boolean destroyed)
    {
      this.destroyed = destroyed;
    }
    public boolean isDestroyed()
    {
      return destroyed;
    }
  }
}
