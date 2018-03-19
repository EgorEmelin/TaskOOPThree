public class Factorial {

    public void factorial (int size){
        int fact = 1;
        long startTime = System.nanoTime();
        long finalTime;
        for (int i = 1; i <= size; i++){
            fact*=i;
        }
        finalTime = System.nanoTime() - startTime;
        System.out.println("Факториал (" + size+ "): " + fact + "   Time: " + finalTime);
        startTime = System.nanoTime();
        fact = factorialReq(size);
        finalTime = System.nanoTime() - startTime;
        System.out.println("Факториал (" + size+ "): " + fact + "   Time: " + finalTime);
    }

    public int factorialReq(int size)
    {
        if (size == 0) return 1;
        return size * factorialReq(size-1);
    }
}
