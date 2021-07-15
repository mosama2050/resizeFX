/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resize;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Window;
import net.coobird.thumbnailator.Thumbnails;

/**
 *
 * @author moham
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Label l;
     
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

   @FXML
    private TextField input;

    @FXML
    private TextField output;

    @FXML
    private TextField w;

    @FXML
    private TextField h;

    @FXML
    private TextField q;

    @FXML
    private Button btn2;

    @FXML
    private Button btn1;
     @FXML
    private Button btn3;

   float qq =0;
    @FXML
    void resize_compress(ActionEvent event) throws IOException {
		File folder = new File(input.getText());
		File[] listOfFiles = folder.listFiles();
                if(q.getText().isEmpty()){
                     qq = (float) 1.0;

                }else{
                qq=Float.valueOf(q.getText());
                }
                
                 l.setText("Working...");
		for (File file : listOfFiles) {
			if (file.isFile()) {
				Thumbnails.of(input.getText()+file.getName())
						// Do not change the picture size
						 
                                        	.size(Integer.valueOf(w.getText()),Integer.valueOf(h.getText()))
						.outputQuality(qq)
						.toFile(output.getText()+file.getName());
			}
		}
                  l.setText("Done ...");
    }
        
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

 
    
        @FXML
    protected void  compress(ActionEvent event) throws IOException {
         
		File folder = new File(input.getText());
		File[] listOfFiles = folder.listFiles();
                l.setText("Working...");
		for (File file : listOfFiles) {
                    
			if (file.isFile()) {
				Thumbnails.of(input.getText()+file.getName())
						// Do not change the picture size
						.scale(1f)
						.toFile(output.getText()+file.getName());
			}
		}
                  l.setText("Done ...");
    }
    
    
    
        @FXML
    void compress_Qult(ActionEvent event) throws IOException {
        if(q.getText().isEmpty()){
                     qq = (float) 1.0;

                }else{
                qq=Float.valueOf(q.getText());
                }
                System.out.println(qq);
        File folder = new File(input.getText());
		File[] listOfFiles = folder.listFiles();
                l.setText("Working...");
		for (File file : listOfFiles) {
                    
			if (file.isFile()) {
				Thumbnails.of(input.getText()+file.getName())
						// Do not change the picture size
						.scale(1f)
                                                .outputQuality(qq)
						.toFile(output.getText()+file.getName());
			}
		}
                  l.setText("Done ...");
    }
    
}
