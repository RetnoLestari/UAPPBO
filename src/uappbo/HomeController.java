package uappbo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class HomeController implements Initializable {

    @FXML
    private Button btnData;

    @FXML
    private Button btnKat;

    @FXML
    private Button btnProduk;

    @FXML
    void openKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kategori.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnKat.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("produk.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void opendata(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("penjualan.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnData.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
