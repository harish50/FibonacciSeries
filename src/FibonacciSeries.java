public class FibonacciSeries {
    public int getNthNumber(int number) {
        if (number == 1 || number ==2){
            return 1;
        }

        int previousNumber=1;
        int nextNumber=1;

        for(int i=1;i<number-1;i++){
            int temp = nextNumber;

            nextNumber      = nextNumber+previousNumber;
            previousNumber  = temp;
        }

        return nextNumber;
    }
}
