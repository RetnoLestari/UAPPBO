package uappbo;

import static DB.DBHelper.getConnection;
import Model.barangModel;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class KategoriController implements Initializable {

    barangModel brg = new barangModel();
    
    @FXML
    private TableColumn<Barang, String> Kkat;
    
    @FXML
    private TableColumn<Barang, String> Knama;

    @FXML
    private Button btnKembali;
    
    @FXML
    private TableView<Barang> Tkategori;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showBarang();
        
    }    
    
   
   @FXML
    public void backHome (ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnKembali.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
  
    public ObservableList<Barang> getBarangList(){
       
        ObservableList<Barang> barangList = FXCollections.observableArrayList();
        Connection CONN = getConnection();
        String query ="SELECT nama_produk,kategori FROM barang ;";
        Statement st;
        ResultSet rs; 

        try{
            st = CONN.createStatement();
            rs = st.executeQuery(query);
            Barang barang;
            while(rs.next()){
               barang = new Barang(rs.getString("nama_produk"),rs.getString("kategori"));
                barangList.add(barang);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return barangList;
    }
     
    
    public void showBarang(){
        ObservableList<Barang> list = getBarangList();
        Knama.setCellValueFactory(new PropertyValueFactory<Barang,String>("nama_produk"));
        Kkat.setCellValueFactory(new PropertyValueFactory<Barang,String>("kategori"));

        Tkategori.setItems(list);

     }  
    
}
