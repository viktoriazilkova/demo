import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class URLuloha {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://sosholic.sk/");
            BufferedReader reader = new BufferedReader(InputStreamReader);



    String vystup;
    int celkovypocet = 0;
            while ((vystup = reader.readLine()) != null) {
        //System.out.println(vystup);
        String slovo1 = "div";
        int slovo1Pocet = 0;
        int celkovypocet = 0;

        for (int x= 0; x < vystup.length(); x+){
            switch (vystup.substring(x)){
                case "div":
                    celkovypocet++;
                    break;
                case "script":
                    celkovypocet++;
                    break;
            }
            while (slovo1Pocet != -1) {
                slovo1Pocet = vystup.indexOf(slovo1, slovo1Pocet);
                if (slovo1Pocet != -1)
                    celkovypocet++;

                slovo1Pocet + slovo1.length();
            }
            System.out.println(celkovypocet);
        }
        reader.close();




    } catch (IOException e) {
    }
        catch (IOException e) {
        e.printStackTrace();
    }
}
}
