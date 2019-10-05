package MinMaxValue;

public class Factory {

    public MinMaxValueInterface produce(MinMaxValueType type){

        if(MinMaxValueType.MIN.equals(type)){
            return new MinValue();
        }

        if(MinMaxValueType.MAX.equals(type)){
            return new MaxValue();
        }

        return null;
    }
}
