public class FibonacciSeries {
    public int getNthNumber(int number) {
        if (number <= 0){
            return -1;
        }

        if (number == 1 || number ==2){
            return 1;
        }

        int previousNumber  = 1;
        int currentNumber   = 1;

        for(int i=1;i<number-1;i++){
            int nextNumber;

            nextNumber      = currentNumber+previousNumber;
            previousNumber  = currentNumber;
            currentNumber   = nextNumber;
        }

        return currentNumber;
    }
}
