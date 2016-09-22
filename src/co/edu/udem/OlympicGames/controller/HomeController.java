package co.edu.udem.OlympicGames.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.HomeDTO;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(){
		List<HomeDTO> homeDTO = homeDtoPopulator();
		 return new ModelAndView("home", "command", homeDTO);
	}
	
	public List<HomeDTO> homeDtoPopulator(){
		
		List<HomeDTO> homeDTOList = new ArrayList<HomeDTO>();
		HomeDTO homeDTO = new HomeDTO();
		homeDTO.setTitle("Arenas");
		homeDTO.setImage("http://lorempixel.com/300/300/");
		homeDTO.setUrl("#");
		homeDTOList.add(homeDTO);
		
		HomeDTO homeDTO1 = new HomeDTO();
		homeDTO1.setTitle("Atletas");
		homeDTO1.setImage("http://lorempixel.com/300/300/");
		homeDTO1.setUrl("athletes");
		homeDTOList.add(homeDTO1);
		
		HomeDTO homeDTO2 = new HomeDTO();
		homeDTO2.setTitle("Medallas");
		homeDTO2.setImage("http://lorempixel.com/300/300/");
		homeDTO2.setUrl("#");
		homeDTOList.add(homeDTO2);
		
		HomeDTO homeDTO3 = new HomeDTO();
		homeDTO3.setTitle("Noticias");
		homeDTO3.setImage("http://lorempixel.com/300/300/");
		homeDTO3.setUrl("news");
		homeDTOList.add(homeDTO3);
		
		return homeDTOList;
	}

}
