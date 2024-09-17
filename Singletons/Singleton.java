import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;    
    }

    public String getValue() {
        return this.value;    
    }

    public static Singleton create(String value) {
        if (instance == null) {
             instance = new Singleton(value);       
        }

        return instance;
    }

    public void fetchUrl() {
        try {
            URL url = new URL("https://dummyjson.com/quotes");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            
            if (connection.getResponseCode() != 200) {
                // Throw....            
                System.out.println("Failed!");            
            } else {
                InputStreamReader inputStream = new InputStreamReader(connection.getInputStream());
                BufferedReader bufferStreamRead = new BufferedReader(inputStream);
                    
                String output;
                    
                while ((output = bufferStreamRead.readLine()) != null) {
                    System.out.println(output);
                }

                connection.disconnect();
            }
        } catch (Exception e) {
            
        }

    }

    public static void main (String[] args) {
        Singleton test = Singleton.create("Hola");
        Singleton test2 = Singleton.create("Mundo");

        // Hola o Mundo
        System.out.println(test.getValue());
        test.fetchUrl();
    }
}
