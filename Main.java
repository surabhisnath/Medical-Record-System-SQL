import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;


//class Q1
//{
//	String first;
//	String last;
//
//	public Q1(String a, String b)
//	{
//		first = a;
//		last = b;
//	}
//}

public class Main extends Application implements Initializable
{
	
	static Stage ps;
	public static AnchorPane mainlayout;
	
	@FXML private AnchorPane ap;
//	@FXML private Label Query1;
//	@FXML private Label Query2;
	
	@FXML private TextField p1;
	@FXML private TextField p2;
	@FXML private TextField p3;
	@FXML private TextField p4;
	@FXML private TextField p5;
	@FXML private TextField p6;
	@FXML private TextField p7;
	@FXML private TextField p8;
	
	
	@FXML private TextField d1;
	@FXML private TextField d2;
	@FXML private TextField d3;
	@FXML private TextField d4;
	@FXML private TextField d5;
	@FXML private TextField d6;
	@FXML private TextField d7;
	@FXML private TextField d8;
	@FXML private TextField d9;
	@FXML private TextField d10;
	
	
	@FXML private TextField g1;
	@FXML private TextField g2;
	@FXML private TextField g3;
	
	@FXML private TextField g4;
	@FXML private TextField g5;
	@FXML private TextField g6;
	
	
	@FXML private Label q1;
	@FXML private Label q2;
	@FXML private Label q3;
	@FXML private Label q4;
	@FXML private Label q5;
	@FXML private Label q6;
	@FXML private Label q7;
	@FXML private Label q8;
	@FXML private Label q9;
	@FXML private Label q10;
	@FXML private Label q11;
	@FXML private Label q12;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{       
		Parent root=FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        mainlayout = (AnchorPane)root;
		Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        ps = primaryStage;
        primaryStage.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		
	}
	
	
	public void runNext() throws Exception
	{
		Parent root=FXMLLoader.load(getClass().getResource("InsertData.fxml"));
		Scene scene = new Scene(root);
		ps.setScene(scene);
		ps.show();
		
		//Controller obj = new Controller();
		//obj.start(ps);
	}
	
	
	public void InsertPatient() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("InsertPatient.fxml"));
		Scene scene = new Scene(root);
		ps.setScene(scene);
		ps.show();
	}
	
	public void InsertDoctor() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("InsertDoctor.fxml"));
		Scene scene = new Scene(root);
		ps.setScene(scene);
		ps.show();
	}
	
	public void InsertGaurdian() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("InsertGuardian.fxml"));
		Scene scene = new Scene(root);
		ps.setScene(scene);
		ps.show();
	}
	
	public void back() throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(root);
		ps.setScene(scene);
		ps.show();
	}
	
	
	public void submitPatient()
	{
		String Fname = p1.getText();
		String Lname = p2.getText();
		int age = Integer.parseInt(p3.getText());
		char gender = p4.getText().charAt(0);
		String phone = p5.getText();
		
		String bloodgrp = p6.getText();
		String ailment = p7.getText();
		int doctorid = Integer.parseInt(p8.getText());
		
		
		p1.clear();p2.clear();p3.clear();p4.clear();p5.clear();p6.clear();p7.clear();p8.clear();

		System.out.println(Fname+" "+Lname+" "+age+" "+gender+" "+phone);
	}
	
	public void submitDoctor()
	{
		String Fname = d1.getText();
		String Lname = d2.getText();
		int age = Integer.parseInt(d3.getText());
		char gender = d4.getText().charAt(0);
		String phone = d5.getText();
		
		int room = Integer.parseInt(d6.getText());
		String timeslot = d7.getText();
		String specialization = d8.getText();
		int experience = Integer.parseInt(d9.getText()); 
		int salary = Integer.parseInt(d10.getText());
		
		
		d1.clear();d2.clear();d3.clear();d4.clear();d5.clear();d6.clear();d7.clear();d8.clear();d9.clear();d10.clear();
		
		
		System.out.println(Fname+" "+Lname+" "+age+" "+gender+" "+phone);
	}
	
	public void submitGuardian()
	{
		String Fname = g1.getText();
		String Lname = g2.getText();
		String phone = g3.getText();
		
		g1.clear();g2.clear();g3.clear();

		System.out.println(Fname+" "+Lname+" "+phone);
	}
	
	public void submitDependent()
	{
		int Pid = Integer.parseInt(g4.getText());
		int Gid = Integer.parseInt(g5.getText());;
		String relation = g6.getText();
		
		g4.clear();g5.clear();g6.clear();
	}
	
	
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}