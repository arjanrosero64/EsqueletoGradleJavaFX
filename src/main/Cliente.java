package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Vbox;
import javafx.stage.Stage;


public class Cliente extends Application {

	@Override
	
	public void start(Stage escenarioPrincipal) {
		try {
			 VBox raiz = new VBox;
			 raiz.setPadding(new Insets(40));
			 raiz.setSpacing(10);
			 
			 Label lbSelecciona= new Label("Selecciona el cliente:");
			 ListView<String> 1vCliente = new listView<>(FXCollections.observableArrayList("Pepe", "Jose", "Pedro", "Paco"));
			 1vComplementos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			 
			 raiz.getChildren().addAll(1bSelecciona, 1vComplementos);
			 
			 Scene escena =new Scene(300, 200);
			 escenarioPrincipal.setTittle("CLIENTES DEL CINE");
			 escenarioPrincipal.setScene(escena);
			 escenarioPrincipal.show();
			 
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		
		public static void main(String[] args) {
			launch(args);
			
		
	}
	
	
	
}
