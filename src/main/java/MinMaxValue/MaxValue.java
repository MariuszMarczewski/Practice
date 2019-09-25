package MinMaxValue;

public class MaxValue implements MinMaxValueInterface {

    @Override
    public int getN(int[] numbers) {

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
}
