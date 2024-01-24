public class Main {
    public static void main(String[] args) {


        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция весит " + onePortion + " кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);







        int intValue = -159;
        System.out.println("Значение переменной intValue с типом int равно " + intValue);

        byte byteValue = 67;
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);

        short shortValue = 569;
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);

        long longValue = 987678965549L;
        System.out.println("Значение переменной longValue с типом long равно " + longValue);

        long longValue2 = 27897L;
        System.out.println("Значение переменной longValue с типом long равно " + longValue2);

        float floatValue = 2.786f;
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);

        double doubleValue = 27.12;
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);


        int students1 = 23;
        int students2 = 27;
        int students3 = 30;
        int totalSheets = 480;
        int totalStudents = students1 + students2 + students3;
        int sheetsPerStudents = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudents + " листов бумаги");



        int bottlesPerMinute = 16 / 2;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInMonth = 30;

        int bottlesPer20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");

        int bottlesPerDay = bottlesPerMinute * minutesInHour * hoursInDay;
        System.out.println("В сутки машина произвела " + bottlesPerDay + " штук бутылок");

        int bottlesPer3Days = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");

        int bottlesPerMonth = bottlesPerDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");



        int valueOfClasses = 120 / (2 + 4);
        int whitePaint = valueOfClasses * 2;
        int brownPaint = valueOfClasses * 4;
        System.out.println("В школе, где " + valueOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");


        int banana = 5 * 80;
        int milk = 200;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int weightGrams = banana + milk + iceCream + eggs;
        float weightKilograms = weightGrams / 1000f;
        System.out.println("Вес завтрака " + weightGrams + " грамм");
        System.out.println("Вес завтрака " + weightKilograms + " килограмм");

        int weightToLoose = 7000;
        int gramsPerDay1 = 250;
        int gramsPerDay2 = 500;

        int days1 = weightToLoose / gramsPerDay1;
        int days2 = weightToLoose / gramsPerDay2;
        int averageDays = (days1 + days2) / 2;


        System.out.println("Количество дней для сброса веса 250 г/день: " + days1 + " дней");
        System.out.println("Количество дней для сброса веса 500 г/день: " + days2 + " дней");
        System.out.println("Среднее количество дней: " + averageDays + " дней");


        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double raisePercentage = 0.10;
        double newMashaSalary = mashaSalary * (1 + raisePercentage);
        double newDenisSalary = denisSalary * (1 + raisePercentage);
        double newKristinaSalary = kristinaSalary * (1 + raisePercentage);

        double mashaAnnualDifference = newMashaSalary * 12 - mashaSalary * 12;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + mashaAnnualDifference + " рублей");

        double denisAnnualDifference = newDenisSalary * 12 - denisSalary * 12;
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей");

        double kristinaAnnualDifference = newKristinaSalary * 12 - kristinaSalary * 12;
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей");




























    }
}