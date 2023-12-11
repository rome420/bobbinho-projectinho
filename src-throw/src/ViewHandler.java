import Model.ProjectsModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ViewHandler {

  private Stage primaryStage;

  public ViewHandler(ProjectsModel model) {
  }

  public void start(Stage stage) {
    primaryStage = stage;
    showView();
  }

  private void showView() {
    try {
      Parent root = loadView("ProjectsMenu");
      primaryStage.setScene(new Scene(root));
      primaryStage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private Parent loadView(String fxml) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("ProjectsMenu.fxml"));
    return loader.load();
  }

}

