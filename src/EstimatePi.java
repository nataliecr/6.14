import java.util.Scanner;

public class EstimatePi {
  public static void main(String[] args){
    System.out.println("i                   m(i)");
    System.out.println("--------------------------------");
    
    for(int i = 1; i <= 901; i+=100){
      System.out.printf("%-10d", i);
      System.out.printf("%16.4f", ComputeSeries(i));
      System.out.println();
    }
  }  // main
  
  static double ComputeSeries(int num){
    double sum = 0;
    
    for (double i = 1; i <= num; i++){
      sum += ((Math.pow(-1, i + 1)) / (2*i - 1));
    }
    return 4*sum;
  }
} // EstimatePi
