import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Map extends Application implements Constants
{
  private Dimension d;
  private ArrayList<Enemies> enemies;
  private Player player;
  private Shot shot;

  private final int ENEMY_INIT_X = 150;
  private final int ENEMY_INIT_Y = 5;
  private int direction = -1;
  private int deaths = 0;

  private boolean ingame = true;
  private String message = "Game Over";

  public Map();
  {
    initMap();
  }

  private void initMap()
  {
    d = new Dimension(MAP_WIDTH, MAP_HEIGHT);
    setBackground(Color.BLACK);
    gameInit();
  }
  public void gameInit()
  {
    enemies = new ArrayList<>();

    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 6; j++)
      {
        Enemy enemy = new Enemy(ENEMY_INIT_X + 18 * j, ENEMY_INIT_Y + 18 * i);
        enemies.add(enemy);
      }
    }

    player = new Player();
    shot = new Shot();
  }

  public void makeEnemies(Graphics g)
  {
    Iterator it = enemies.iterator();

    for (Enemy enemy: enemies)
    {
      if(enemy.isAlive())
      {
        g.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(), this);
      }
      if(enemy.isDying())
      {
        enemy.die();
      }
    }
  }

  public void makePlayer(Graphics g)
  {
    if (player.isAlive())
    {
      g.drawImage(player.getImage(), player.getX(), player.getY(), this);
    }

    if (player.isDying())
    {
      player.die();
      ingame = false;
    }
  }

  public void makeShot(Graphics g)
  {
    if (shot.isAlive())
    {
      g.drawImage(show.getImage(), shot.getX(), shot.getY(), this);
    }
  }
  public void gameOver()
  {
  }
  public void youWin()
  {
    if (deaths == NUMBER_OF_ENEMIES)
    {
      ingame = false;
      message = "You Win!";
    }
  }
}
