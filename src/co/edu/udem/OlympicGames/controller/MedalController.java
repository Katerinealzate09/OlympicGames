package co.edu.udem.OlympicGames.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.MedalDTO;
import co.com.udem.OlympicGames.services.OlympicServiceFacade;

@Controller
public class MedalController {
	
	@RequestMapping(value = "/medal", method = RequestMethod.GET)
	public ModelAndView Medal(){
		OlympicServiceFacade olympicServiceFacade = new OlympicServiceFacade();
		List<MedalDTO>medalDTO = olympicServiceFacade.getMedalWS();
		return new ModelAndView("medal", "command", medalDTO);
	}
	

}
