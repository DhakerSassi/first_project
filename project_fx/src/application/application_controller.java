package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class application_controller {
	
	@FXML
    private Button home_button;
	
	//play
	@FXML
    private Button play_button;
	@FXML
    private Button quit_button;
	@FXML
	private AnchorPane play;
	
	//category
	@FXML
	private Button next_button_2_toplayers;
	@FXML
    private CheckBox hayawaneet;
	@FXML
    private CheckBox chouflihal;
	@FXML
    private CheckBox chaksiet_machhoura;
	@FXML
    private CheckBox anime;
	@FXML
    private CheckBox koura;
	@FXML
    private CheckBox ghne;
	@FXML
	private AnchorPane cat;
	
	//playersfxml
	@FXML
    private TextField tfone;
	@FXML
    private TextField tftwo;
	@FXML
    private TextField tfThree;
	@FXML
    private TextField tfFour;
	@FXML
    private Button next_button_3_toprerole;
	@FXML
	private AnchorPane players;
	//prerolefxml
	@FXML
    private Button next_button_4_topostroleig;
	@FXML
    private Label myLabel;
	@FXML
	private AnchorPane pre_role;
	//postrole ig nd out 
	@FXML
    private Button next_button_5_topostroleig;
	@FXML
    private TextField thing;
	@FXML
    private Text nameofplayer;
	
	@FXML
    private Button next_button_6_toquestiontime;
//question time
	@FXML
    private Button next_button_7_toquestionnormal;
//normalquestion
	@FXML
    private Button next_button_8_toplayersvote;
	@FXML
    private Text nameofaskingplayer;
	@FXML
    private Text nameofansweringplayer;
//vote
	@FXML
    private Button player_button1;
	@FXML
    private Button player_button2;
	@FXML
    private Button player_button3;
//playerdetermination
	@FXML
    private Button next_button_9_tothingguessing;
	@FXML
    private Text playerx;
//thingguessing
	@FXML
    private Button option1;
	@FXML
    private Button option2;
	@FXML
    private Button option3;
	@FXML
    private Button option4;
	@FXML
    private Button option5;
	@FXML
    private Button roption;
//score
	@FXML
	private Button next_button_1_tocategory;

@FXML
    private void playButtonClicked(ActionEvent event) {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("categories2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            // Create a new stage and set the new scene as its root
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            // Show the new stage
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public void quitButton() {
	quit_button.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {
			Platform.exit();
			
		}	
			});
}
	public void home(ActionEvent event) {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("play1.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            // Create a new stage and set the new scene as its root
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            // Show the new stage
            stage.show();
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	public void nextPlayer3(ActionEvent event){
		try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("players3.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            // Create a new stage and set the new scene as its root
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            // Show the new stage
            stage.show();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
		 
	}
	
	public static String text="";
	public void handleSubmitButton(ActionEvent event) throws IOException  {
		text = tfone.getText();
		System.out.println(text);
		if(text.equals("")) {
			
			myLabel.setText("fergh");
			
		}else {
			System.out.println(text);
			myLabel.setText(tfone.getText());
			System.out.println(tfone);

			pre_role = FXMLLoader.load(getClass().getResource("pre_role4.fxml"));
				players.getChildren().removeAll();
				players.getChildren().setAll(pre_role);
			

		}
		
	}
	
	}
        
	




