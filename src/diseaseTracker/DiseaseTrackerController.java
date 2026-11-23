package diseaseTracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class DiseaseTrackerController {

	@FXML
	private Slider populationSlider;
	@FXML
	private Label populationLabel;
	@FXML
	private Slider vaxSlider;
	@FXML
	private Label vaxLabel;
	@FXML
	private Slider transmissionSlider;
	@FXML
	private Label transmissionLabel;
	@FXML
	private Slider recoverySlider;
	@FXML
	private Label recoveryLabel;
	
	@FXML
	public void initialize() {

		// === Sliders Initialized to Labels ===
	    populationSlider.valueProperty().addListener(
	        (observable, oldValue, newValue) -> {
	        		populationLabel.setText(
	                String.valueOf(newValue.intValue())
	            );
	        }
	    );
	    
	    vaxSlider.valueProperty().addListener(
		        (observable, oldValue, newValue) -> {
		        		vaxLabel.setText(
		                String.valueOf(newValue.intValue() + "%")
		            );
		        }
		    );
	    
	    transmissionSlider.valueProperty().addListener(
		        (observable, oldValue, newValue) -> {
		        		transmissionLabel.setText(
		                String.valueOf(newValue.intValue() + "%")
		            );
		        }
		    );
	    
	    recoverySlider.valueProperty().addListener(
		        (observable, oldValue, newValue) -> {
		        		recoveryLabel.setText(
		                String.valueOf(newValue.intValue() + " Days")
		            );
		        }
		    );
	}
}
