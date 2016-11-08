package co.com.udem.OlympicGames.services;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
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
	//ws cient
	Client client = Client.create();
	
	public OlympicServiceFacade() {

	}

	public static OlympicServiceFacade getInstance() {
		if (olympicServiceFacade == null) {
			olympicServiceFacade = new OlympicServiceFacade();
		}
		return olympicServiceFacade;
	}

	public List<NewsDTO> getNewsWS(){
		WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getnews");
		//respuesta
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if(response.getStatus() != 200 ){
			throw new RuntimeException("Failed error code: " + response.getStatus());
		};
		/*NewsDTO newsDTO = new NewsDTO("wii", "wii", "wii", "ww");
		Gson gson = new Gson();
		String json = gson.toJson(newsDTO, NewsDTO.class);*/
		//object = json
		String outString = response.getEntity(String.class);
		System.out.println(outString);
		return null
				;
	}
	
	public List<HomeDTO> getHomeWS(){
		WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/gethome");
		//respuesta
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if(response.getStatus() != 200 ){
			throw new RuntimeException("Failed error code: " + response.getStatus());
		};
		//object = json
		String outString = response.getEntity(String.class);
		System.out.println(outString);
		return null;
	}
	public List<AthletesDTO>getAthletesWS(){
		WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getathletes");
		//respuesta
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if(response.getStatus() != 200 ){
			throw new RuntimeException("Failed error code: " + response.getStatus());
		};
		//object = json
		String outString = response.getEntity(String.class);
		System.out.println(outString);
		return null;
	}
	
	public List<ArenasDTO>getArenasWS(){
		WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getarenas");
		//respuesta
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if(response.getStatus() != 200 ){
			throw new RuntimeException("Failed error code: " + response.getStatus());
		};
		//object = json
		String outString = response.getEntity(String.class);
		System.out.println(outString);
		return null;
	}
	
	public List<MedalDTO>getMedalWS(){
		WebResource webResource = client.resource("http://localhost:8080/olympicGames_ws/rest/json/servicesfacade/getmedal");
		//respuesta
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if(response.getStatus() != 200 ){
			throw new RuntimeException("Failed error code: " + response.getStatus());
		};
		//object = json
		String outString = response.getEntity(String.class);
		System.out.println(outString);
		return null;
	}

}
