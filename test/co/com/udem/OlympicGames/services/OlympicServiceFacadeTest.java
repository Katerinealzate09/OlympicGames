package co.com.udem.OlympicGames.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class OlympicServiceFacadeTest {

	OlympicServiceFacade facade = OlympicServiceFacade.getInstance();
	
	@Test
	public void testGetNewsWS() {
		facade.getNewsWS();
	}

	@Test
	public void testGetHomeWS() {
		facade.getHomeWS();
	}

	@Test
	public void testGetAthletesWS() {
		facade.getAthletesWS();
	}

	@Test
	public void testGetArenasWS() {
		facade.getArenasWS();
	}

	@Test
	public void testGetMedalWS() {
		facade.getMedalWS();
	}

}
