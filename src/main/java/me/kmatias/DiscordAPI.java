package me.kmatias;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.SneakyThrows;

import javax.net.ssl.HttpsURLConnection;
import java.io.OutputStream;
import java.net.URL;

/**
 * @author matias
 */
public class DiscordAPI {

    @Getter
    private final String webhookURL;

    @Getter
    private final APIRequest webhookRequest = new APIRequest();

    public DiscordAPI(String webhookURL) {
        this.webhookURL = webhookURL;
    }

    /**
     * Creates the request
     */
    @SneakyThrows
    public void doRequest() {
        Gson gson = new GsonBuilder().create();

        String json = gson.toJson(webhookRequest, APIRequest.class);

        URL url = new URL(webhookURL);

        System.out.println(json);

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.addRequestProperty("Content-Type", "application/json");
        connection.addRequestProperty("User-Agent", "KMatias-discord-webhook-API");
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        OutputStream stream = connection.getOutputStream();
        stream.write(json.getBytes());
        stream.flush();
        stream.close();
        connection.getInputStream().close();
        connection.disconnect();
    }
}
