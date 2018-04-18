
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class QueryController1 extends Application implements Initializable
{
	@FXML TableView<Q4> table1;
	@FXML TableColumn<Q4, String> y;
	static ArrayList<Q4> array;

	public static void main(String[] args) 
	{
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		y.setCellValueFactory(new PropertyValueFactory<Q4, String>("x"));
		
		ObservableList<Q4> entries = FXCollections.observableArrayList();
		entries.add(new Q4("a"));
		entries.add(new Q4("c"));
		entries.add(new Q4("e"));
				
		table1.setItems(entries);
		table1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void back() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("InsertData.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// TODO Auto-generated method stub
	}
	
	public ObservableList<Q1> getQ1()
	{
		ObservableList<Q1> entries = FXCollections.observableArrayList();
		entries.add(new Q1("a","b"));
		entries.add(new Q1("c","d"));
		entries.add(new Q1("e","f"));
		System.out.println("Hi");
		System.out.println(entries.size());
//		for(int y=0; y<entries.size(); y++)
//		{
//			System.out.println(entries.get(y).);
//		}
		return entries;
	}

	
	

}

