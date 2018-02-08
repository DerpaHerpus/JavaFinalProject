import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class Enemies extends JPanel
{
  private int size, x, y, dx, dy, bx, by, dbx, dby, numBombs;
  private Random gen;
  private Image im;
  //private Image enemyImg;
  //Image enemyImg = new Image("Enemy.png");

  Image enemyImg = new Image("Enemy.png");

  public Enemies(int x1, int y1, string f)
  {
    size = 25;
    dx = 0;
    dy = 0;
    bx = -1;
    by = -1;
    dbx = 2;
    dby = 2;
    x = x1;
    y = y1;
    numBombs = 5;
  }
  public void moveLeft()
  {
    dx = -1;
    if (x<=5)
      x = 850;
  }
  public void moveRight()
  {
    dx = 1;
    if (x >= 850)
      x = 6;
  }
  public void draw(Graphics gr)
  {
    x += dx;
      gr.drawImage(im, x, y, size, size, Color.black, this);
  }

  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public int getBY()
  {
    return by;
  }
}
