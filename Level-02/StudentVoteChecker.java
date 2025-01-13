import java.util.Scanner;

public class StudentVoteChecker{
  public boolean canStudentVote(int age){
    if (age < 0) {
      return false;
    }
    return (age >= 18) ? true : false; // checking via ternary operator
  }
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    StudentVoteChecker obj = new StudentVoteChecker();

    int arr[] = new int[10];
    System.out.print("Enter age of Students : ");
    for (int i = 0; i<10; i++) {
      arr[i] = sn.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      if (obj.canStudentVote(arr[i])) {
        System.out.println("Student " + (i+1) + " can vote ");
      }
      else {
        System.out.println("Student " + (i+1) + " can't vote");
      }
    }
  }
}
