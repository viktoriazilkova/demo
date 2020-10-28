package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;


public class TextEditorController {
    @FXML
    TextArea myTextFile;

    @FXML
    public void save ()throws IOException {
        FileWriter fileWriter= new FileWriter("dokument", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String nazov =  myTextFile.getText();
        System.out.println(nazov);
        writer.write(nazov);
        writer.close();
    }
    public void initialize(){
        FileReader reader = null;
        try {
            reader = new FileReader("dokument");
            BufferedReader reader1 = new BufferedReader(reader);


            String vystupriadku1;
            String vystup = "";
            while ((vystupriadku1 = reader1.readLine()) != null){
                System.out.println(vystupriadku1);
                vystup= vystup + vystupriadku1 + "\n" ;

            }

            //System.out.println(reader1.readLine());
            myTextFile.setText(vystup);
            reader1.close();
        }
        catch(FileNotFoundException e){
        }
        catch(IOException e){
            e.printStackTrace();
        }



    }

}
