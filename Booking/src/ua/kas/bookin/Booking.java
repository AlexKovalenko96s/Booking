package ua.kas.bookin;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Booking implements Initializable{

	int s = 0;
	@FXML Pane p1;
	@FXML Pane p2;
	@FXML Pane p3;
	@FXML ComboBox<String> vag_vubor;
	ObservableList<String>vagonu;
	@FXML CheckBox c1;
	@FXML CheckBox c2;
	@FXML CheckBox c3;
	@FXML CheckBox c4;
	@FXML CheckBox c5;
	@FXML CheckBox c6;
	@FXML CheckBox c7;
	@FXML CheckBox c8;
	@FXML CheckBox c9;
	@FXML CheckBox c10;
	@FXML CheckBox c11;
	@FXML CheckBox c12;
	@FXML Label vag_number;
	@FXML Label how_many;
	@FXML Label how_much;
	String vagon_number;
	static String v;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		vagonu = FXCollections.observableArrayList(
				"Вагон 1","Вагон 2","Вагон 3");
		vag_vubor.setItems(vagonu);
		Connection myConn;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freemove", "root", "root");
			Statement myStmt = myConn.createStatement();
			if("Вагон 1".equals(v)){
				ResultSet myRs = myStmt.executeQuery("select * from odesa_kyiv where vagon = 1");
				
				while (myRs.next()) {
					if(myRs.getString("mesto").equals("1")){
						c1.setDisable(true);
					}
					if(myRs.getString("mesto").equals("2")){
						c2.setDisable(true);
					}
					if(myRs.getString("mesto").equals("3")){
						c3.setDisable(true);
					}
					if(myRs.getString("mesto").equals("4")){
						c4.setDisable(true);
					}
					if(myRs.getString("mesto").equals("5")){
						c5.setDisable(true);
					}
					if(myRs.getString("mesto").equals("6")){
						c6.setDisable(true);
					}
					if(myRs.getString("mesto").equals("7")){
						c7.setDisable(true);
					}
					if(myRs.getString("mesto").equals("8")){
						c8.setDisable(true);
					}
					if(myRs.getString("mesto").equals("9")){
						c9.setDisable(true);
					}
					if(myRs.getString("mesto").equals("10")){
						c10.setDisable(true);
					}
					if(myRs.getString("mesto").equals("11")){
						c11.setDisable(true);
					}
					if(myRs.getString("mesto").equals("12")){
						c12.setDisable(true);
					}
					
				}
			}
			
			if("Вагон 2".equals(v)){
				ResultSet myRs = myStmt.executeQuery("select * from odesa_kyiv where vagon = 2");
				
				while (myRs.next()) {
					if(myRs.getString("mesto").equals("1")){
						c1.setDisable(true);
					}
					if(myRs.getString("mesto").equals("2")){
						c2.setDisable(true);
					}
					if(myRs.getString("mesto").equals("3")){
						c3.setDisable(true);
					}
					if(myRs.getString("mesto").equals("4")){
						c4.setDisable(true);
					}
					if(myRs.getString("mesto").equals("5")){
						c5.setDisable(true);
					}
					if(myRs.getString("mesto").equals("6")){
						c6.setDisable(true);
					}
					if(myRs.getString("mesto").equals("7")){
						c7.setDisable(true);
					}
					if(myRs.getString("mesto").equals("8")){
						c8.setDisable(true);
					}
					if(myRs.getString("mesto").equals("9")){
						c9.setDisable(true);
					}
					if(myRs.getString("mesto").equals("10")){
						c10.setDisable(true);
					}
					if(myRs.getString("mesto").equals("11")){
						c11.setDisable(true);
					}
					if(myRs.getString("mesto").equals("12")){
						c12.setDisable(true);
					}
					
				}
			}
			
			if("Вагон 3".equals(v)){
				ResultSet myRs = myStmt.executeQuery("select * from odesa_kyiv where vagon = 3");
				
				while (myRs.next()) {
					if(myRs.getString("mesto").equals("1")){
						c1.setDisable(true);
					}
					if(myRs.getString("mesto").equals("2")){
						c2.setDisable(true);
					}
					if(myRs.getString("mesto").equals("3")){
						c3.setDisable(true);
					}
					if(myRs.getString("mesto").equals("4")){
						c4.setDisable(true);
					}
					if(myRs.getString("mesto").equals("5")){
						c5.setDisable(true);
					}
					if(myRs.getString("mesto").equals("6")){
						c6.setDisable(true);
					}
					if(myRs.getString("mesto").equals("7")){
						c7.setDisable(true);
					}
					if(myRs.getString("mesto").equals("8")){
						c8.setDisable(true);
					}
					if(myRs.getString("mesto").equals("9")){
						c9.setDisable(true);
					}
					if(myRs.getString("mesto").equals("10")){
						c10.setDisable(true);
					}
					if(myRs.getString("mesto").equals("11")){
						c11.setDisable(true);
					}
					if(myRs.getString("mesto").equals("12")){
						c12.setDisable(true);
					}
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void vagonu (ActionEvent e) throws IOException{
		v = vag_vubor.getEditor().getText();
		vag_number.setText(v);
		System.out.println(v);
		if("Вагон 1".equals(v)){
			Scene booking = new Scene(FXMLLoader.load(getClass().getResource("booking.fxml")));
			booking.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			app_stage.setScene(booking);
			app_stage.show();
		}
		if("Вагон 2".equals(v)){
			Scene booking = new Scene(FXMLLoader.load(getClass().getResource("vagon2.fxml")));
			booking.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			app_stage.setScene(booking);
			app_stage.show();
		}
		if("Вагон 3".equals(v)){
			Scene booking = new Scene(FXMLLoader.load(getClass().getResource("vagon3.fxml")));
			booking.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			app_stage.setScene(booking);
			app_stage.show();
		}
	}
	
	
	public void reset(ActionEvent e){
		c1.setSelected(false);
		c2.setSelected(false);
		c3.setSelected(false);
		c4.setSelected(false);
		c5.setSelected(false);
		c6.setSelected(false);
		c7.setSelected(false);
		c8.setSelected(false);
		c9.setSelected(false);
		c10.setSelected(false);
		c11.setSelected(false);
		c12.setSelected(false);
	}
	
	public void poschotat (ActionEvent e) throws SQLException{
		java.sql.PreparedStatement myStmt;
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freemove", "root", "root");
		if ("Вагон 1".equals(v)) {
			if (c1.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "1");
				myStmt.executeUpdate();
				c1.setDisable(true);
			}
			if (c2.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "2");
				myStmt.executeUpdate();
				c2.setDisable(true);
			}
			if (c3.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "3");
				myStmt.executeUpdate();
				c3.setDisable(true);
			}
			if (c4.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "4");
				myStmt.executeUpdate();
				c4.setDisable(true);
			}
			if (c5.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "5");
				myStmt.executeUpdate();
				c5.setDisable(true);
			}
			if (c6.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "6");
				myStmt.executeUpdate();
				c6.setDisable(true);
			}
			if (c7.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "7");
				myStmt.executeUpdate();
				c7.setDisable(true);
			}
			if (c8.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "8");
				myStmt.executeUpdate();
				c8.setDisable(true);
			}
			if (c9.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "9");
				myStmt.executeUpdate();
				c9.setDisable(true);
			}
			if (c10.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "10");
				myStmt.executeUpdate();
				c10.setDisable(true);
			}
			if (c11.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "11");
				myStmt.executeUpdate();
				c11.setDisable(true);
			}
			if (c12.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (1,?)");
				myStmt.setString(1, "12");
				myStmt.executeUpdate();
				c12.setDisable(true);
			}
		}
		
		if ("Вагон 2".equals(v)) {
			if (c1.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "1");
				myStmt.executeUpdate();
				c1.setDisable(true);
			}
			if (c2.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "2");
				myStmt.executeUpdate();
				c2.setDisable(true);
			}
			if (c3.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "3");
				myStmt.executeUpdate();
				c3.setDisable(true);
			}
			if (c4.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "4");
				myStmt.executeUpdate();
				c4.setDisable(true);
			}
			if (c5.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "5");
				myStmt.executeUpdate();
				c5.setDisable(true);
			}
			if (c6.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "6");
				myStmt.executeUpdate();
				c6.setDisable(true);
			}
			if (c7.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "7");
				myStmt.executeUpdate();
				c7.setDisable(true);
			}
			if (c8.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "8");
				myStmt.executeUpdate();
				c8.setDisable(true);
			}
			if (c9.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "9");
				myStmt.executeUpdate();
				c9.setDisable(true);
			}
			if (c10.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "10");
				myStmt.executeUpdate();
				c10.setDisable(true);
			}
			if (c11.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "11");
				myStmt.executeUpdate();
				c11.setDisable(true);
			}
			if (c12.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (2,?)");
				myStmt.setString(1, "12");
				myStmt.executeUpdate();
				c12.setDisable(true);
			}
		}
		if ("Вагон 3".equals(v)) {
			if (c1.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "1");
				myStmt.executeUpdate();
				c1.setDisable(true);
			}
			if (c2.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "2");
				myStmt.executeUpdate();
				c2.setDisable(true);
			}
			if (c3.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "3");
				myStmt.executeUpdate();
				c3.setDisable(true);
			}
			if (c4.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "4");
				myStmt.executeUpdate();
				c4.setDisable(true);
			}
			if (c5.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "5");
				myStmt.executeUpdate();
				c5.setDisable(true);
			}
			if (c6.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "6");
				myStmt.executeUpdate();
				c6.setDisable(true);
			}
			if (c7.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "7");
				myStmt.executeUpdate();
				c7.setDisable(true);
			}
			if (c8.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "8");
				myStmt.executeUpdate();
				c8.setDisable(true);
			}
			if (c9.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "9");
				myStmt.executeUpdate();
				c9.setDisable(true);
			}
			if (c10.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "10");
				myStmt.executeUpdate();
				c10.setDisable(true);
			}
			if (c11.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "11");
				myStmt.executeUpdate();
				c11.setDisable(true);
			}
			if (c12.isSelected() == true) {
				myStmt = myConn.prepareStatement("insert into odesa_kyiv (vagon, mesto) values (3,?)");
				myStmt.setString(1, "12");
				myStmt.executeUpdate();
				c12.setDisable(true);
			}
		}
		reset(null);
	}
	
	public void proverka(){
		if(c1.isSelected()==true){
			s++;
		}
		if(c2.isSelected()==true){
			s++;
		}
		if(c3.isSelected()==true){
			s++;
		}
		if(c4.isSelected()==true){
			s++;
		}
		if(c5.isSelected()==true){
			s++;
		}
		if(c6.isSelected()==true){
			s++;
		}
		if(c7.isSelected()==true){
			s++;
		}
		if(c8.isSelected()==true){
			s++;
		}
		if(c9.isSelected()==true){
			s++;
		}
		if(c10.isSelected()==true){
			s++;
		}
		if(c11.isSelected()==true){
			s++;
		}
		if(c12.isSelected()==true){
			s++;
		}
		how_many.setText(Integer.toString(s)+" місць обранно.");
		how_much.setText(Integer.toString(s * 50)+"грн.");
		s = 0;
	}
}