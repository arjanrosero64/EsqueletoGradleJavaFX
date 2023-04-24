package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vistatabla extends Application{
	
	public static class Personaje {
		private String nombre;
		private String apellidos;
		
		private Personaje(String nombre, String apellidos) {
			this.nombre=nombre;
			this.apellidos=apellidos;
			
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setnombre(String nombre) {
			this.nombre= nombre;
			
		}
		
		public String getApellidos() {
			return apellidos;
		}
		
		public void  setApellidos(String apellidos) {
			this.apellidos= apellidos;
		}
		
		
	}
	
	private static final ObservableList<Personaje> PERSONAJES =FXCollections.observableArrayList(
			
	new Personaje("Jesus", "Rodríguez")	,
	new Personaje("Bob", "Esponja"),
	new Personaje("Joseph" , "Joestar"),
	new Personaje("Mortadelo", "Filemon"),
	new Personaje("Felipe" , "Martin"));
			
	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			VBox raiz =new VBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			
			Label lbPersonajes=new Label("Personaejes");
			TableView<Personaje> tvPersonajes = new TableView<>();
			TableColumn<Personaje, String> columnaNombre =new TableColumn<>("Nombre");
			TableColumn<Personaje, String> columnaApellidos =new TableColumn<>("Apellidos");
			tvPersonajes.getColumns().add(columnaNombre);
			tvPersonajes.getColumns().add(columnaApellidos);
			tvPersonajes.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			columnaNombre.setMinWidth(100);
			columnaNombre.setCellValueFactoy(new Property);
			
			
		}
		
		
	}

}
