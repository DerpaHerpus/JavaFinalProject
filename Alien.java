package com.zetcode;

import javax.swing.ImageIcon;

<<<<<<< HEAD:Alien.java
public class Alien extends Sprite {
=======
public class Enemies extends Sprite
{
>>>>>>> db93ad06605d8125af6df599f1bf8c6adc6e990e:Enemies.java

    private Bomb bomb;
    private final String alienImg = "src/images/alien.png";

<<<<<<< HEAD:Alien.java
    public Alien(int x, int y) {
=======
    public Enemy(int x, int y)
    {
>>>>>>> db93ad06605d8125af6df599f1bf8c6adc6e990e:Enemies.java

        initAlien(x, y);
    }

<<<<<<< HEAD:Alien.java
    private void initAlien(int x, int y) {
=======
    private void initEnemy(int x, int y)
    {
>>>>>>> db93ad06605d8125af6df599f1bf8c6adc6e990e:Enemies.java

        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y);
        ImageIcon ii = new ImageIcon(alienImg);
        setImage(ii.getImage());
    }

    public void act(int direction)
    {

        this.x += direction;
    }

    public Bomb getBomb()
    {

        return bomb;
    }

    public class Bomb extends Sprite
    {

        private final String bombImg = "src/images/bomb.png";
        private boolean destroyed;

        public Bomb(int x, int y)
        {

            initBomb(x, y);
        }

        private void initBomb(int x, int y)
        {

            setDestroyed(true);
            this.x = x;
            this.y = y;
            ImageIcon ii = new ImageIcon(bombImg);
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
