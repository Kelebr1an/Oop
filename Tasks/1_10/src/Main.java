import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int menu;
    System.out.println("\n=============== Меню ==============="
        + "\n1 - convert"
        + "\n2 - point"
        + "\n3 - footballPoint"
        + "\n4 - divisibleByFive"
        + "\n5 - and"
        + "\n6 - howManyWalls"
        + "\n7 - squared"
        + "\n8 - profitableGamble"
        + "\n9 - frames"
        + "\n10 - mod"
        + "\n0 - Exit");

    while (true) {
      Scanner in = new Scanner(System.in);
      System.out.println("\nВведите число от 1 до 10");

      if (!in.hasNextInt()) {
        System.out.println("Неккоректный ввод! Повторите попытку");
        continue;
      } else {
        menu = in.nextInt();
        if (menu > 10 || menu < 0) {
          System.out.println("Неккоректный ввод! Повторите попытку");
        } else {
          switchConstruction(menu);
        }
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
    if (firstBooleanVar == true && secondBooleanVar == true) {
      return true;
    } else {
      return false;
    }
  }

  public static int howManyWalls(int enoughPaint, int width, int height) {
    return (int) enoughPaint / (width * height);
  }

  public static int squared(int side) {
    return side * side;
  }

  public static boolean profitableGamble(double prob, int prize, int pay) {
    if (prob * prize > pay) {
      return true;
    } else {
      return false;
    }
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

  public static void switchConstruction(int caseNumber) {
    switch (caseNumber) {
      case 1:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите количество минут: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int minutes = input.nextInt();
            System.out.println(minutes + " минут(-а) = " + convert(minutes));
            break;
          }
        }
        break;
      case 2:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите количество 2ух очков: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int twoPoints = input.nextInt();

            System.out.println("Введите количество 3ёх очков: ");
            if (!input.hasNextInt()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              int threePoints = input.nextInt();
              System.out.println("Окончательные очки команды = " + point(twoPoints, threePoints));
              break;
            }
          }
        }
        break;
      case 3:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите количество побед: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int win = input.nextInt();

            System.out.println("Введите количество ничьих: ");
            if (!input.hasNextInt()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              int tie = input.nextInt();

              System.out.println("Введите количество поражений: ");
              if (!input.hasNextInt()) {
                System.out.println("Неккоректный ввод! Повторите попытку");
              } else {
                int lose = input.nextInt();
                System.out.println(
                    "Количество очков футбольной команды = " + footballPoint(win, tie, lose));
                break;
              }
            }
          }
        }
        break;
      case 4:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите число: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int number = input.nextInt();
            System.out.println("Число " + number + " равноверно делится на 5?" +
                "\n" + divisibleByFive(number));
            break;
          }
        }
        break;
      case 5:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите первое логическое значение: ");
          if (!input.hasNextBoolean()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            boolean firstBooleanVar = input.nextBoolean();

            System.out.println("Введите второе логическое значение: ");
            if (!input.hasNextBoolean()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              boolean secondBooleanVar = input.nextBoolean();
              System.out
                  .println("Возвращаемое значение = " + and(firstBooleanVar, secondBooleanVar));
              break;
            }
          }
        }
        break;
      case 6:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите количество метров, которые вы можете нарисовать: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int enoughPaint = input.nextInt();

            System.out.println("Введите ширину: ");
            if (!input.hasNextInt()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              int width = input.nextInt();

              System.out.println("Введите высоту: ");
              if (!input.hasNextInt()) {
                System.out.println("Неккоректный ввод! Повторите попытку");
              } else {
                int height = input.nextInt();
                System.out.println(
                    "Количество стен, которое вы можете покрасить = " + howManyWalls(enoughPaint,
                        width, height));
                break;
              }
            }
          }
        }
        break;
      case 7:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите длину стороны: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int side = input.nextInt();
            System.out.println("Площадь = " + squared(side));
            break;
          }
        }
        break;
      case 8:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите вероятность: ");
          if (!input.hasNextDouble()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            double prob = input.nextDouble();

            System.out.println("Введите сумму выигрыша: ");
            if (!input.hasNextInt()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              int prize = input.nextInt();

              System.out.println("Введите стоимость: ");
              if (!input.hasNextInt()) {
                System.out.println("Неккоректный ввод! Повторите попытку");
              } else {
                int pay = input.nextInt();
                System.out
                    .println("Стоит ли рисковать?" + "\n" + profitableGamble(prob, prize, pay));
                break;
              }
            }
          }
        }
        break;
      case 9:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите количество минут: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int minutes = input.nextInt();

            System.out.println("Введите FPS: ");
            if (!input.hasNextInt()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              int fps = input.nextInt();
              System.out.println("Количество кадров = " + frames(minutes, fps));
              break;
            }
          }
        }
        break;
      case 10:
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Введите первое число: ");
          if (!input.hasNextInt()) {
            System.out.println("Неккоректный ввод! Повторите попытку");
          } else {
            int firstNumber = input.nextInt();

            System.out.println("Введите второче число: ");
            if (!input.hasNextInt()) {
              System.out.println("Неккоректный ввод! Повторите попытку");
            } else {
              int secondNumber = input.nextInt();
              System.out.println("Остаток от деления = " + mod(firstNumber, secondNumber));
              break;
            }
          }
        }
        break;
      case 0:
        System.exit(0);
    }
  }
}
