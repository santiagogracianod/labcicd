package com.udea.labcicd;

import com.fasterxml.jackson.databind.JsonNode;
import com.udea.labcicd.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LabcicdApplicationTests {

	//hacer una inyeccion del DataController
	@Autowired
	DataController dataController;

	@Test
	void health(){
		assertEquals("Proyecto activo", dataController.healthCheck());
	}

	@Test
	void version(){
		assertEquals("La versión actual es 0.0.1", dataController.version());
	}

	//mirar si aparecen la cantidad de datos que pedí
	@Test
	void nationLength(){
		Integer nationLength = dataController.getRandomNations().size();
		assertEquals(10, nationLength);
	}

	@Test
	void currenciesLength(){
		Integer currenciesLength = dataController.getRandomCorrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void testRandomCurrenciesCodeFormat(){
		DataController controller = new DataController();
		JsonNode response = controller.getRandomCorrencies();

		for (int i = 0; i < response.size(); i++) {
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();

			assertTrue(code.matches("[A-Z]{3}"));

		}
	}

	//si se demora mas de X tiempo falla
	@Test
	void testRandomNationsPerformance(){
		DataController  controller = new DataController();
		long startTime = System.currentTimeMillis();
		controller.getRandomNations();
		long endTime = System.currentTimeMillis();
		long excecuteTime = endTime - startTime;

		assertTrue(excecuteTime < 2000);
	}

	@Test
	void aviationLength() {
		Integer aviationLength = dataController.getRandomAviation().size();
		assertEquals(20, aviationLength);
	}

}
