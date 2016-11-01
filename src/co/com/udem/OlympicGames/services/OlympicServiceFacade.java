package co.com.udem.OlympicGames.services;

import java.util.List;

import co.com.udem.OlympicGames.model.ArenasDTO;
import co.com.udem.OlympicGames.model.AthletesDTO;
import co.com.udem.OlympicGames.model.HomeDTO;
import co.com.udem.OlympicGames.model.MedalDTO;
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
	
	public List<ArenasDTO>getArenasJPA(){
		ArenasServiceInterface arenasServiceInterface = new ArenasServiceImpl();
		return arenasServiceInterface.getArenaJPA();
	}
	
	public List<MedalDTO>getMedalJPA(){
		MedalServiceInterface medalServiceInterface = new MedalServiceImpl();
		return medalServiceInterface.getMedalJPA();
	}

}
