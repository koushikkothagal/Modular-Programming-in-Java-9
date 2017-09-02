package packt.addressbook.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import packt.util.SortUtil;
import packt.contact.model.Contact;
import packt.contact.util.ContactLoadException;
import packt.contact.util.ContactLoader;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		List<Contact> contacts = new ArrayList<>();
		ContactLoader contactLoader = new ContactLoader();
		try {
			contacts = contactLoader.parseXml("/Users/kkothagal/Documents/workspace-new/java-xml/input.txt");
		} catch (ContactLoadException e) {

			System.exit(0);
		}
		SortUtil sortUtil = SortUtil.getProviderInstance(contacts.size());
		if (sortUtil != null) {
			sortUtil.sortList(contacts);
		}
        
		primaryStage.setTitle("Addressbook Viewer");

		BorderPane root = new BorderPane();
		HBox hbox = generateTitleHBox();
		root.setTop(hbox);
		
		
		
		GridPane grid = new GridPane();
	    grid.setVgap(10);
	    grid.setPadding(new Insets(0, 10, 0, 10));

	    Label name = new Label();
		name.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		GridPane.setHalignment(name, HPos.RIGHT);
		grid.add(name, 0, 1);

		Label phone = new Label();
		phone.setFont(Font.font("Verdana", FontWeight.NORMAL, 15));
		GridPane.setHalignment(phone, HPos.RIGHT);
		grid.add(phone, 0, 2);
		
		Label addressLabel = new Label();
		addressLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		GridPane.setHalignment(addressLabel, HPos.RIGHT);
		grid.add(addressLabel, 0, 3);
		
		Label street = new Label();
		GridPane.setHalignment(street, HPos.RIGHT);
		grid.add(street, 0, 4);
		
		Label city = new Label();
		GridPane.setHalignment(city, HPos.RIGHT);
		grid.add(city, 0, 5);
		
		Label state = new Label();
		GridPane.setHalignment(state, HPos.RIGHT);
		grid.add(state, 0, 6);
		
		Label country = new Label();
		GridPane.setHalignment(country, HPos.RIGHT);
		grid.add(country, 0, 7);
		
		
		
		final List<Contact> finalContactList = contacts;
		// Create a new JavaFX ListView
		ListView<String> list = new ListView<String>();
		// Collect a String list of Contact names in lastName, firstName format
		List<String> listContactNames = contacts.stream().map(c -> c.getLastName() + ", " + c.getFirstName())
				.collect(Collectors.toList());
		// Build an ObservableList from the list of names
		ObservableList<String> obsContactNames = FXCollections.observableList(listContactNames);
		// Pass that to ListView to have them displayed in a list
		list.setItems(obsContactNames);
		// Add listener to handle click events
		list.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
			// Get the selected index in the ListView
			int selectedIndex = list.getSelectionModel().getSelectedIndex();
			name.setText(newVal);
			// Get the Contact instance which was clicked
			Contact contact = finalContactList.get(selectedIndex);
			// Set the values to the labels on the right
			phone.setText("Phone: " + contact.getPhone());
			addressLabel.setText("Address");
			street.setText(contact.getAddress().getStreet());
			city.setText(contact.getAddress().getCity());
			state.setText(contact.getAddress().getState());
			country.setText(contact.getAddress().getCountry());
			
		});
			
		list.setPrefWidth(300);
		list.setPrefHeight(650);
		root.setLeft(list);
		root.setRight(grid);
		
		
		
		
		
		primaryStage.setScene(new Scene(root, 700, 550));
		primaryStage.show();

	}

	public HBox generateTitleHBox() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-background-color: #336699;");

		Label appTitle = new Label("Addressbook Reader");
		appTitle.setTextFill(Color.web("#FFFFFF"));
		appTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		hbox.getChildren().add(appTitle);

		return hbox;
	}

}
