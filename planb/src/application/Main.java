package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
    private ObservableList<Player> players = FXCollections.observableArrayList(
            new Player("Player 1", 0),
            new Player("Player 2", 0),
            new Player("Player 3", 0),
            new Player("Player 4", 0)
    );

    public void start(Stage primaryStage) throws Exception {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        controller Controller = loader.getController();
        Controller.setPlayers(players);
        primaryStage.setTitle("Scoreboard");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


