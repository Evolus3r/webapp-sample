package sample;
import org.junit.Assert;
import org.junit.Test;


public class TestConstantes{
    @Test
    public void testHelloWorld(){
        Assert.assertEquals("NO-BODY", Constantes.WHO);
        System.out.println("Hello "+Constantes.WHO);
    }

    @Test
    public void testContainsLetter(){
        Assert.assertTrue(Constantes.WHO.contains("e"));
        System.out.println("Contient E");
    }

    @Test
    public void testLengthConstantes(){

        Double length =(double) Constantes.WHO.length();
        
		Assert.assertEquals(7, length.doubleValue(), 0.1);
    }

}

