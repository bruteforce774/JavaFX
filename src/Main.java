import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Main extends Application {
    public void start(Stage primaryStage) {
        FlowPane panel = new FlowPane();
        panel.setHgap(10);
        Label etikett = new Label("Brukernavn:");
        TextField brukernavn = new TextField();
        brukernavn.setPrefColumnCount(25);
        panel.getChildren().add(etikett);
        panel.getChildren().add(brukernavn);
        Scene scene = new Scene(panel, 250, 50);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Innlogging");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
