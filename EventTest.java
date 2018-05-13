package es.unileon.prg1.date;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

@Test
publi8c void testEvent () throws Exception
	{
	assertEquals(0, buddies.lenght())


}

//comprobar numero
@Test
public void testEventNumber () throws Exception
	{
new Event(a);
}

//comprobar numero negativo
@Test(expected = EventException.class)
public void testEventNegativeNumber () throws Exception
	{

new Event(-1);

}
//comprobar numero entero
@Test(expected = EventException.class)
public void testEventNumberint () throws Exception
	{
new Event(1,0);
}
//comprobar numero distinto de 1
@Test(expected = EventException.class)
public void testEventNumberDifferentOfOne () throws Exception
	{
	int Numb != 1;
new Event(int Numb);     //creo que esta mal señalado
}
