
public class Sqrt{

  public static void main(String[] args){
    int k = 7;
    System.out.println("Square root for " + k + " is: " + mySqrt(k));
  }
  public int mySqrt(int x) {
      return (int)Math.floor(Math.sqrt(x));
  }
  
}
