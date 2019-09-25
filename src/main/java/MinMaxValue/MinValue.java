package MinMaxValue;

public class MinValue implements MinMaxValueInterface {

    @Override
    public int getN(int[] numbers) {

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }
}