public class Flights {
    int airline;
    int flightNo;
    String sourceAirport;
    String destAirport;

    Flights(int airline, int flightNo, String sourceAirport, String destAirport) {
        this.airline = airline;
        this.destAirport = destAirport;
        this.flightNo = flightNo;
        this.sourceAirport = sourceAirport;
    }

    public int getAirline() {
        return airline;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public String getDestAirport() {
        return destAirport;
    }
}
