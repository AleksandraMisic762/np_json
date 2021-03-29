package main;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import movie.Movie;

public class Main1 {

	public static void main(String[] args) {
		Movie m = new Movie();

		m.setImdbId("tt0116367");
		m.setTitle("From Dusk Till Dawn");
		m.setReleaseYear(1996);
		m.setRating(7.2);
		
		String[] actors = {"George Clooney", "Quentin Tarantino"};

		m.setActors(actors);
		
		try (FileWriter fw = new FileWriter("movie.json");) {

			Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

			gson.toJson(m, fw);
			
			System.out.println(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
