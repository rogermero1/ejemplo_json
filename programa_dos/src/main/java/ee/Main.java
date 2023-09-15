package ee;

import java.io.IOException;

import prueba.dto.*;
import prueba.service.*;

public class Main {

	public static void main(String[] args) {
		ApiService apiService = new ApiService();
        try {
            ChuckNorrisJoke joke = apiService.obtenerChiste();
            System.out.println("desde otro proyecto");
            System.out.println(joke.getValue());
            System.out.println(joke.getIcon_url());
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
