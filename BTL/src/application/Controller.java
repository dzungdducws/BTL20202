package application;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import data.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import preprocess.InitData;
import tool.ConvertDataForPrint;
import tool.ThayCanBo;
import tool.ThemCanBo;
import tool.TimNguoiDuocThuong;
import tool.TimTheoKieuCanBo;
import tool.TimTheoMaSo;
import tool.TimTheoSinhNhat;
import tool.TimTheoSoBaiBao;
import tool.TimTheoSoGio;
import tool.TimTheoTen;
import tool.XoaCanbo;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

public class Controller implements Initializable  {
	@FXML
	private TableView<CanBoDeIn> tableView;
	@FXML
	private TableColumn<CanBo, String> fullNameCol;
	@FXML
	private TableColumn<CanBo, String> IDCol;
	@FXML
	private TableColumn<CanBo, String> birthDayCol;
	@FXML
	private TableColumn<CanBo, String> typeCol;
	@FXML
	private TableColumn<CanBo, Integer> workProgressCol;
	@FXML
	private TableColumn<CanBo, String> bonusCol;
	@FXML 
	private TextField fullNameTextField;
	@FXML 
	private TextField IDTextField;
	@FXML 
	private DatePicker birthdayDatePicker;	
	@FXML 
	private TextField typeTextField;
	@FXML 
	private TextField workProgressColTextField;
	@FXML 
	private TextField fullNameTextField1;
	@FXML 
	private TextField IDTextField1;
	@FXML 
	private DatePicker birthdayDatePicker1;	
	@FXML 
	private TextField typeTextField1;
	@FXML 
	private TextField workProgressColTextField1;
	@FXML 
	private CheckBox checkBoxBonus;
	@FXML 
	private CheckBox checkBoxBigger;
	@FXML
	private CheckBox checkBoxSmaller;
	
	public void buttonPrint(ActionEvent event) {
		DanhSach.listProcess = new ArrayList<CanBo>();
		DanhSach.listProcess.addAll(DanhSach.list);
		tableView.setItems(getList());
	}
	
	public void buttonAdd(ActionEvent event) {
		if (!(fullNameTextField.getText() == "" || IDTextField.getText() == "" || birthdayDatePicker.getValue() == null ||typeTextField.getText() == "" || workProgressColTextField.getText() == "")) {
			String name = fullNameTextField.getText();
			String ID = IDTextField.getText();
			LocalDate birthday = birthdayDatePicker.getValue();
			int type = Integer.parseInt(typeTextField.getText());
			int workProgress = Integer.parseInt(workProgressColTextField.getText());
			
			if (type<1 || type >3) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Thông báo");
				alert.setContentText("Type chỉ được nhỏ hơn 3 và lơn hơn 0");
				alert.showAndWait();
			}
			else {
				ThemCanBo.themCanBo(name, ID, birthday, type, workProgress);
				DanhSach.listProcess = new ArrayList<CanBo>();
				DanhSach.listProcess.addAll(DanhSach.list);
				tableView.setItems(getList());
			}
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setContentText("Vui lòng điền đầy đủ thông tin");
			alert.showAndWait();
		}
	}
	
	public void buttonRemove(ActionEvent event) {
		ObservableList<CanBoDeIn> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        XoaCanbo.xoaCanBo(selectedRows.toString());
        for (CanBoDeIn person: selectedRows)
        {
            allPeople.remove(person);
        }
	}
	
	public void buttonFix(ActionEvent event) {
		if (!(fullNameTextField.getText() == "" || IDTextField.getText() == "" || birthdayDatePicker.getValue() == null ||typeTextField.getText() == "" || workProgressColTextField.getText() == "")) {
			String name = fullNameTextField.getText();
			String ID = IDTextField.getText();
			LocalDate birthday = birthdayDatePicker.getValue();
			int type = Integer.parseInt(typeTextField.getText());
			int workProgress = Integer.parseInt(workProgressColTextField.getText());
			
			if (type<1 || type >3) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Thông báo");
				alert.setContentText("Type chỉ được nhỏ hơn 3 và lơn hơn 0");
				alert.showAndWait();
			}
			else {
				ObservableList<CanBoDeIn> selectedRows;
		        selectedRows = tableView.getSelectionModel().getSelectedItems();
		        ThayCanBo.thayCanBo(selectedRows.toString(), name, ID, birthday, type, workProgress);
		        DanhSach.listProcess = new ArrayList<CanBo>();
		        DanhSach.listProcess.addAll(DanhSach.list);
				tableView.setItems(getList());
			}
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setContentText("Vui lòng điền đầy đủ thông tin");
			alert.showAndWait();
		}
	}
	
	public void buttonRefresh(ActionEvent event) {
		fullNameTextField1.setText("");
		IDTextField1.setText("");
		birthdayDatePicker1.setValue(null);
		typeTextField1.setText("");
		workProgressColTextField1.setText("");
		checkBoxBigger.setSelected(false);
		checkBoxSmaller.setSelected(false);
		checkBoxBonus.setSelected(false);
		DanhSach.listProcess = new ArrayList<CanBo>();
		DanhSach.listProcess.addAll(DanhSach.list);
		tableView.setItems(getList());
	}
	
	public void buttonSearch(ActionEvent event) {
		if (fullNameTextField1.getText() != "") {
			TimTheoTen.timTheoTen(fullNameTextField1.getText());
		}
		if (IDTextField1.getText() != "") {
			TimTheoMaSo.timTheoMaSo(IDTextField1.getText());
		}
		if (birthdayDatePicker1.getValue() != null) {
			LocalDate birthday = birthdayDatePicker1.getValue();
			TimTheoSinhNhat.timTheoSinhNhat(birthday);
		}
		if (typeTextField1.getText() != "") {
			int type = Integer.parseInt(typeTextField1.getText());
			TimTheoKieuCanBo.timTheoKieuCanBo(type);
		}
		if (workProgressColTextField1.getText() != "") {
			int workProgress = Integer.parseInt(workProgressColTextField1.getText());
			if (checkBoxBigger.isSelected()) {
				TimTheoSoGio.timTheoSoGio(workProgress);
			}
			if (checkBoxSmaller.isSelected()) {
				TimTheoSoBaiBao.timTheoSoBaiBao(workProgress);
			}
		}
		if (checkBoxBonus.isSelected()) {
			TimNguoiDuocThuong.timTheoKieuCanBo();
		}
		tableView.setItems(getList());
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		InitData.init();
		fullNameCol.setCellValueFactory(new PropertyValueFactory<CanBo, String>(fullNameCol.getText()));
		IDCol.setCellValueFactory(new PropertyValueFactory<CanBo, String>(IDCol.getText()));
		birthDayCol.setCellValueFactory(new PropertyValueFactory<CanBo, String>(birthDayCol.getText()));
		typeCol.setCellValueFactory(new PropertyValueFactory<CanBo, String>(typeCol.getText()));
		workProgressCol.setCellValueFactory(new PropertyValueFactory<CanBo, Integer>(workProgressCol.getText()));
		bonusCol.setCellValueFactory(new PropertyValueFactory<CanBo, String>(bonusCol.getText()));
	}
	public ObservableList<CanBoDeIn> getList() {
		ObservableList<CanBoDeIn> list = FXCollections.observableArrayList();
		ArrayList<CanBoDeIn> x = ConvertDataForPrint.convert(DanhSach.listProcess);
		for (CanBoDeIn s: x) {
			list.add(s);
		}
		return list;
	}
	
	
}
