package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		//coloca o null se nao quiser o cabeçalho no alerta
		Alerts.showAlert("Alert title", null, "Hello", AlertType.INFORMATION); 
	}
}
