package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btCancel;
	
	@FXML
	private Button btSave;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("teste do save");
	}
	
	public void onBtCancelAction() {
		System.out.println("teste do calnce");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	private void initializeNode() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	

}
