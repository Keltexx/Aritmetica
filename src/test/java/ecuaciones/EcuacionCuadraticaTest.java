package ecuaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EcuacionCuadraticaTest {

	@Test
	public void resuelveCorrectamenteTest() {
		EcuacionCuadratica eC = new EcuacionCuadratica(3, -11, -4);
		
		assertThat(eC.resolverMasRaiz(eC),is(4.0));
		assertThat(eC.resolverMenosRaiz(eC),is(-0.3333333333333333));
		
		eC= new EcuacionCuadratica(1, -5, 6);
		assertThat(eC.resolverMasRaiz(eC),is(3.0));
		assertThat(eC.resolverMenosRaiz(eC),is(2.0));

	}
	
	
	
}