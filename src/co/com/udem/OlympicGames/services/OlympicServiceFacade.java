package co.com.udem.OlympicGames.services;

import java.util.List;

import co.com.udem.OlympicGames.model.AthletesDTO;
import co.com.udem.OlympicGames.model.HomeDTO;
import co.com.udem.OlympicGames.model.NewsDTO;

public class OlympicServiceFacade {
	public List<NewsDTO> getNewsJPA(){
		NewsServiceInterface newsServicesInterfce = new NewsServiceImpl();
		return newsServicesInterfce.getNewsJPA();
	}
	
	public List<HomeDTO> getHomeJPA(){
		HomeServiceInterface homeServicesInterface = new HomeServiceImpl();
		return homeServicesInterface.getHomeJPA();
	}
	public List<AthletesDTO>getAthletesJPA(){
		AthlestesServiceInterface athlestesServicesInterface = new AthletesServiceImpl();
		return athlestesServicesInterface.getAthletesJPA();
	}

}
