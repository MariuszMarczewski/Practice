package MorseCoder;

public class CoderFactory {

    public Coder produce(CoderType type){

        if(CoderType.MORSE.equals(type)){
            return new MorseCoder();
        }

        if(CoderType.ICAO.equals(type)){
            return new ICAOCoder();
        }

        return null;
    }
}
