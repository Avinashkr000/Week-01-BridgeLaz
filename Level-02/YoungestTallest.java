import java.util.Scanner;

public class YoungestTallest{

  static int findYoungest(int[] age) {
    int younger = 0;
    for (int i = 0; i<age.length; i++) {
      if (younger < age[i]) {
        younger = age[i];
      }
    }
    return younger;
  }
  
  static int findTallest(int[] height) {
    int tallest = 0;
    for (int i = 0; i<height.length; i++) {
      if (tallest < height[i]) {
        tallest = height[i];
      }
    }
    return tallest;
  }
  
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    
    int[] age = new int[3];
    int[] height = new int[3];
    
    // Taking input from the user.
    System.out.print("Enter the age of 3 friends : ");
    for(int i = 0; i<3; i++) {
      age[i] = sn.nextInt();
      if (age[i] < 0) {
        System.out.println("Enter the valid age ");
        i--;
      }
    }
    
    System.out.print("Enter the height of 3 friends : ");
    for(int i = 0; i<3; i++) {
      height[i] = sn.nextInt();
      if (height[i] < 0) {
        System.out.println("Enter the valid height");
        i--;
      }
    }  
    
    int tallest = findTallest(height);
    int youngest = findYoungest(age);
    
    System.out.println("Tallest friend has a height : " + tallest);
    System.out.println("Youngest friend has a age : " + youngest);
  }
}
