package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class finalProject extends JFrame implements Commons
{
  public finalProject()
  {
        initUI();
  }

  private void initUI()
  {

    add(new Map());
    setTitle("Space Invaders");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(BOARD_WIDTH, BOARD_HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
  }

  public static void main(String[] args)
  {

  EventQueue.invokeLater(() ->
    {
      finalProject ex = new finalProject();
      ex.setVisible(true);
    });
  }
}
