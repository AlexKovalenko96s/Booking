package ua.kas.bookin;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Controller implements Initializable{
	
	@FXML
	Label date;
	@FXML
	Label city_out;
	@FXML
	Label city_in;
	@FXML
	Label time_out;
	@FXML
	Label time_in;
	@FXML
	Label seats;
	@FXML
	private ListView<String> listView;
	@FXML
	private ComboBox<String>city_out_search1;
	@FXML
	private ComboBox<String>city_in_search1;
	@FXML
	private ComboBox<String>date_search1;
	static String city_out1 = "";
	static String city_in1 = "";
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freemove", "root", "root");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from train");
			listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
			
			while (myRs.next()) {
				listView.getItems().addAll(myRs.getString("city_out")+" "+"-"+" "+ myRs.getString("city_in"));
				city_out_search1.getItems().addAll(myRs.getString("city_out"));
				city_in_search1.getItems().addAll(myRs.getString("city_in"));
				date_search1.getItems().addAll(myRs.getString("date"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void work() throws SQLException {

		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freemove", "root", "root");
		ResultSet myRs = null;
		ObservableList<String> movies;
		movies = listView.getSelectionModel().getSelectedItems();

		for (String m : movies) {
			city_out1 = m.substring(0 , m.indexOf("-")-1);
			city_in1 = m.substring(m.indexOf("-")+2);

			java.sql.PreparedStatement myStmt;
			
			myStmt = myConn.prepareStatement("select * from train where city_out =? and city_in=?");	
			myStmt.setString(1, city_out1);
			myStmt.setString(2, city_in1);
			myRs = myStmt.executeQuery();
			while (myRs.next()) {
				date.setText(myRs.getString("date"));
				city_out.setText(myRs.getString("city_out"));
				city_in.setText(myRs.getString("city_in"));
				time_out.setText(myRs.getString("time_out"));
				time_in.setText(myRs.getString("time_in"));
				seats.setText(myRs.getString("seats"));
				
				city_in1 = "";
				city_out1 = "";
			}
		}
		
	}
}
