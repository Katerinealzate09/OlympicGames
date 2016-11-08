package co.edu.udem.OlympicGames.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.HomeDTO;
import co.com.udem.OlympicGames.services.OlympicServiceFacade;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(){
		OlympicServiceFacade olympicServiceFacade = new OlympicServiceFacade();
		List<HomeDTO>homeDTO = olympicServiceFacade.getHomeWS();
		//HomeServiceInterface homeServicesInterface = new HomeServiceImpl();
		//List<HomeDTO> homeDTO = homeServicesInterface.getHome();
		 return new ModelAndView("home", "command", homeDTO);
	}

}
