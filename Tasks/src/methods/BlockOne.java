package methods;

import java.util.Scanner;

public class BlockOne {

  public BlockOne() {
    cycle:
    while (true) {
      switch (TaskMenu.createMenu()) {
        case 1:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите количество минут: ");
              int minutes = in.nextInt();
              System.out.println("Количество секунд: " + convert(minutes));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 2:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите количество 2ух очков: ");
              int twoPoints = in.nextInt();
              System.out.println("Введите количество 3ёх очков: ");
              int threePoints = in.nextInt();
              System.out.println("Окончательные очки команды = " + point(twoPoints, threePoints));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 3:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите количество побед: ");
              int win = in.nextInt();
              System.out.println("Введите количество ничьих: ");
              int tie = in.nextInt();
              System.out.println("Введите количество поражений: ");
              int lose = in.nextInt();
              System.out.println(
                  "Количество очков футбольной команды = " + footballPoint(win, tie, lose));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 4:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите число: ");
              int number = in.nextInt();
              System.out.println(
                  "Число " + number + " равноверно делится на 5?" + "\n" + divisibleByFive(number));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 5:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите первое логическое значение: ");
              boolean firstBooleanVar = in.nextBoolean();
              System.out.println("Введите второе логическое значение: ");
              boolean secondBooleanVar = in.nextBoolean();
              System.out
                  .println("Возвращаемое значение = " + and(firstBooleanVar, secondBooleanVar));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 6:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите количество метров, которые вы можете нарисовать: ");
              int enoughPaint = in.nextInt();
              System.out.println("Введите ширину: ");
              int width = in.nextInt();
              System.out.println("Введите высоту: ");
              int height = in.nextInt();
              System.out.println(
                  "Количество стен, которое вы можете покрасить = " + howManyWalls(enoughPaint,
                      width, height));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 7:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите длину стороны: ");
              int side = in.nextInt();
              System.out.println("Площадь = " + squared(side));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 8:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите вероятность: ");
              double prob = in.nextDouble();
              if (prob > 1 || prob < 0) {
                System.out.println("Неккоректный ввод! Повторите попытку");
                continue;
              }
              System.out.println("Введите сумму выигрыша: ");
              int prize = in.nextInt();
              System.out.println("Введите стоимость: ");
              int pay = in.nextInt();
              System.out.println("Стоит ли рисковать?" + "\n" + profitableGamble(prob, prize, pay));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 9:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите количество минут: ");
              int minutes = in.nextInt();
              System.out.println("Введите FPS: ");
              int fps = in.nextInt();
              System.out.println("Количество кадров = " + frames(minutes, fps));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 10:
          while (true) {
            try {
              Scanner in = new Scanner(System.in);
              System.out.println("\nВведите первое число: ");
              int firstNumber = in.nextInt();
              System.out.println("Введите второче число: ");
              int secondNumber = in.nextInt();
              System.out.println("Остаток от деления = " + mod(firstNumber, secondNumber));
              break;
            } catch (Exception exception) {
              System.out.println("Ошибка: " + exception + ". Повторите ввод");
              continue;
            }
          }
          break;
        case 0:
          break cycle;
      }
    }
  }

  public static int convert(int minutes) {
    return minutes * 60;
  }

  public static int point(int twoPoints, int threePoints) {
    return twoPoints * 2 + threePoints * 3;
  }

  public static int footballPoint(int win, int tie, int lose) {
    return win * 3 + tie * 1 + lose * 0;
  }

  public static boolean divisibleByFive(int number) {
    return number % 5 == 0;
  }

  public static boolean and(boolean firstBooleanVar, boolean secondBooleanVar) {
    return firstBooleanVar && secondBooleanVar;
  }

  public static int howManyWalls(int enoughPaint, int width, int height) {
    return enoughPaint / (width * height);
  }

  public static int squared(int side) {
    return side * side;
  }

  public static boolean profitableGamble(double prob, int prize, int pay) {
    return prob * prize > pay;
  }

  public static int frames(int minutes, int fps) {
    return minutes * fps * 60;
  }

  public static int mod(int firstNumber, int secondNumber) {
    int division = firstNumber / secondNumber;
    int divider = secondNumber * division;
    int remainder = firstNumber - divider;
    return remainder;
  }

}
