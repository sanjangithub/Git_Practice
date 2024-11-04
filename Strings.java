import java.util.Arrays;
import java.util.Scanner;

public class Strings
{
  Strings s = new Strings();
    public static void main(String[] args) {
      String[][] studentDesk = new String[3][3];
      studentDesk[0][0] = "sanjan";
      studentDesk[0][1] = "harshini";
      studentDesk[0][2] = "vinay";
      studentDesk[1][0] = "jaikar";
      studentDesk[1][1] = "bharathi";
      studentDesk[1][2] = "chiranjeevi";
      studentDesk[2][0] = "manjari";
      studentDesk[2][1] = "john ratna kanikaram";
      studentDesk[2][2] = "deevena kumari";

      printSeatingChart(studentDesk);
    }

    public static void printSeatingChart(String[][] chart) {
      for(String[] row : chart)
      {
        for(String i : row)
        {
          System.out.println(i+" ");
        }
      }
  }
}