public class VolumeOfEarth {
    public static void main(String[] args) {
        int Radius = 6378;
        double RadiusMiles = Radius *  0.621371;
        double VolumeKm3 = (4.0 / 3) * Math.PI * Math.pow(Radius, 3);
        double VolumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(Radius, 3);

		// the results 
        System.out.printf("The volume of earth in cubic kilometer is "+ VolumeKm3 + "and cubic miles is " + VolumeMiles3);
    }
}
