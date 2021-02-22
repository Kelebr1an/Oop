import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(equal(1,2,0));

//    System.out.println("Введите номер дома: ");
//    int house = in.nextInt();
//    System.out.println("Введите длину улицы: ");
//    int length = in.nextInt();
//    System.out.println("Номер дома на противоположной улице: " + oppositeHouse(house,length));

//    int[] array = new int[in.nextInt()];
//    for (int i = 0; i < array.length; i++) {
//      array[i] = in.nextInt();
//    }

  }

  public static int oppositeHouse(int house, int length) {
    return length * 2 - house + 1;
  }

  public static String nameShuffle(String name) {
    String firstSubstring = name.substring(0, name.indexOf(' '));
    String secondSubstring = name.substring(name.indexOf(' ') + 1);
    String result = secondSubstring + " " + firstSubstring;
    return result;
  }

    public static double discount(int price, int discountNumber) {
      return price - (price * discountNumber * 0.01);
    }

  public static int differenceMaxMin(int[] array) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max - min;
  }

  public static int equal(int a, int b, int c) {
    int count = 0;
    if (a == b || a == c) {
      count++;
    }
    if (b == a || b == c) {
      count++;
    }
    if (c == a || c == b) {
      count++;
    }
    return count;
  }

  public static String reverseString(String s) {
    String result = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      result += s.charAt(i);
    }
    return result;
  }

  public static int programmers(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    return max - min;
  }

  public static boolean getXO(String string) {
    string = string.toLowerCase(Locale.ROOT);
    int countX = 0;
    int countO = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == 'x') {
        countX++;
      } else if (string.charAt(i) == 'o') {
        countO++;
      }
    }
    return (countX == countO);
  }

  public static String bomb(String string) {
    string = string.toLowerCase(Locale.ROOT);
    if (string.contains("бомба")) {
      System.out.println("ПРИГНИСЬ!");
    } else {
      System.out.println("Расслабься, бомбы нет.");
    }
    return null;
  }

  public static boolean sameAscii(String firstString, String secondString) {
    int firstSum = 0;
    int secondSum = 0;
    for (int i = 0; i < firstString.length(); i++) {
      firstSum += (int) firstString.charAt(i);
    }
    for (int i = 0; i < secondString.length(); i++) {
      secondSum += (int) secondString.charAt(i);
    }
    return (firstSum == secondSum);
  }
}
