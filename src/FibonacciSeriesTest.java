import org.junit.Assert;
import org.junit.Test;

public class FibonacciSeriesTest {
    @Test
    public void fibonacciSeriesNthNumberForOne(){
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Assert.assertEquals(1,fibonacciSeries.getNthNumber(1));
    }

    @Test
    public void fibonacciSeriesNthNumberForTwo(){
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Assert.assertEquals(1,fibonacciSeries.getNthNumber(2));
    }

    @Test
    public void fibonacciSeriesNthNumberForThree(){
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Assert.assertEquals(2,fibonacciSeries.getNthNumber(3));
    }

    @Test
    public void fibonacciSeriesNthNumberForAnyNumber(){
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Assert.assertEquals(55,fibonacciSeries.getNthNumber(10));
    }

    @Test
    public void fibonacciSeriesNthNumberForInvalidInput(){
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Assert.assertEquals(-1,fibonacciSeries.getNthNumber(0));
    }
}
