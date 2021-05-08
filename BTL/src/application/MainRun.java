package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import preprocess.InitData;

public class MainRun extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
		Scene scene = new Scene(root, 1000, 600);
		primaryStage.initStyle(StageStyle.UTILITY);
		primaryStage.setTitle("BTL20202");
		primaryStage.setScene(scene);
		primaryStage.show();
		InitData.init();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	public static void main(String[] args) {
		launch(args);
	}
}
