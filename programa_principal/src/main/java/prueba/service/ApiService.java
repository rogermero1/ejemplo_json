package prueba.service;
import com.google.gson.Gson;
import prueba.dto.ChuckNorrisJoke;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
public class ApiService {
	private static final String CHUCK_NORRIS_JOKE_URL = "https://api.chucknorris.io/jokes/random";

    public ChuckNorrisJoke obtenerChiste() throws IOException {
        @SuppressWarnings("deprecation")
		HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(CHUCK_NORRIS_JOKE_URL);
        String jsonResponse = EntityUtils.toString(httpClient.execute(httpGet).getEntity());

        Gson gson = new Gson();
        return gson.fromJson(jsonResponse, ChuckNorrisJoke.class);
    }
}
