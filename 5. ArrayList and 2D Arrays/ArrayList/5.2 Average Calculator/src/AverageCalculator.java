import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double result = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }
        return result / numbers.size();
    }
}