package doctorcasa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDeEnfermedad {
			private Infecciosa malaria;
			private Persona spiderman;
			@Before
			public void inicializarEscenario(){
				spiderman = new Persona();
				spiderman.setCantCelTotales(1000);
				malaria = new Infecciosa();
				
			}
			@Test
			public void unaEnfermedadInfcEsAgresiv (){
				// Precondiciones-Escenario-Contexto
				malaria.setCantDeCelAmenazadas(102);
				
				//Lo que se realiza del Test
				boolean agresividad= malaria.esAgresiva(spiderman);
				
				//Postcondiciones-Se verifica esto
				Assert.assertTrue(agresividad);
			}
			@Test
			public void unaEnfermedadInfcNoEsAgresiv (){
				// Precondiciones-Escenario-Contexto
				malaria.setCantDeCelAmenazadas(100);
				
				//Lo que se realiza del Test
				boolean agresividad= malaria.esAgresiva(spiderman);
				
				//Postcondiciones-Se verifica esto
				Assert.assertFalse(agresividad);
			}
}
