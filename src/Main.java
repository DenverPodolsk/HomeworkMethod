import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        far1(2022);
        far2(1, 2022);
        int countDays = far3(56);
        System.out.println("На доставку вам потребуеться" + countDays);
    }
    public static int far3(int distance) {
        int days = 0;
        if (distance >= 0 && distance < 40)
            days += 1;
        if (distance >= 40 && distance < 60)
            days += 2;
        if (distance >= 60 && distance < 80)
            days += 3;
        if (distance >= 80)
            days += 4;
        return days;

    }

    public static void far1(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + "Високосный");
        else
            System.out.println(year + "Не високосный");
    }

    public static void far2(int OS, int year) {
        int currentYear = LocalDate.now().getYear();

        if (OS == 0 && year >= currentYear)
            System.out.println("У вас актуальная версия IOS");
        else if (OS == 0 && year < currentYear)
            System.out.println("У вас неактуальная версия IOS");
        else if (OS == 1 && year >= currentYear)
            System.out.println("У вас актуальная версия Android");
        else if (OS == 1 && year < currentYear)
            System.out.println("У вас неактувльная версия Android");



    }


}

