public class DistributesPen {
    public static void main(String[] args) {
		// TotalPen
        int TotalPen = 14;
		// Total Studen
        int NumberOfStudents = 3;
        int DistributedEquallyNumbersOfPen = 14/3;
        int ReamainingPens = 14 % 3;
		// here is the out put
        System.out.println("The Pen Per Student is " +  DistributedEquallyNumbersOfPen + "and the remaining pen not distributed is  "+ ReamainingPens );
    }
}
