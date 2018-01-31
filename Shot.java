Import javax.swing.ImageIcon

public class Shot extends Sprite
{
  private final String shotImg = //Put Spriteyboi here;
  private final int H_SPACE = 6;
  private final int V_SPACE = 1;

  Public Shot(int x, int y)
  {
    initShot(x, y);
  }

  private void initShot(int x, int y)
  {
    ImageIcon ii = new ImageIcon(shotImg);
    setImage(ii.getImage());

    setX(x + H_SPACE);
    setY(x + V_SPACE);
  }
}
