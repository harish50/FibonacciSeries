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

}
