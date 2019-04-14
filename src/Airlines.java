public class Airlines {
    int id;
    String airline;
    String abbreviation;
    String country;

    Airlines(int id, String airline, String abbreviation, String country) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.airline = airline;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getAirline() {
        return airline;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCountry() {
        return country;
    }
}
