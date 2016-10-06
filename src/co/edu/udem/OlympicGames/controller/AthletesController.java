package co.edu.udem.OlympicGames.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.AthletesDTO;
import co.com.udem.OlympicGames.services.AthlestesServiceInterface;
import co.com.udem.OlympicGames.services.AthletesServiceImpl;

@Controller
public class AthletesController {
	
	@RequestMapping(value = "/athletes", method = RequestMethod.GET)
	public ModelAndView athletes(){
		AthlestesServiceInterface athlestesServiceInterface  = new AthletesServiceImpl();
		List<AthletesDTO> athletesDTO = athlestesServiceInterface.getAthletes();
		return new ModelAndView("athletes", "command", athletesDTO);
	}

}
