import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
    int numOfCookies = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("THEN");
        // Controls
        Label label1 = new Label("Welcome to your Fave App");
        label1.setLineSpacing(10);
        label1.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        Text text1 = new Text("# of Cookies: "+ numOfCookies);
        text1.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        Button button1 = new Button("Click Me");
        button1.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        button1.setOnAction(actionEvent -> {
            System.out.println("NOW");
            numOfCookies = numOfCookies + 1;
            text1.setText("# of Cookies: "+ numOfCookies);
        });

        // Layout
        HBox hbox1 = new HBox(button1, text1);
        VBox vbox2 = new VBox(label1, hbox1);

        // Scenes
        Scene scene1 = new Scene(vbox2,600,200);

        // Stages
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Cookie Clicker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}