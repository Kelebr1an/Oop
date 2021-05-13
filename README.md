# БФИ1801 Филимонов Кирилл Владимирович

___Выполнение лабораторных работ___  
-

|Номер работы|Статус|
|:-----------:|:------:|
|   1       |:white_check_mark:|
|   2       |:white_check_mark:|
|   3       |:white_check_mark:|
|   4       |:white_check_mark:|
|   5       |:white_check_mark:|
|   6       |:white_check_mark:|
|   7       |:white_check_mark:|
|   8       |:white_check_mark:|

___Выполнение блоков___  
-

|Номер задач|Блок 1|Блок 2|Блок 3|Блок 4|Блок 5|Блок 6|
|:-----------:|:------:|:------:|:------:|:------:|:------:|:------:|
|   1       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   2       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   3       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   4       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   5       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   6       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   7       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   8       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   9       |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|
|   10      |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|

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
```java
  public static String sevenBoom(int array[]) {
    int count = 0; // Создаём счётчик
    // Проходим по всему массиву
    for (int i = 0; i < array.length; i++) {
      // Если число является 7
      if (String.valueOf(array[i]).contains("7")) {
        count = 1;
      }
    }
    // Если count изменилось
    if (count != 0) {
      return "Бум!";
    } else {
      return "В массиве нет 7";
    }
  }
```
__Задача 32__  
```java
  public static boolean cons(int array[]) {
    array = bubbleSorter(array); // Сортируем массив
    boolean isOkey = true; // Переменная для проверки
    // Проходим по массиву
    for (int i = 1; i < array.length; i++) {
      // Если предыдущий элемент в массиве отличен от текущего более чем на 1
      if (array[i] - 1 != array[i - 1]) {
        isOkey = false;
      }
    }
    return isOkey;
  }
```
__Задача 33__  
```java
  public static String unmix(String string) {
    String result = ""; // Создаём пустую строку
    // Проходим по всей строке
    for (int i = 0; i < string.length(); i++) {
      // Если i нечетное
      if (i % 2 == 1) {
        // Добавляем к строке i символ из строки и i-1 символ
        result += string.charAt(i) + "" + string.charAt(i - 1);
      }
    }
    // Если длина строки нечетная
    if (string.length() % 2 != 0) {
      // Добавляем последний символ
      result += string.charAt(string.length() - 1);
    }
    return result;
  }
```
__Задача 34__   
```java
  public static String noYelling(String string) {
    StringBuilder stringBuilder = new StringBuilder(string); // Создаём StringBuilder
    // Проходим по всей строке с конца
    for (int i = string.length() - 1; i > 0; i--) {
      // Если i символ не ? и не !
      if (string.charAt(i) != '?' && string.charAt(i) != '!') {
        // Если этот символ последний, значит в строке нет ! и нет ?
        if (i == string.length() - 1) {
          break;
        }
        // Если после i символа стоит !
        else if (string.charAt(i + 1) == '!') {
          // Заменяем в строке всё начиная от ! до конца строки одним !
          string = stringBuilder.replace(i + 1, string.length(), "!").toString();
          break;
        }
        // Если после i символа стоит ?
        else if (string.charAt(i + 1) == '?') {
          // Заменяем в строке всё начиная от ? до конца строки одним ?
          string = stringBuilder.replace(i + 1, string.length(), "?").toString();
          break;
        }
      }
    }
    return string;
  }
```
__Задача 35__  
```java
  public static String xPronounce(String string) {
    String result = ""; // Создаём пустую строку
    // Проходим по все строке
    for (int i = 0; i < string.length(); i++) {
      // Если находим символ 'х'
      if (string.charAt(i) == 'x') {
        // Если до и после символа стоят пробелы, значит он одиночный
        if (string.charAt(i - 1) == ' ' && string.charAt(i + 1) == ' ') {
          result += "ecks";
          // Если до символа стоит пробел, а после нет, значит он находится в начале слова
        } else if (string.charAt(i - 1) == ' ' && string.charAt(i + 1) != ' ') {
          result += 'z';
          // Если он в конце или в середине слова
        } else {
          result += "cks";
        }
        // Если не нашли символ 'x'
      } else {
        result += string.charAt(i);
      }
    }
    return result;
  }
```
__Задача 36__  
```java
  public static int largestGap(int array[]) {
    array = bubbleSorter(array); // Сортируем массив
    int gap = 0; // Создаём переменную для наибольшего разрыва
    int tmpGap = 0; // Создаём временную переменную
    // Проходим по всему массиву
    for (int i = 0; i < array.length - 1; i++) {
      tmpGap = array[i + 1] - array[i]; // Считаем разницу между i+1 и i элементами
      // Если разница больше, текущей максимальной
      if (gap < tmpGap) {
        gap = tmpGap; // Записываем в переменную полученную разницу
      }
    }
    return gap;
  }
```
__Задача 37__  
```java
  public static int trick(int number) {
    int tmpNumber = number;
    String tmp = Integer.toString(tmpNumber); // Создаём String для получения длины числа
    int[] intArray = new int[tmp.length()]; // Инициализируем int массив
    // Проходим по всему массиву символов
    for (int i = 0; tmpNumber > 0; tmpNumber /= 10) {
      intArray[i] = tmpNumber % 10; // Заполняем массив цифрами числа
      i++;
    }

    intArray = bubbleSorter(intArray); // Сортируем массив
    String sortedNumber = ""; // Создаём строку
    for (int i = 0; i < intArray.length; i++) {
      sortedNumber += intArray[i]; // Добавляем цифры в строку
    }
    // Возвращаем разницу между числом и его отсортированной копией
    return number - Integer.valueOf(sortedNumber);
  }
```
__Задача 38__  
```java
  public static String commonLastVowel(String string) {
    string = string.toLowerCase(Locale.ROOT); // Приводим строку к нижнему регистру
    // Массив из всех гласных букв
    Character[] characters = {'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю',
        'e', 'y', 'u', 'i', 'o', 'a'};
    // Массив со счётчиком под каждую гласную
    int[] count = new int[15];

    // Проходим по каждой букве
    for (int i = 0; i < characters.length; i++) {
      // Проходим по всей строке
      for (int j = 0; j < string.length(); j++) {
        // Если символ в строке = букве
        if (string.charAt(j) == characters[i]) {
          count[i] += 1; // Добавляем к счётчику этой буквы 1
        }
      }
    }

    int indexMax = -1; // Создаём переменную, чтобы запомнить индекс счётчика с макс. значением
    int max = 0; // Создаём переменную для макс. значения
    // Проходим по массиву со счётчиками
    for (int i = 0; i < count.length; i++) {
      // Если значение счётчика, больше чем максимальное
      if (count[i] > max) {
        max = count[i]; // Максимальному присваиваем текущее
        indexMax = i; // Запоминаем индекс
      }
    }
    // Если indexMax не изменилась, значит гласных нет
    if (indexMax == -1) {
      return "В предложении нет гласных";
    }
    return String.valueOf(characters[indexMax]);
  }
```
__Задача 39__  
```java
  public static int memeSum(int firstNumber, int secondNumber) {
    // Находим наибольшую длину числа
    int maxLength;
    if (String.valueOf(firstNumber).length() > String.valueOf(secondNumber).length()) {
      maxLength = String.valueOf(firstNumber).length();
    } else {
      maxLength = String.valueOf(secondNumber).length();
    }

    String result = ""; // Создаём строку для заполнения
    // Запускаем цикл, где кол-во итераций = длине числа с наибольшим кол-вом разрядов
    for (int i = 0; i < maxLength; i++) {
      int firstArg = firstNumber % 10; // Первый аргумент = последняя цифра первого числа
      int secondArg = secondNumber % 10; // Второй аргумент = последня цифра второго числа
      int sum = firstArg + secondArg; // Сумма аргументов
      result = sum + result; // Записываем в строку сумму аргументов + строку
      firstNumber /= 10; // Убираем последнюю цифру первого числа
      secondNumber /= 10; // Убираем последнюю цифру второго числа
    }
    return Integer.valueOf(result);
  }
```
__Задача 40__ 
```java
  public static String unrepeated(String string) {
    // Проходим по каждому символу в строке
    for (int i = 0; i < string.length(); i++) {
      // Пока находим с конца строки такой же символ
      while (string.lastIndexOf(string.charAt(i)) != string.indexOf(string.charAt(i))) {
        int index = string.lastIndexOf(string.charAt(i)); // Запоминаем индекс символа в строке
        // Переписываем строку, добавляя в неё всё до символа и всё после него, не включая сам символ
        string = string.substring(0, index) + string.substring(index + 1);
      }
    }
    return string;
  }
```

___Блок 5___
-

__Задача 41__
```java
    public static boolean sameLetterPattern(String firstString, String secondString) {
        // Если длина строк не совпадает, возвращаем false
        if (firstString.length() != secondString.length()) {
            return false;
        }

        boolean firstStringEqual[] = new boolean[firstString.length()]; // Создаём массив для сравнения в первой строке
        boolean secondStringEqual[] = new boolean[firstString.length()];    // Создаём массив для сравнения во второй строке

        // Проходим по всей строке
        for (int i = 0; i < firstString.length() - 1; i++) {
            firstStringEqual[i] = firstString.charAt(i) == firstString.charAt(i + 1); // Записываем в массив результат соответствия
            secondStringEqual[i] = secondString.charAt(i) == secondString.charAt(i + 1); // Создаём массив для сравнения в первой строке

            // Если соответствия не равны, возвращаем false
            if (firstStringEqual[i] != secondStringEqual[i]) return false;
        }

        return true;
    }
```
__Задача 42__ 
```java
    public static String spiderVsFly(String spider, String fly) {
        char spyderLetter = spider.charAt(0); // Получаем букву координаты паука
        char spyderNumber = spider.charAt(1); // Получаем цифру координаты паука
        char flyLetter = fly.charAt(0); // Получаем букву координаты мухи
        char flyNumber = fly.charAt(1); // Получаем цифру координаты мухи
        char midRing; // Переменная для совпадения колец паука и мухи

        // Если расстояние между буквами меньше или равно двум или больше или равно 6
        if (Math.abs(spyderLetter - flyLetter) <= 2 || Math.abs(spyderLetter - flyLetter) >= 6) {
            midRing = (char) Math.min(spyderNumber, flyNumber); // Записываем в переменную меньшую цифру из двух координат
        } else {
            midRing = '0'; // Записываем 0
        }

        String answer = "" + spyderLetter + spyderNumber + "-"; //Записываем начало пути

        // До тех пор, пока кольцо паука дальше чем, место совпадения колец
        while (spyderNumber > midRing)
            // Если следующий шаг паука приводит его к центру паутины добавляем к строке точку A0
            // В противном случае добавляем следующий шаг паука
            answer += (--spyderNumber == '0' ? "A0-" : "" + spyderLetter + spyderNumber + "-");

        // До тех пор, пока радиала паука меньше или равна радиала мухи и место совпадения колец не равно 0
        while (spyderNumber <= flyNumber && midRing != '0') {
            if (spyderLetter == flyLetter) break; // Если координаты паука и мухи совпадают, завершаем цикл

            // Если расстояние между радианами паука и мухи больше или равно 6
            if (6 <= Math.abs(spyderLetter - flyLetter)) {
                // Если радиана паука больше чем радиала мухи
                if (spyderLetter > flyLetter) {
                    spyderLetter++; // Двигаем паука вперёд
                    if (spyderLetter == 'I') spyderLetter = 'A'; // Учитываем концы радиан
                } else {
                    // Если радиана паука меньше чем радиана мухи
                    spyderLetter--; // Двигаем паука назад
                    if (spyderLetter == '@') spyderLetter = 'H'; // Учитываем концы радиан
                }
            } else {
                // Если радиана паука меньше чем радиана мухи
                if (spyderLetter < flyLetter) spyderLetter++; // Двигаем паука вперёд
                    // Если радиана паука больше чем радиана мухи
                else spyderLetter--; // Двигаем паука назад
            }

            answer += "" + spyderLetter + spyderNumber + "-"; // Добавляем следующий шаг паука
        }

        // После совпадения радиан, двигаем паука по радиане к совпадению колец и добавляем шаги к ответу
        while (spyderNumber++ < flyNumber) answer += "" + flyLetter + spyderNumber + "-";
        return answer.substring(0, answer.length() - 1); // Выводим ответ без последнего знака
    }
```
__Задача 43__
```java
    public static int digitsCount(int number) {
        if (number / 10 == 0) return 1; // Если осталось одна цифра, возвращаем 1
        return digitsCount(number / 10) + 1; // Вызываем метод, отсекая последнюю цифру и добавляем к результату 1
    }
```
__Задача 44__
```java
    public static int totalPoints(String[] stringArray, String word) {
        int mainCount = 0; // Создаём переменную счётчик
        List<Character> checkList = new ArrayList<>(); // Создаём список для букв исходного слова
        // Заполняем список буквами исходного слова
        for (int i = 0; i < word.length(); i++) {
            checkList.add(word.charAt(i));
        }

        // Проходим по каждому слову
        for (int i = 0; i < stringArray.length; i++) {
            int count = 0; // Создаём счётчик
            char[] character = stringArray[i].toCharArray(); // Создаём массив из букв слова
            List<Character> copy = new ArrayList<Character>(checkList); // Создаём копию массива из букв исходного слова

            // Проходим по каждой букве в массиве из букв слова
            for (int j = 0; j < character.length; j++) {
                // Если буква есть в массиве из букв исходного слова
                if (copy.contains(character[j])) {
                    count++; // Добавляем к счётчику 1
                    copy.remove(copy.indexOf(character[j])); // Удаляем найденную букву из массива из букв исходного слова
                } else {
                    count = 0; // Если буква не соответствует, обнуляем счётчик
                    break;  // Завершаем цикл
                }
            }

            copy.removeAll(copy); // Очищаем список
            // Считаем очки за слово
            if (count == 3)
                mainCount += 1;
            else if (count == 4)
                mainCount += 2;
            else if (count == 5)
                mainCount += 3;
            else if (count == 6 && copy.isEmpty())
                mainCount += 54;
            else
                mainCount += 0;
        }

        return mainCount; // Возвращаем общее количество очков
    }
```
__Задача 45__
```java
    public static int longestRun(int[] numbers) {
        int maxRun = 0; // Счётчик для максимальной длины
        int currentRun = 1; // Счётчик для текущей длины
        // Проходим по массиву чисел
        for (int i = 1; i < numbers.length; i++) {
            // Если цифры идут последовательно
            if (numbers[i - 1] == numbers[i] - 1 || numbers[i - 1] == numbers[i] + 1)
                currentRun += 1; // Увеличиваем счётчик
            else
                currentRun = 1; // Обновляем счётчик
            // Если текущая длина  больше максимальной
            if (currentRun > maxRun)
                maxRun = currentRun; // Устанавливаем максимальную равную текущей
        }
        return maxRun; // Возвращаем максимальную
    }
```
__Задача 46__
```java
    public static String takeDownAverage(String[] results) {
        int[] resultsInt = new int[results.length]; // Создаём int массив длины исходного String массива
        int sum = 0; // Создаём переменную для суммы
        // Проходим по каждому частному в массиве строк
        for (int i = 0; i < results.length; i++) {
            results[i] = results[i].replace('%', '0'); // Заменяем % на 0
            resultsInt[i] = Integer.parseInt(results[i]) / 10; // Убираем 0 и добавляем в int массив
            sum += resultsInt[i]; // Добавляем к сумме
        }
        int average = sum / resultsInt.length; // Получаем среднее
        int targetAverage = average - 5; // Получаем среднее снижая балл на 5%
        int targetSum = targetAverage * (resultsInt.length + 1); // Находим общее учитывая отсутствующие 5%
        int targetResult = targetSum - sum; // Получаем ответ
        return String.valueOf(targetResult) + "%"; // Возвращаем ответ с %
    }
```
__Задача 47__
```java
    public static String rearrange(String input) {
        String[] inputSplit = input.split(" "); //  Разделяем строку по пробелу на слова
        String[] e = new String[inputSplit.length]; // Создаём массив размером равному кол-ву слов
        // Проходим по каждому слову
        for (int i = 0; i < inputSplit.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(); // Создаём строку
            // Проходим по каждому символу в слове
            for (int j = 0; j < inputSplit[i].length(); j++) {
                if (inputSplit[i].charAt(j) > 48 && inputSplit[i].charAt(j) < 57) // Если символ - цифра
                    e[i] = stringBuilder.append(inputSplit[i].charAt(j) + inputSplit[i] + " ").toString(); // Записываем цифру и слово
            }
        }
        Arrays.sort(e); // Сортируем полученный массив
        String result = ""; // Создаём строку для результата
        for (String word : e) {
            result += word; // Добавляем в строку все слова
        }
        result = result.replaceAll("[0-9]", ""); // Удаляем все цифры
        return result; // Возвращаем строку
    }
```
__Задача 48__
```java
    public static int maxPossible(int firstNumber, int secondNumber) {
        String numbers = ""; // Создаём строку для чисел
        String resultString = ""; // Создаём результирующую строку
        String firstNum = String.valueOf(firstNumber); // Преобразуем в строку первое число
        int stringLength = firstNum.length(); // Получаем количество цифр в первом числе
        numbers += String.valueOf(secondNumber); // Записываем в строку второе число
        // Проходим по каждой цифре в первом числе
        for (int i = 0; i < firstNum.length(); i++) {
            int maxNum = 0; //  Переменная для проверки максимального
            // Проходим по каждой цифре во втором числе
            for (int j = 0; j < numbers.length(); j++) {
                // Если значение цифры во втором числе больше максимального, запоминаем это цифру
                if (Character.getNumericValue(numbers.charAt(j)) > maxNum)
                    maxNum = Character.getNumericValue(numbers.charAt(j));
            }
            // Если максимальное значение больше цифры в первом числе, добавляем в результирующую строку это цифру
            if (maxNum > Character.getNumericValue(firstNum.charAt(i))) {
                resultString += String.valueOf(maxNum);
                numbers = numbers.replaceFirst("" + maxNum + "", ""); // Удаляем цифру во втором числе
            } else {
                resultString += firstNum.charAt(i); // Записываем исходную цифру
            }
        }
        return Integer.parseInt(resultString); // Возвращаем строку
    }
```
__Задача 49__
```java
    public static String timeDifference(String cityA, String inputDate, String cityB) {
        // Создаём HashMap с ключом в ввиде названия города и значением ввиде смещения по Гринвичу в минутах
        HashMap<String, Integer> timeZones = new HashMap<>();
        // Заполняем HashMap
        timeZones.put("Los Angeles", -480);
        timeZones.put("New York", -300);
        timeZones.put("Caracas", -270);
        timeZones.put("Buenos Aires", -180);
        timeZones.put("London", 0);
        timeZones.put("Rome", 60);
        timeZones.put("Moscow", 180);
        timeZones.put("Tehran", 210);
        timeZones.put("New Delhi", 330);
        timeZones.put("Beijing", 480);
        timeZones.put("Canberra", 600);

        // Создаём два формата для времени
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM d, yyyy HH:mm", Locale.ENGLISH); // Исходный
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-M-d HH:mm", Locale.ENGLISH); // Результирующий

        // Создаём объект класса Date
        Date date = null;
        try {
            date = dateFormat1.parse(inputDate); // Пытаемся записать туда исходную дату
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance(); // Создаём объект класса Calendar
        calendar.setTime(date); // Устанавливаем в нём полученную дату
        calendar.add(Calendar.MINUTE, (timeZones.get(cityB) - timeZones.get(cityA))); // Меняем время учитывая город Б
        String outputDate = dateFormat2.format(calendar.getTime()); // Получаем дату в городе Б

        return outputDate;
    }
```
__Задача 50__
```java
    public static boolean isNew(int number) {
        char numbers[] = String.valueOf(number).toCharArray(); // Заполняем массив цифрами числа
        Arrays.sort(numbers); // Сортируем массив
        char character; // Создаём переменную char
        // Если первый знак - 0
        if (numbers[0] == '0') {
            // Идём по цифрам
            for (int i = 1; i < numbers.length; i++) {
                // Если следующий символ не равен 0
                if ((character = numbers[i]) != '0') {
                    numbers[0] = character; // Ставим символ в начало числа
                    numbers[i] = '0'; // На место символа ставим 0
                    break; // Завершаем цикл
                }
            }
        }
        // Если полученное число равно изначальному числу, значит число новое
        return Integer.parseInt(new String(numbers)) == number;
    }
```
___Блок 6___
-

__Задача 51__
```java
    public static String hiddenAnagram(String string, String substring) {
        string = string.toLowerCase().replaceAll("[^a-z]", ""); // Убираем все символы в строке кроме букв
        substring = substring.toLowerCase().replaceAll(" ", ""); // Убираем все пробелы
        // Проходим в течение разницы между длинами строк
        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            // Если i символ в первой строке присутствует во второй строке
            if (substring.indexOf(string.charAt(i)) > -1) {
                // Создаём подстроку от найденного символа до длины второй строки + i
                String subT = string.substring(i, i + substring.length());
                // Проверяем является ли полученная строка анаграмой
                if (isAnagram(subT, substring)) {
                    return subT;
                }
            }
        }
        return "noutfond";
    }

    private static Boolean isAnagram(String firstString, String secondString) {
        StringBuilder s = new StringBuilder(secondString); // Создаём объект класса StringBuilder из второй строки
        // Проходим по всем символам строки, которая может быть анаграммой
        for (int i = 0; i < firstString.length(); i++) {
            int in = s.indexOf(String.valueOf(firstString.charAt(i))); // Находим индекс i символа строки во второй строке
            // Если символ отсутствует во второй строке, значит это не анаграмма
            if (in == -1) {
                return false;
            }
            s.setCharAt(in, '-'); // Меняем символ на -
        }
        return true;
    }
```
__Задача 52__
```java
    public static String[] collect(String string, int n) {
        // Если длина строки меньше, чем длина среза, возвращаем пустой массив
        if (string.length() < n) return new String[0];
        String[] w = collect(string.substring(n), n); // Вызываем метод с урезанной строкой
        String[] v = new String[w.length + 1]; // Создаём массив размером = кол-во слов
        v[0] = string.substring(0, n); // Вставляем первое слово в массив
        for (int i = 0; i < w.length; i++) v[i + 1] = w[i]; // Добавляем остальные слова
        Arrays.sort(v); // Сортируем полученный массив
        return v;
    }
```
__Задача 53__
```java
    public static String nicoCipher(String string, String key) {
        int stringLength = string.length(); // Получаем длину строки
        int keyLength = key.length(); // Получем длину ключа
        int r = (stringLength - stringLength % keyLength) / keyLength; // Переменная для назначения номеров для букв сообщения
        if (stringLength % keyLength != 0) r++; // Увеличиваем на 1, в случае необходимости в зависимости от чётности
        for (int i = stringLength; i < r * keyLength; i++)
            string += " ";
        char[][][] v = new char[r][keyLength][2]; // Создаём массив для хранения букв и номеров
        // Заполняем массив
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < keyLength; j++) {
                v[i][j][0] = string.charAt(i * keyLength + j);
                v[i][j][1] = key.charAt(j);
            }
            Arrays.sort(v[i], (a, b) -> (int) a[1] - (int) b[1]); // Сортируем полученный массив
        }
        String eMessage = "";
        for (int i = 0; i < r; i++)
            for (int j = 0; j < keyLength; j++)
                eMessage += v[i][j][0]; // Формируем строку
        return eMessage;
    }
```
__Задача 54__
```java
    public static int[] twoProduct(int[] array, int product) {
        // Проходим по массиву
        for (int i = 1; i < array.length; i++) {
            // Проходим по массиву до i числа
            for (int j = 0; j < i; j++) {
                // Если произведение чисел равно необходимому числу
                if (array[j] * array[i] == product) {
                    // Заполняем массив соответствующими числами
                    int[] result = new int[2];
                    result[0] = array[j];
                    result[1] = array[i];
                    return result; // Возвращаем массив
                }
            }
        }
        // Если не нашли соответствие, возвращаем пустой массив
        int[] result = new int[1];
        return result;
    }
```
__Задача 55__
```java
    public static int[] isExact(int n, int... f) {
        if (f.length < 2) return isExact(n, 1, 1);
        //  Считаем значение факториала
        f[1] *= ++f[0];
        // Если верхняя граница факториала меньше исходного числа, заного вызываем метод
        if (f[1] < n) {
            return isExact(n, f[0], f[1]);
        } else if (f[1] == n) {
            return new int[]{n, f[0]};  // Если верхняя граница факториала совпадает с исходном числом, возвращаем число и факториал
        } else {
            return new int[0]; // Возвращаем пустой массив
        }
    }
```
__Задача 56__ 
```java
    public static String fractions(String decimal) {
        // Получаем первую часть числа
        long n1 = Long.parseLong(decimal.replaceAll("(.*)\\(.*", "$1").replace(".", ""));
        // Получаем вторую часть числа
        long n2 = Long.parseLong(decimal.replaceAll("[\\(\\)\\.]", ""));
        int exp1 = decimal.replaceAll("\\d+\\.(\\d*)\\(\\d+\\)", "$1").length();
        int exp2 = decimal.replaceAll("\\d+\\.(?=.*)", "").replaceAll("[\\(\\)]", "").length();
        // Считаем разницу между частями числа
        long num = n2 - n1;
        long div = (long) Math.pow(10, exp2) - (long) Math.pow(10, exp1);
        long gcdiv = gcd(num, div);
        num = num / gcdiv;
        div = div / gcdiv;
        return String.format("%d/%d", num, div);
    }
    
    private static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
```
__Задача 57__  
```java
    public static String pilishString(String string) {
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9}; // Число Пи
        int i = 0; // Счётчик
        String str = ""; // Строка
        // Пока счётчик меньше 15 и длина строки больше чем значение i цифры числа Пи
        while (i < 15 && string.length() >= pi[i]) {
            str += string.substring(0, pi[i]) + " "; // Добавляем к результирующей строке часть от слова по длине равную i цифре числа Пи
            string = string.substring(pi[i]); // Обрезаем строку
            i++; // Двигаем счётчик
        }
        return string.isEmpty() || i == 15 ? str.trim() : str + string + String.format("%0" + (pi[i] - string.length()) + "d", 0).replace('0', string.charAt(string.length() - 1));
    }
```
__Задача 58__  
```java
    public static String generateNonconsecutive(int n) {
        String ans = ""; // Строка для ответа
        // Пока не кончатся возможные комбинации
        for (int i = 0; i < Math.pow(2, n); i++) {
            String b = Integer.toBinaryString(i); // Получаем бинарное значение
            // Пока длина бинарного значения не будет = n, добавляем 0
            while (b.length() < n) b = "0" + b;
            // Убираем последовательность и добав
            if (b.indexOf("11") < 0) ans += " " + b;
        }
        return ans.substring(1);
    }
```
__Задача 59__  
```java
    public static String isValid(String string) {
        HashMap<Character, Integer> map = new HashMap(); // Создаём HashMap
        // Заполняем HashMap
        for (int i = 0; i < string.length(); i++) {
            char key = string.charAt(i); // Запоминаем символ
            // Если в HashMap есть такой символ
            if (map.get(key) != null)
                map.put(key, map.get(key) + 1); // Добавляем значению по данному символу 1
            else
                map.put(key, 1); // Если нет, то добавляем символ в HashMap
        }
        ArrayList<Integer> mapValues = new ArrayList(map.values()); // Создаём список из значение HashMap
        int max = (int) Collections.max(mapValues); //Находим максимальное
        int min = (int) Collections.min(mapValues); //Находим минимальное
        if (max == min) // Если они равны
            return "YES"; // Возвращаем Yes
        int minСount = 0, maxСount = 0; // Счётчики
        // Проходим по значения HashMap
        for (int i = 0; i < mapValues.size(); i++) {
            // Считаем значения максимальных
            if (mapValues.get(i) == max)
                maxСount++;
            // Считаем значения минимальных
            else if (mapValues.get(i) == min)
                minСount++;
        }
        // Если убрав один символ мы сможем сравнять значения max и min, то возвращаем YES
        return (minСount == 1 || (maxСount == 1 && max == min + 1)) ? "YES" : "NO";
    }
```
__Задача 60__  
```java
    public static int[][] sumsUp(int[] array) {
        int[][] tempResult = new int[array.length][2]; // Создаём массив
        int resultCounter = 0; // Счётчик
        // Проходим по всему исходному массиву
        for (int i = 0; i < array.length; i++) {
            // Проходим по всему исходному массиву с конца
            for (int j = i - 1; j >= 0; j--) {
                // Проверяем даёт ли пары чисел в сумме 8 и при этом не является 8 по отдельности
                if (array[i] + array[j] == 8 && array[i] != 8 && array[j] != 8) {
                    // Записываем пару в порядке возрастания
                    if (array[i] < array[j]) {
                        tempResult[resultCounter][0] = array[i];
                        tempResult[resultCounter][1] = array[j];
                    } else {
                        tempResult[resultCounter][0] = array[j];
                        tempResult[resultCounter][1] = array[i];
                    }
                    resultCounter++; //Добавляем 1 к счётчику
                }
            }
        }
        int[][] result = new int[resultCounter][2]; // Создаём массив
        // Заполняем его полученными парами чисел
        for (int i = 0; i < resultCounter; i++) {
            result[i][0] = tempResult[i][0];
            result[i][1] = tempResult[i][1];
        }
        return result;
    }
```
