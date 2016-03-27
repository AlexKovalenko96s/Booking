package ua.kas.bookin;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableView;

public class Booking{

	@FXML
	Pagination pagination = new Pagination(10,0);
	TableView<String> table = new TableView<String>();
	int nn;
	
	public void start(){
		pagination.currentPageIndexProperty().addListener(new ChangeListener<Number>(){
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldNumber, Number newNumber) {
				ObservableList<String>date2 = FXCollections.observableArrayList(
						"25.03.2016","26.03.2016","27.03.2016","28.03.2016","29.03.2016");
				table.setItems(date2);
				String nNumber = String.valueOf(newNumber);
				int nn = Integer.parseInt(nNumber) + 1;
				System.out.println(nn);
				if(nn == 5){
					//pagination.setPageFactory(table);
					System.out.println(table.getItems());
				}
			}		
		});
	}
}
