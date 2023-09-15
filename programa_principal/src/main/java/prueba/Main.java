package prueba;
import prueba.service.*;

import java.io.IOException;

import prueba.dto.*;
public class Main {

	public static void main(String[] args) {
		 ApiService apiService = new ApiService();
	        try {
	            ChuckNorrisJoke joke = apiService.obtenerChiste();
	            System.out.println(joke.getValue());
	            System.out.println(joke.getIcon_url());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
