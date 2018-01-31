public class Sprite
{
  private boolean alive;
  private Image image;
  private int x;
  private int y;
  private boolean dying;
  private int dx;

  public Sprite()
  {
    alive = true;
  }
  public void die()
  {
    alive = false;
  }
  public boolean isAlive()
  {
    return alive;
  }
  private void setAlive(boolean alive){
    this.alive = alive;
  }
  public void setImage(Image image)
  {
    this.image = image;
  }
  public Image getImage()
  {
    return image;
  }
  public void setX(int x)
  {
    this.x = x;
  }
  public void setY(int y)
  {
    this.y = y;
  }
  public int getY()
  {
    return y;
  }
  public int getX()
  {
    return x;
  }
  public void setDying (boolean dying)
  {
    this.dying = dying;
  }
  public boolean isDying()
  {
    return this.dying;
  }
}
