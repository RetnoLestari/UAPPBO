/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Model.makananModel;

/**
 * FXML Controller class
 *
 * @author baash
 */
public class MakananInputController {
    makananModel mkn = new makananModel();
    
    @FXML
    private TextField LBdayatahan;

    @FXML
    private TextField LBdiskon;

    @FXML
    private TextField LBharga;

    @FXML
    private TextField LBid;

    @FXML
    private TextField LBjumlah;

    @FXML
    private TextField LBnama;


    @FXML
    private Button btnTambah;
    
    @FXML
    private Button btnKembali;
    
    @FXML
   public void tambah (ActionEvent event) throws IOException{
       Makanan mkn1 = new Makanan(Integer.parseInt(LBid.getText()),LBnama.getText(),Double.parseDouble(LBharga.getText()),Integer.parseInt(LBjumlah.getText()), Double.parseDouble(LBdiskon.getText()), Integer.parseInt(LBdayatahan.getText()));
       mkn.addMakanan(mkn1);
       FXMLLoader loader = new FXMLLoader(getClass().getResource("ProdukInput.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnTambah.getScene().getWindow();
       stage.setScene(new Scene(root));
   }
   
   @FXML
   public void kembali (ActionEvent event) throws IOException{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("ProdukInput.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnKembali.getScene().getWindow();
       stage.setScene(new Scene(root));
   }
    
}
