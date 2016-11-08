package co.edu.udem.OlympicGames.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.ArenasDTO;
import co.com.udem.OlympicGames.services.OlympicServiceFacade;

@Controller
public class ArenasController {

	@RequestMapping(value = "/arenas", method = RequestMethod.GET)
	public ModelAndView arenas(){
		OlympicServiceFacade olympicServiceFacade = new OlympicServiceFacade();
		List<ArenasDTO>arenaDTO = olympicServiceFacade.getArenasWS();
		return new ModelAndView("arenas","command", arenaDTO);
	}
}
