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

public class QueryController2 extends Application implements Initializable
{
	@FXML TableView<Q7> table1;
	@FXML TableColumn<Q7, String> a;
	@FXML TableColumn<Q7, String> b;
	@FXML TableColumn<Q7, String> c;
	@FXML TableColumn<Q7, String> d;
	@FXML TableColumn<Q7, String> e;
	static ArrayList<Q7> array;
	
	public static void main(String[] args) 
	{
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
				a.setCellValueFactory(new PropertyValueFactory<Q7, String>("x"));
				b.setCellValueFactory(new PropertyValueFactory<Q7,String>("a"));
				c.setCellValueFactory(new PropertyValueFactory<Q7,String>("b"));
				d.setCellValueFactory(new PropertyValueFactory<Q7,String>("c"));
				e.setCellValueFactory(new PropertyValueFactory<Q7,String>("d"));
				
				ObservableList<Q7> entries = FXCollections.observableArrayList();
				entries.add(new Q7("a","b","c","d","e"));
				entries.add(new Q7("c","d","e","f","g"));
				entries.add(new Q7("e","f","g","h","i"));
			
				
				table1.setItems(entries);
				
				table1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
				
				//table1.getColumns().addAll(fname, lname);
				//table1.setLayoutX(170);
				//table1.setLayoutY(100);
				//System.out.println(Controller.ap==null);
				//Controller.ap.getChildren().addAll(table1);
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
