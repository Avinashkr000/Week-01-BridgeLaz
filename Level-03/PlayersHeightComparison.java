public class PlayersHeightComparison{
  public int randomNumber() {
    return (int) (Math.random() * 100 + 150); // returns a random number between 150 and 250
  }
  public int sumOfHeight(int[] heights) {
    int sum = 0;
    for (int i = 0; i < heights.length; i++) { // loop through the array
      sum += heights[i]; // add each element to the sum
    }
    return sum;
  }

  public int meanHeight(int[] heights) {
    int sum = sumOfHeight(heights);
    return sum / heights.length; // divide the sum by the number of elements
  }

  public int shortestHeight(int[] heights) {
    int min = heights[0];
    for (int i = 1; i < heights.length; i++) {
      if (heights[i] < min) { // check if the current element is smaller than the current minimum
        min = heights[i]; // update the minimum if necessary
      }
    }
    return min;
  }

  public int tallestHeight(int[] heights) {
    int max = heights[0];
    for (int i = 1; i < heights.length; i++) {
      if (heights[i] > max) { // check if the current element is larger than the current maximum
        max = heights[i]; // update the maximum if necessary
      }
    }
    return max;
  }

  public static void main(String[] args) {
    PlayersHeightComparison obj = new PlayersHeightComparison();
    int[] heights = new int[11];
    for (int i = 0; i < 11; i++) {
      heights[i] = obj.randomNumber(); // generate 11 random heights
    }
    System.out.println("The heights of the players are: ");
    for (int i = 0; i < 11; i++) {
      System.out.println("Player " + (i + 1) + " is " + heights[i] + " cm tall. "); // print the heights
    }

    // calling all the methods
    System.out.println("The mean height is: " + obj.meanHeight(heights));
    System.out.println("The mean shortest height is: " + obj.shortestHeight(heights));
    System.out.println("The mean tallest height is: " + obj.tallestHeight(heights));
  }
}
