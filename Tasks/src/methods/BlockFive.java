package methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BlockFive {

    public BlockFive() {
        cycle:
        while (true) {
            switch (TaskMenu.createMenu()) {
                case 1:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите первую строку");
                            String firstString = in.nextLine();
                            System.out.println("\nВведите вторую строку");
                            String secondString = in.nextLine();
                            System.out.println(sameLetterPattern(firstString, secondString));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите координаты паука");
                            String spyder = in.nextLine();
                            System.out.println("\nВведите координаты мухи");
                            String fly = in.nextLine();
                            System.out.println(spiderVsFly(spyder, fly));
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
                            System.out.println("\nВведите число");
                            int number = in.nextInt();
                            System.out.println(digitsCount(number));
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
                            System.out.println("\nВведите слова через пробел");
                            String[] stringArray = stringArrayCreator();
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите слово");
                            String word = in.nextLine();
                            System.out.println(totalPoints(stringArray, word));
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
                            System.out.println("\nВведите числа через пробел");
                            int[] numbers = BlockTwo.intArrayCreator();
                            System.out.println(longestRun(numbers));
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
                            System.out.println("\nВведите слова через пробел");
                            String[] results = stringArrayCreator();
                            System.out.println(takeDownAverage(results));
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
                            System.out.println("\nВведите строку");
                            String input = in.nextLine();
                            System.out.println(rearrange(input));
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
                            System.out.println("\nВведите первое число");
                            int firstNumber = in.nextInt();
                            System.out.println("\nВведите второе число");
                            int secondNumber = in.nextInt();
                            System.out.println(maxPossible(firstNumber, secondNumber));
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
                            System.out.println("\nВведите название города А");
                            String cityA = in.nextLine();
                            System.out.println("\nВведите дату в городе А");
                            String inputDate = in.nextLine();
                            System.out.println("\nВведите название города Б");
                            String cityB = in.nextLine();
                            System.out.println(timeDifference(cityA,inputDate,cityB));
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
                            System.out.println("\nВведите число");
                            int number = in.nextInt();
                            System.out.println(isNew(number));
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

    public static String[] stringArrayCreator() {
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        String[] array; // Создаём массив
        array = tmp.split(" ");
        return array;
    }

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

    public static int digitsCount(int number) {
        if (number / 10 == 0) return 1; // Если осталось одна цифра, возвращаем 1
        return digitsCount(number / 10) + 1; // Вызываем метод, отсекая последнюю цифру и добавляем к результату 1
    }

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

    public static int longestRun(int[] numbers){
        int maxRun = 0; // Счётчик для максимальной длины
        int currentRun = 1; // Счётчик для текущей длины
        // Проходим по массиву чисел
        for (int i = 1; i < numbers.length; i++){
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

    public static String takeDownAverage(String[] results){
        int[] resultsInt = new int[results.length]; // Создаём int массив длины исходного String массива
        int sum = 0; // Создаём переменную для суммы
        // Проходим по каждому частному в массиве строк
        for (int i = 0; i < results.length; i++){
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

    public static String rearrange(String input){
        String[] inputSplit = input.split(" "); //  Разделяем строку по пробелу на слова
        String[] e = new String[inputSplit.length]; // Создаём массив размером равному кол-ву слов
        // Проходим по каждому слову
        for (int i = 0; i < inputSplit.length; i++){
            StringBuilder stringBuilder = new StringBuilder(); // Создаём строку
            // Проходим по каждому символу в слове
            for (int j = 0; j < inputSplit[i].length(); j++){
                if (inputSplit[i].charAt(j) > 48 && inputSplit[i].charAt(j) < 57) // Если символ - цифра
                    e[i] = stringBuilder.append(inputSplit[i].charAt(j) + inputSplit[i] + " ").toString(); // Записываем цифру и слово
            }
        }
        Arrays.sort(e); // Сортируем полученный массив
        String result = ""; // Создаём строку для результата
        for (String word : e){
            result += word; // Добавляем в строку все слова
        }
        result = result.replaceAll("[0-9]", ""); // Удаляем все цифры
        return result; // Возвращаем строку
    }

    public static int maxPossible(int firstNumber, int secondNumber){
        String numbers = ""; // Создаём строку для чисел
        String resultString = ""; // Создаём результирующую строку
        String firstNum = String.valueOf(firstNumber); // Преобразуем в строку первое число
        int stringLength = firstNum.length(); // Получаем количество цифр в первом числе
        numbers += String.valueOf(secondNumber); // Записываем в строку второе число
        // Проходим по каждой цифре в первом числе
        for (int i = 0; i < firstNum.length(); i++){
            int maxNum = 0; //  Переменная для проверки максимального
            // Проходим по каждой цифре во втором числе
            for (int j = 0; j < numbers.length(); j++){
                // Если значение цифры во втором числе больше максимального, запоминаем это цифру
                if (Character.getNumericValue(numbers.charAt(j)) > maxNum)
                    maxNum = Character.getNumericValue(numbers.charAt(j));
            }
            // Если максимальное значение больше цифры в первом числе, добавляем в результирующую строку это цифру
            if (maxNum > Character.getNumericValue(firstNum.charAt(i))){
                resultString += String.valueOf(maxNum);
                numbers = numbers.replaceFirst(""+ maxNum + "", ""); // Удаляем цифру во втором числе
            } else {
                resultString += firstNum.charAt(i); // Записываем исходную цифру
            }
        }
        return Integer.parseInt(resultString); // Возвращаем строку
    }

    public static String timeDifference(String cityA, String inputDate, String cityB){
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

    public static boolean isNew(int number){
        char numbers[] = String.valueOf(number).toCharArray(); // Заполняем массив цифрами числа
        Arrays.sort(numbers); // Сортируем массив
        char character; // Создаём переменную char
        // Если первый знак - 0
        if (numbers[0] == '0'){
            // Идём по цифрам
            for (int i = 1; i < numbers.length; i++){
                // Если следующий символ не равен 0
                if ((character = numbers[i]) != '0'){
                    numbers[0] = character; // Ставим символ в начало числа
                    numbers[i] = '0'; // На место символа ставим 0
                    break; // Завершаем цикл
                }
            }
        }
        // Если полученное число равно изначальному числу, значит число новое
        return Integer.parseInt(new String(numbers)) == number;
    }
}
