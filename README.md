# БФИ1801 Филимонов Кирилл Владимирович

___Выполнение лабораторных работ___  
-

|Номер работы|Статус|
|:-----------:|:------:|
|   1       |:white_check_mark:|
|   2       |:white_check_mark:|
|   3       |:white_check_mark:|
|   4       ||
|   5       ||
|   6       ||
|   7       ||
|   8       ||

___Выполнение блоков___  
-

|Номер задач|Блок 1|Блок 2|Блок 3|Блок 4|Блок 5|Блок 6|
|:-----------:|:------:|:------:|:------:|:------:|:------:|:------:|
|   1       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   2       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   3       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   4       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   5       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   6       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   7       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   8       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   9       |:white_check_mark:|:white_check_mark:|:white_check_mark:|||
|   10      |:white_check_mark:|:white_check_mark:|:white_check_mark:|||

___Блок 1___
-

__Задача 1__

```java
  public static int convert(int minutes) {
    return minutes * 60;
  }
```
__Задача 2__
```java
  public static int point(int twoPoints, int threePoints) {
    return twoPoints * 2 + threePoints * 3;
  }
```
__Задача 3__
```java
  public static int footballPoint(int win, int tie, int lose) {
    return win * 3 + tie * 1 + lose * 0;
  }
```
__Задача 4__
```java
  public static boolean divisibleByFive(int number) {
    return number % 5 == 0;
  }
```
__Задача 5__
```java
  public static boolean and(boolean firstBooleanVar, boolean secondBooleanVar) {
    return firstBooleanVar && secondBooleanVar;
  }
```
__Задача 6__
```java
  public static int howManyWalls(int enoughPaint, int width, int height) {
    return enoughPaint / (width * height);
  }
```
__Задача 7__
```java
  public static int squared(int side) {
    return side * side;
  }
```
__Задача 8__
```java
  public static boolean profitableGamble(double prob, int prize, int pay) {
    return prob * prize > pay;
  }
```
__Задача 9__
```java
  public static int frames(int minutes, int fps) {
    return minutes * fps * 60;
  }
```
__Задача 10__
```java
  public static int mod(int firstNumber, int secondNumber) {
    int division = firstNumber / secondNumber;
    int divider = secondNumber * division;
    int remainder = firstNumber - divider;
    return remainder;
  }
```

___Блок 2___
-

__Задача 11__
```java
  public static int oppositeHouse(int house, int length) {
    return length * 2 - house + 1;
  }
```
__Задача 12__
```java
  public static String nameShuffle(String name) {
    String firstSubstring = name.substring(0, name.indexOf(' '));
    String secondSubstring = name.substring(name.indexOf(' ') + 1);
    String result = secondSubstring + " " + firstSubstring;
    return result;
  }
```
__Задача 13__
```java
  public static double discount(int price, int discountNumber) {
    return price - (price * discountNumber * 0.01);
  }
```
__Задача 14__
```java
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
```
__Задача 15__ 
```java
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
```
__Задача 16__ 
```java
  public static String reverseString(String s) {
    String result = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      result += s.charAt(i);
    }
    return result;
  }
```
__Задача 17__
```java
  public static int programmers(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    return max - min;
  }
```
__Задача 18__
```java
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
```
__Задача 19__
```java
  public static String bomb(String string) {
    string = string.toLowerCase(Locale.ROOT);
    if (string.contains("бомба")) {
      return "ПРИГНИСЬ!";
    } else {
      return "Расслабься, бомбы нет.";
    }
  }
```
__Задача 20__
```java
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
```

___Блок 3___
-

__Задача 21__  
```java
  public static String[][] millionsRounding(String[][] data) {
    int population;
    int checker;
    int millions;
    for (int i = 0; i < data.length; i++) {
      population = Integer.parseInt(data[i][1]);
      millions = population / 1000000;
      checker = population / 100000;
      if (checker % 10 <= 4) {
        data[i][1] = Integer.toString(millions * 1000000);
      } else {
        data[i][1] = Integer.toString((millions + 1) * 1000000);
      }
    }
    return data;
  }
```
__Задача 22__  
```java
  public static double[] otherSides(int side) {
    double hypotenuse = side * 2;
    double otherSide = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side, 2));
    double[] array = new double[2];
    array[0] = hypotenuse;
    array[1] = BigDecimal.valueOf(otherSide).setScale(2, BigDecimal.ROUND_HALF_UP)
        .doubleValue();
    return array;
  }
```
__Задача 23__  
```java
  public static String rps(String player1, String player2) {
    if (player1.equals(player2)) {
      return "Tie";
    } else if ((player1.equals("rock") && player2.equals("scissors")) ||
        (player1.equals("paper") && player2.equals("rock")) ||
        (player1.equals("scissors") && player2.equals("paper"))) {
      return "Player 1 win";
    } else {
      return "Player 2 win";
    }
  }
```
__Задача 24__  
```java
  public static int warOfNumbers(int[] array) {
    int evenNumbers = 0;
    int oddNumbers = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        evenNumbers += array[i];
      } else if (array[i] % 2 == 1) {
        oddNumbers += array[i];
      }
    }
    return Math.abs(evenNumbers - oddNumbers);
  }
```
__Задача 25__  
```java
  public static String reverseCase(String string) {
    String replacementString = "";
    char[] s = string.toCharArray();
    for (int i = 0; i < s.length; i++) {
      replacementString +=
          Character.isLowerCase(s[i]) ? Character.toUpperCase(s[i])
              : Character.toLowerCase(s[i]);
    }
    return replacementString;
  }
```
__Задача 26__  
```java
  public static String inatorInator(String string) {
    String chars = "уеыаоэяиюУЕЫАОЭЯИЮ";
    Character lastChar = string.charAt(string.length() - 1);
    if (chars.contains(lastChar.toString())) {
      string = string + "-inator " + string.length();
      return string;
    } else {
      string = string + "inator " + string.length();
      return string;
    }
  }
```
__Задача 27__  
```java
  public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
    return ((a <= w && b <= h) || (a <= w && c <= h) || (b <= w && a <= h) || (b <= w && c <= h)
        || (c <= w && a <= h) || (c <= w && b <= h));
  }
```
__Задача 28__  
```java
  public static BigDecimal totalDistance(double liters, double baseConsumption, int passengers,
      boolean conditioner) {
    double consumptionWithPassengers = baseConsumption + baseConsumption * passengers * 0.05;
    double consumptionWithConditioner = consumptionWithPassengers + consumptionWithPassengers * 0.1;
    if (conditioner) {
      return BigDecimal.valueOf(liters / consumptionWithConditioner * 100)
          .setScale(2, BigDecimal.ROUND_HALF_UP);
    } else {
      return BigDecimal.valueOf(liters / consumptionWithPassengers * 100)
          .setScale(2, BigDecimal.ROUND_HALF_UP);
    }
  }
```
__Задача 29__  
```java
  public static BigDecimal mean(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return BigDecimal.valueOf(sum / array.length).setScale(2, BigDecimal.ROUND_HALF_UP);
  }
```
__Задача 30__  
```java
  public static boolean parityAnalysis(int number) {
    String string = Integer.toString(number);
    int sum = 0;
    for (int i = 0; i < string.length(); i++) {
      sum += Integer.parseInt(Character.toString(string.charAt(i)));
    }
    return (sum % 2 == 0 && number % 2 == 0) || (sum % 2 == 1 && number % 2 == 1);
  }
```

___Блок 4___
-

__Задача 31__  
__Задача 32__  
__Задача 33__  
__Задача 34__   
__Задача 35__  
__Задача 36__  
__Задача 37__  
__Задача 38__  
__Задача 39__  
__Задача 40__  

___Блок 5___
-
__Задача 41__  
__Задача 42__  
__Задача 43__  
__Задача 44__  
__Задача 45__  
__Задача 46__  
__Задача 47__  
__Задача 48__  
__Задача 49__  
__Задача 50__  

___Блок 6___
-
__Задача 51__  
__Задача 52__  
__Задача 53__  
__Задача 54__  
__Задача 55__  
__Задача 56__  
__Задача 57__  
__Задача 58__  
__Задача 59__  
__Задача 60__  
