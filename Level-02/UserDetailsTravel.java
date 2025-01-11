import java.util.Scanner;

public class UserDetailsTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// taking user name 
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
		// city name starting
        System.out.print("Enter your starting city : ");
        String fromcity = sc.nextLine();
		
        System.out.print("Enter your via city : ");
        String viacity = sc.nextLine();

        System.out.print("Enter your destination city : ");
        String tocity = sc.nextLine();

        System.out.print("Enter the distance from " + fromcity + " to " + viacity + " in miles: ");
        double fromToVia = sc.nextDouble();
			// city in miles
        System.out.print("Enter the distance from " + viacity + " to " + tocity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

			// Enter your time tak in hours
        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = sc.nextDouble();

        double totaldistance = fromToVia + viaToFinalCity;


        double averageSpeed = totaldistance / timeTaken;

			// print all the results
			
        System.out.println("\n UserDetailsTravel ");
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromcity + " -> " + viacity + " -> " + tocity);
        System.out.println("Distance from " + fromcity + " to " + viacity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viacity + " to " + tocity + ": " + viaToFinalCity + " miles");
        System.out.println("Total distance traveled: " + totaldistance + " miles");
        System.out.println("Time taken : " + timeTaken + " hours");
        System.out.println("Average speed : " + averageSpeed + " miles per hour");

    }
}
