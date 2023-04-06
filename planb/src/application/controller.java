package application;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class controller {

    @FXML
    private TableColumn<Player, String> player1Column;

    @FXML
    private TableColumn<Player, String> player2Column;

    @FXML
    private TableColumn<Player, String> player3Column;

    @FXML
    private TableColumn<Player, String> player4Column;

    @FXML private TableView<Player> tableView;
    @FXML
    private Button myButton;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button15;

    @FXML
    private Button button16;
    @FXML
    private Button button17;
    @FXML
    private Button button18;

    private ObservableList<Player> players;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();
        int playerIndex = Integer.parseInt(buttonText.substring(buttonText.length() - 1)) - 1;
        players.get(playerIndex).setScore(players.get(playerIndex).getScore() + 1);
        disableButtonOnClicked(button);
        button1.setDisable(true);
    }


    public void disableButtonOnClicked(Button button) {
        button.setDisable(true);
        button.setStyle("-fx-background-color: #ff0000;");
    }


  
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the table view columns
        player1Column.setCellValueFactory(new PropertyValueFactory<>("name"));
        player2Column.setCellValueFactory(new PropertyValueFactory<>("name"));
        player3Column.setCellValueFactory(new PropertyValueFactory<>("name"));
        player4Column.setCellValueFactory(new PropertyValueFactory<>("name"));

  
        tableView.setItems(players);

        // Set the button values randomly
        int zeroButtonIndex = new Random().nextInt(16);
        for (int i = 0; i < 16; i++) {
            if (i == zeroButtonIndex) {
                setButtonValueToZero(i);
            } else {
                setButtonValueToOne(i);
            }
        }
    }

    private void setButtonValueToOne(int index) {
        getButtonByIndex(index).setText("1");
    }

    private void setButtonValueToZero(int index) {
        getButtonByIndex(index).setText("0");
    }

    private Button getButtonByIndex(int index) {
        switch (index) {
            case 0:
                return button1;
            case 1:
                return button2;
            case 2:
                return button3;
            case 3:
                return button4;
            case 4:
                return button5;
            case 5:
                return button6;
            case 6:
                return button7;
            case 7:
                return button8;
            case 8:
                return button9;
            case 9:
                return button10;
            case 10:
                return button11;
            case 11:
                return button12;
            case 12:
                return button13;
            case 13:
                return button14;
            case 14:
                return button15;
            case 15:
                return button16;
           
            case 16:
                return button17;
            case 17:
                return button18;
            default:
                throw new IllegalArgumentException("Invalid button index: " + index);
        }
    }


    public void setPlayers(ObservableList<Player> players) {
        this.players = players;
        tableView.setItems(players);
    }
    public void handlemyButton(ActionEvent event) throws IOException {
	
	    
	    // Load the FXML file for the second scene with the entered text as a parameter
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
	    Parent root = loader.load();
	    
	   

	    Scene secondScene = new Scene(root, 320, 200);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(secondScene);
	}
    

}
