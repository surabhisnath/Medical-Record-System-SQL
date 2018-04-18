import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller extends Application implements Initializable
{
	
	public static AnchorPane ap;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
	}
	
	public void start(Stage primaryStage) throws Exception
	{
		Parent root=FXMLLoader.load(getClass().getResource("InsertData.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void back() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	
	public void query1() throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Query.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query2() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query2.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query3() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query3.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query4() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query4.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query5() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query5.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query6() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query6.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query7() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query7.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query8() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query8.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query9() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query9.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query10() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query10.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query11() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query11.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	public void query12() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Query12.fxml"));
		Scene scene = new Scene(root);
		Main.ps.setScene(scene);
		Main.ps.show();
	}
	
	

	public static void main(String[] args) 
	{
		
	}

}
