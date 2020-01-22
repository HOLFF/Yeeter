import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.scene.image.Image;

import javafx.stage.Stage;

import java.net.URL;



import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;



import java.net.URL;





public class fxml_loader extends Application {

    @Override

    public void start(Stage primaryStage) throws Exception {

        final URL resource = ClassLoader.getSystemClassLoader().getResource("scene_matcher.fxml");

        if (resource == null) {

            System.out.println("Cannot find FXML file");

            System.exit(-2);

            return;

        }

        final Parent root = FXMLLoader.load(resource);

        final Scene scene = new Scene(root, 780, 440);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Yeeter");

        //primaryStage.getIcons().add(new Image("Senfter/icon.jpg"));

        primaryStage.setResizable(false);

        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);

    }

}