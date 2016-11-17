package co.com.udem.OlympicGames.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.udem.OlympicGames.model.ArenasDTO;
import co.com.udem.OlympicGames.model.AthletesDTO;
import co.com.udem.OlympicGames.model.HomeDTO;
import co.com.udem.OlympicGames.model.MedalDTO;
import co.com.udem.OlympicGames.model.NewsDTO;
//import co.edu.udem.olympicgames.webservices.OlympicServiceFacade;

public class OlympicServiceFacade {

	public static OlympicServiceFacade olympicServiceFacade = null;

	public OlympicServiceFacade() {

		
	}

	public static OlympicServiceFacade getInstance() {
		if (olympicServiceFacade == null) {
			olympicServiceFacade = new OlympicServiceFacade();
		}
		return olympicServiceFacade;
	}

	public List<NewsDTO> getNewsWS() {
		List<NewsDTO> listNews = new ArrayList<NewsDTO>();
		try {
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getnews");
			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());
			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			for (int i = 0; i < ar.size(); i++) {
				listNews.add((builder.create()).fromJson(ar.get(i).toString(), NewsDTO.class));

			}
			System.out.println(outString);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listNews;
	}
	
	public List<HomeDTO> getHomeWS(){
		List <HomeDTO> listHome = new ArrayList<HomeDTO>();
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/gethome");
			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());
			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			for (int i = 0; i < ar.size(); i++) {
				listHome.add((builder.create()).fromJson(ar.get(i).toString(), HomeDTO.class));

			}
			System.out.println(outString);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listHome;
	}
	
	public List<AthletesDTO>getAthletesWS(){
		List<AthletesDTO>listAthletes = new ArrayList<AthletesDTO>();
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getathletes");
			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());
			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			for (int i = 0; i < ar.size(); i++) {
				listAthletes.add((builder.create()).fromJson(ar.get(i).toString(), AthletesDTO.class));

			}
			System.out.println(outString);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listAthletes;
	}
	
	public List<ArenasDTO>getArenasWS(){
		List<ArenasDTO>listArenas = new ArrayList<ArenasDTO>();
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getarenas");
			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());
			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			for (int i = 0; i < ar.size(); i++) {
				listArenas.add((builder.create()).fromJson(ar.get(i).toString(), ArenasDTO.class));

			}
			System.out.println(outString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listArenas;	
	}
	
	public List<MedalDTO>getMedalWS(){
		List<MedalDTO>listMedal = new ArrayList<MedalDTO>();
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getmedal");
			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());
			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			for (int i = 0; i < ar.size(); i++) {
				listMedal.add((builder.create()).fromJson(ar.get(i).toString(), MedalDTO.class));

			}
			System.out.println(outString);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listMedal;
	}

}
