package diseaseTracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiseaseTracker extends Application {

	@Override
	    public void start(Stage stage) throws Exception {

	        FXMLLoader loader = new FXMLLoader(
	            getClass().getResource("resources/DiseaseTracker.fxml")
	        );

	        Scene scene = new Scene(loader.load());

	        stage.setTitle("My JavaFX Application");
	        stage.setScene(scene);
	        stage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
}
