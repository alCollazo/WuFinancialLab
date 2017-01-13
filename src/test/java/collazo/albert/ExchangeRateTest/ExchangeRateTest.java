package collazo.albert.ExchangeRateTest;

import static org.junit.Assert.assertEquals;

import collazo.albert.ExchangeRate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by albertcollazo on 1/11/17.
 */
public class ExchangeRateTest {

    ExchangeRate exchangeRate;

    @Before
    public void setUp(){
        exchangeRate = new ExchangeRate();
    }

    @Test
    public void usdToEuro(){
        String expected = "Exchange is 0.94";
        String actual = exchangeRate.usdToEuro();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void euroToUsd(){
        String expected = "Exchange is 1.06";
        String actual = exchangeRate.euroToUsd();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void euroToBp(){
        String expected = "Exchange is 0.87";
        String actual = exchangeRate.euroToBp();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void bpToIr(){
        String expected = "Exchange is 83.32";
        String actual = exchangeRate.bpToIr();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void irToCd(){
        String expected = "Exchange is 0.02";
        String actual = exchangeRate.irToCd();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void cdToSd(){
        String expected = "Exchange is 1.08";
        String actual = exchangeRate.cdToSd();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void sdToSf(){
        String expected = "Exchange is 0.71";
        String actual = exchangeRate.sdToSf();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void sfToMr(){
        String expected = "Exchange is 4.43";
        String actual = exchangeRate.sfToMr();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void mrToJy(){
        String expected = "Exchange is 25.91";
        String actual = exchangeRate.mrToJy();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

    @Test
    public void jyToCy(){
        String expected = "Exchange is 0.06";
        String actual = exchangeRate.jyToCy();
        Assert.assertEquals("Expected string return. ",expected, actual);
    }

}
