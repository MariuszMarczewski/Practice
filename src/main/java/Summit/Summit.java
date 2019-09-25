package Summit;

public class Summit {
    private String name;
    private String conquerorName;
    private Integer conquestYear;
    private Integer altitude;
    private String country;

    public static class Builder{
        private String name = null;
        private String conquerorName = null;
        private Integer conquestYear = null;
        private Integer altitude = null;
        private String country = null;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder conquerorName(String conquerorName){
            this.conquerorName = conquerorName;
            return this;
        }

        public Builder conquerstYear(Integer conquestYear){
            this.conquestYear = conquestYear;
            return this;
        }

        public Builder altitude(Integer altitude){
            this.altitude = altitude;
            return this;
        }
Builder country(String country){
            this.country = country;
            return this;
        }

        public Summit build(){
            return new Summit(this);
        }

    }

    private Summit(Builder builder){
        this.name = builder.name;
        this.conquerorName = builder.conquerorName;
        this.conquestYear = builder.conquestYear;
        this.altitude = builder.altitude;
        this.country = builder.country;
    }

    public String getName() {
        return name;
    }

    public String getConquerorName() {
        return conquerorName;
    }

    public Integer getConquestYear() {
        return conquestYear;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public String getCountry() {
        return country;
    }
}

