public class Airports100 {
    private String City;
    private String AirportCode;
    private String AirportName;
    private String Country;
    private String CountryAbbrev;

    Airports100(String City, String AirportCode, String AirportName, String Country, String CountryAbbrev) {
        this.City = City;
        this.AirportCode = AirportCode;
        this.AirportName = AirportName;
        this.Country = Country;
        this.CountryAbbrev = CountryAbbrev;
    }

    public String getCity() {
        return City;
    }

    public String getAirportCode() {
        return AirportCode;
    }

    public String getAirportName() {
        return AirportName;
    }

    public String getCountry() {
        return Country;
    }

    public String getCountryAbbrev() {
        return CountryAbbrev;
    }
}
