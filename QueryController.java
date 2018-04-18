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

public class QueryController extends Application implements Initializable
{
	@FXML TableView<Q1> table1;
	@FXML TableColumn<Q1, String> fname;
	@FXML TableColumn<Q1, String> lname;
	static ArrayList<Q1> array;

	public static void main(String[] args) 
	{
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		//fname = new TableColumn<>("First Name");
				
				fname.setCellValueFactory(new PropertyValueFactory<Q1, String>("first"));
				
				//lname = new TableColumn<>("Last Name");
				lname.setCellValueFactory(new PropertyValueFactory<Q1,String>("last"));
				
				
				ObservableList<Q1> entries = FXCollections.observableArrayList();
				for(int i=0; i<array.size(); i++)
				{
					entries.add(array.get(i));
				}
				
				//entries.add(new Q1("c","d"));
				//entries.add(new Q1("e","f"));
				
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
