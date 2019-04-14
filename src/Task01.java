import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {

    static ArrayList<Airports100> airports100 = new ArrayList<>();
    static ArrayList<Airlines> airlines = new ArrayList<>();
    static ArrayList<Flights> flights = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        read();
        printMaxFly();
        Perelets();
    }

    private static void Perelets() {
        for (Airports100 airport :
                airports100) {
            System.out.println("Airport - " + airport.getAirportName() + "fly " + schet(airport) + " raz");
        }
    }

    private static int schet(Airports100 airport) {
        int ans = 0;
        for (Flights fly :
                flights) {
            if (fly.sourceAirport.equals(airport.getAirportCode()) || fly.destAirport.equals(airport.getAirportCode())) {
                ans++;
            }

        }
        return ans;
    }

    private static void printMaxFly() {
        int max[] = new int[airlines.size()];
        for (int i = 0; i < flights.size(); i++) {
            max[flights.get(i).getAirline()]++;
        }
        int maximum = max[0];
        for (int i = 1; i < airlines.size(); i++) {
            if (maximum < max[i]) {
                maximum = max[i];
            }
        }
        System.out.println(airlines.get(maximum).airline);

    }

    static Scanner sc;

    private static void read() throws FileNotFoundException {
        readAirports("airports100.csv");
        readAirline("airlines.csv");
        readFlights("flights.csv");

    }

    private static void readAirports(String file) throws FileNotFoundException {
        sc = new Scanner(new File(file));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            String[] a = s.substring(1, s.length() - 1).trim().split("','");
            for (int i = 0; i < a.length; i++) {
                a[i].trim();
                if (a[i].charAt(a[i].length() - 1) == ' ') {
                    a[i] = a[i].substring(0, a[i].length() - 1);
                }
            }

            airports100.add(new Airports100(a[0], a[1], a[2], a[3], a[4]));
        }
    }

    private static void readAirline(String file) throws FileNotFoundException {
        sc = new Scanner(new File(file));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] a = s.trim().split(",");
            for (int i = 1; i < 4; i++) {
                a[i].trim();
                a[i] = a[i].substring(1, a[i].length() - 1);
            }
            airlines.add(new Airlines(Integer.parseInt(a[0]), a[1], a[2], a[3]));
        }
    }

    private static void readFlights(String file) throws FileNotFoundException {
        sc = new Scanner(new File(file));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] a = s.trim().split(", ");
            flights.add(new Flights(Integer.parseInt(a[0].trim()), Integer.parseInt(a[1].trim()), a[2].trim().substring(1,
                    a[2].length() - 1), a[3].trim().substring(1, a[3].length() - 1)));
        }
    }


}
