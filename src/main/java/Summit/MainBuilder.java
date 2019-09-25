package Summit;

import java.util.Arrays;
import java.util.List;

public class MainBuilder {

    public static void main(String[] args) {

        Summit s = new Summit.Builder()
                .name("Mount Everest")
                .conquerorName("Tenzing Norgay")
                .conquerstYear(1922)
                .altitude(7888)
                .country("Nepal")
                .build();

        System.out.println(s.getAltitude());
        System.out.println(s.getConquerorName());
        System.out.println(s.getName());
        System.out.println(s.getCountry());
        System.out.println(s.getConquestYear());


    }
}

