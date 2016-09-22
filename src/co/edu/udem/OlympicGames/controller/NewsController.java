package co.edu.udem.OlympicGames.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.NewsDTO;

@Controller
public class NewsController {

	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView news() {
		List<NewsDTO> newsDTO = newsDTOre();
		return new ModelAndView("news", "command", newsDTO);
	}

	private List<NewsDTO> newsDTOre() {
		
		List<NewsDTO> newsDTOList = new ArrayList<NewsDTO>();
		NewsDTO newsDTO = new NewsDTO();
		newsDTO.setTitle("sunt aut facere repellat provident occaecati excepturioptio reprehenderit");
		newsDTO.setDescription("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quastotam\nnostrum rerum est autem sunt rem eveniet architecto");
		newsDTO.setImage("http://lorempixel.com/700/700/");
		newsDTO.setNewsUrl("wii");
		newsDTOList.add(newsDTO);
		
		NewsDTO newsDTO1 = new NewsDTO();
		newsDTO1.setTitle("noticia 1");
		newsDTO1.setDescription("una noticia wiiiiiiii");
		newsDTO1.setImage("http://lorempixel.com/500/500/");
		newsDTO1.setNewsUrl("wii2");
		newsDTOList.add(newsDTO1);
		
		return newsDTOList;
	}

}