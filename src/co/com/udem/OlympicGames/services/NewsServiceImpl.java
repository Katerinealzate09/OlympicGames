package co.com.udem.OlympicGames.services;

import java.util.ArrayList;
import java.util.List;

import co.com.udem.OlympicGames.model.NewsDTO;

public class NewsServiceImpl implements NewsServiceInterface{

	@Override
	public List<NewsDTO> getNews() {
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
		newsDTO1.setImage("http://lorempixel.com/700/700/");
		newsDTO1.setNewsUrl("wii2");
		newsDTOList.add(newsDTO1);
		
		return newsDTOList;
	}

}
