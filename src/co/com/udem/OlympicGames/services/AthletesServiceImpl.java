package co.com.udem.OlympicGames.services;

import java.util.ArrayList;
import java.util.List;

import co.com.udem.OlympicGames.model.AthletesDTO;

public class AthletesServiceImpl implements AthlestesServiceInterface{

	@Override
	public List<AthletesDTO> getAthletes() {
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
