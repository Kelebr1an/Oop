import java.util.Scanner;
import methods.*;

public class BlockMenu {

  public BlockMenu() {
    while (true) {
      int input = 0;
      System.out.println("\nБлок №1 (1)"
          + "\nБлок №2 (2)"
          + "\nБлок №3 (3)"
          + "\nБлок №4 (4)"
          + "\nБлок №5 (5)"
          + "\nБлок №6 (6)"
          + "\nВыход (0)");
      try {
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
      } catch (Exception exception) {
        System.out.println("Ошибка: " + exception + ". Повторите ввод");
        continue;
      }
      if (input > 6 || input < 0) {
        System.out.println("Ошибка: Недопустимое число. Повторите ввод");
        continue;
      }

      switch (input) {
        case 1:
          new BlockOne();
          continue;
        case 2:
          new BlockTwo();
          continue;
        case 3:
          new BlockThree();
          continue;
        case 4:
          new BlockFour();
          continue;
        case 5:
          new BlockFive();
          continue;
        case 6:
          new BlockSix();
          continue;
        case 0:
          System.exit(0);
      }
    }
  }
}
