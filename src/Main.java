public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int monthSaving = 15000;
        float allSaving = (float) 0;
        int month = 0;
        float percentSaving = 0.01f;
        while (allSaving < 2459000) {
            month++;
            allSaving = allSaving + allSaving * percentSaving;
            allSaving = allSaving + monthSaving;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + allSaving + " рублей.");
        }
        System.out.println();
        System.out.println("Задача №2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();

        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача №3");
        int y = 12_000_000;
        int birthRate = y / 1000 * 17;
        int mortalityRate = y / 1000 * 8;
        int population = 0;


        for (int years = 1; years <= 10; years++) {
            population = population + birthRate - mortalityRate;
            y = y + population;
            System.out.println("Год " + years + ", численность населения составляет " + y);
        }
        System.out.println();
        System.out.println("Задача №4");

        double deposit = 15000;
        month = 0;
        while (deposit < 12_000_000) {
            double percentDeposit = deposit / 100 * 7;
            month++;
            deposit = deposit + percentDeposit;
            System.out.println(month + " " + deposit);
        }
        System.out.println();
        System.out.println("Задача №5");
        deposit = 15000;
        month = 0;
        while (deposit < 12_000_000) {
            double percentDeposit = deposit / 100 * 7;
            month++;
            deposit = deposit + percentDeposit;
            if (month % 6 == 0) {
                System.out.println(month + " " + deposit);
            }
        }
        System.out.println();
        System.out.println("Задача №6");
        deposit = 15000;
        month = 0;
        int years=9;
        int months = years*12;
        while (month<months) {
            double percentDeposit = deposit / 100 * 7;
            month++;
            deposit = deposit + percentDeposit;
            if (month % 6 == 0) {
                System.out.println(month + " " + deposit);
            }
        }
        System.out.println();
        System.out.println("Задача №7");
        int fridayNumber = 5;// Число первой пятницы от 1 до 7
        if (fridayNumber>0 && fridayNumber<=7) {
            for (; fridayNumber <= 31; fridayNumber = fridayNumber + 7) {
                System.out.println("Сегодня пятница " + fridayNumber + "-е число. Необходимо подготовить отчет.");
            }
        }
            else{
                System.out.println("Введите число первой пятницы от 1 до 7");
            }
        System.out.println();
        System.out.println("Задача №8");
         int yearNow=2024;
         int lastYears=yearNow-200;
         int futureYears = yearNow+100;
         int startPeriod = 0;
         int period = 79;
         for (int year=startPeriod; year<futureYears; year= year + period) {
             if (year>lastYears) {
                 System.out.println(year);
             }
         }

    }


    }

