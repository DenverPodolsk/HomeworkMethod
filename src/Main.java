import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        exam1(2022);
        exam2(1, 2022);
        int countDays = exam3(56);
        System.out.println("На доставку вам потребуеться " + countDays + " дня");
    }

    private static int exam3(int distance) {
        int days = 0;
        if (distance >= 0 && distance < 40) {
            days += 1;
        }
        if (distance >= 40 && distance < 60) {
            days += 2;
        }
        if (distance >= 60 && distance < 80) {
            days += 3;
        }
        if (distance >= 80) {
            days += 4;
        }
        return days;

    }

    private static void exam1(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Високосный");
        } else
            System.out.println(year + " Не високосный");
    }

    private static void exam2(int OS, int year) {
        int currentYear = LocalDate.now().getYear();

        if (OS == 0 && year >= currentYear) {
            System.out.println("У вас актуальная версия IOS");
        } else if (OS == 0 && year < currentYear) {
            System.out.println("У вас неактуальная версия IOS");
        } else if (OS == 1 && year >= currentYear) {
            System.out.println("У вас актуальная версия Android");
        } else if (OS == 1 && year < currentYear) {
            System.out.println("У вас неактувльная версия Android");
        }


    }


}

