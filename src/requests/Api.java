package requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

interface ApiInterface {
    public void GETCustomerList() throws  IOException;
}

public class Api implements ApiInterface {
    String baseUrl = "https://lib.co.ke/f/x/";

    public void GETCustomerList() throws IOException {
        URL url = new URL(this.baseUrl + "customer.list");
        String readLine = null;
        Files f = new Files();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader((new InputStreamReader(connection.getInputStream())));
            StringBuffer response = new StringBuffer();

            while ( (readLine = in.readLine()) != null) {
                response.append(readLine);
            } in.close();

            System.out.println("JSON String result => " + response.toString());
            f.saveToJSON(response.toString(), "customer.list.json");

        }

    }
}
