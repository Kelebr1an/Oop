package methods;

import java.util.Scanner;

public class TaskMenu {

  public static int createMenu(){
    System.out.println("\nЗадача №1 (1)"
        + "\nЗадача №2 (2)"
        + "\nЗадача №3 (3)"
        + "\nЗадача №4 (4)"
        + "\nЗадача №5 (5)"
        + "\nЗадача №6 (6)"
        + "\nЗадача №7 (7)"
        + "\nЗадача №8 (8)"
        + "\nЗадача №9 (9)"
        + "\nЗадача №10 (10)"
        + "\nВыход (0)");

    Scanner in = new Scanner(System.in);
    int input = in.nextInt();

    return input;
  }
}
