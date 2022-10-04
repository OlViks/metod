import java.time.LocalDate;

public class Method {
    public static void calculateYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным. ");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void osMaster(int clientOS, int yearSmart) {
        int currentYear = LocalDate.now().getYear();
            if (clientOS == 0 && yearSmart < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else if (clientOS == 0 && yearSmart == currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
            if (clientOS == 1 && yearSmart < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else if (clientOS == 1 && yearSmart == currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
        }
    public static void dayDelivery(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDay + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDay + 2));
        } else {
            System.out.println("Расcтояние слишком большое");
        }
    }


    public static void main(String[] args) {
        System.out.println("Метод");

        // Задание 1

        int year = 400;
        calculateYear(year);

        //Задание 2

        int clientOS = 1;
        int yearSmart = 2022;
        osMaster(clientOS,yearSmart);

        //Задание 3
        int deliveryDistance = 20;
        dayDelivery(deliveryDistance);

        }
}
