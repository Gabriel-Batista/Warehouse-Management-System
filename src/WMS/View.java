package WMS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class View extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ProductPage.fxml"));
        primaryStage.setTitle("Warehouse Management System");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // set scene's default size to be two-thirds of screens resolution
        primaryStage.setScene(new Scene(root, screenSize.getWidth()*2/3, screenSize.getHeight()*2/3));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}