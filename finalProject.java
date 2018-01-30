import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Shell extends Application
{
  public Shell()
  {
    background = new SerializableColor(Color.WHITE);
    currentColor = new SerializableColor(Color.BLACK);
    mainPane  = new BorderPane();
  }
  @Override
  public void init()
  {
  }
  @Override
  public void start(Stage primary)
  {
    this.primary = primary;
    primary.show();
  ]
  @Override
  public void stop()
  {
  }
  private void buildMenus()
  {
  }
  public static void main(String[] args)
  {
    launch(args);
  }
}
