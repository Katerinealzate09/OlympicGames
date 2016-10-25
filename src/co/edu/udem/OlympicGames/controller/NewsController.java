package co.edu.udem.OlympicGames.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.OlympicGames.model.NewsDTO;
import co.com.udem.OlympicGames.services.NewsServiceImpl;
import co.com.udem.OlympicGames.services.NewsServiceInterface;
import co.com.udem.OlympicGames.services.OlympicServiceFacade;

@Controller
public class NewsController {

	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView news() {
		OlympicServiceFacade olympicServiceFacade = new OlympicServiceFacade();
		List<NewsDTO> newsDTO = olympicServiceFacade.getNewsJPA();
		//NewsServiceInterface newsServiceInterface = new NewsServiceImpl();
		//List<NewsDTO> newsDTO = newsServiceInterface.getNews();
		return new ModelAndView("news", "command", newsDTO);
	}

}