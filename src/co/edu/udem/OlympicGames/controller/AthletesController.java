package co.edu.udem.OlympicGames.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.AthletesDTO;

@Controller
public class AthletesController {
	
	@RequestMapping(value = "/athletes", method = RequestMethod.GET)
	public ModelAndView athletes(){
		List<AthletesDTO> athletesDTO = athletesDTOre();
		return new ModelAndView("athletes", "command", athletesDTO);
	}

	private List<AthletesDTO> athletesDTOre(){
		
		List<AthletesDTO> athletesDTOList = new ArrayList<AthletesDTO>();
		AthletesDTO athletesDTO = new AthletesDTO();
		athletesDTO.setImage("http://lorempixel.com/500/500/");
		athletesDTO.setName("Mariana Pajon");
		athletesDTO.setSport("BMX");
		athletesDTO.setNationality("Colombia");
		athletesDTOList.add(athletesDTO);
		
		AthletesDTO athletesDTO1 = new AthletesDTO();
		athletesDTO1.setImage("http://lorempixel.com/500/500/");
		athletesDTO1.setName("Catherine I.");
		athletesDTO1.setSport("Atletismo");
		athletesDTO1.setNationality("Colombia");
		athletesDTOList.add(athletesDTO1);
		
		AthletesDTO athletesDTO2 = new AthletesDTO();
		athletesDTO2.setImage("http://lorempixel.com/500/500/");
		athletesDTO2.setName("Manolo Cardona");
		athletesDTO2.setSport("Nadador");
		athletesDTO2.setNationality("Argentina");
		athletesDTOList.add(athletesDTO2);
		
		AthletesDTO athletesDTO3 = new AthletesDTO();
		athletesDTO3.setImage("http://lorempixel.com/500/500/");
		athletesDTO3.setName("Milena Toro");
		athletesDTO3.setSport("Nadadora");
		athletesDTO3.setNationality("USA");
		athletesDTOList.add(athletesDTO3);
		
		return athletesDTOList;
	}
}
