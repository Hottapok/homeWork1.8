import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        checkingForLeap(2021);
        //task 2
        updateOS(2021, 0);
        //task 3
        System.out.println(deliveryCard(95));
    }

    private static void checkingForLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный ");
        } else {
            System.out.println("Год не високосный ");
        }
    }

    private static void updateOS(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

    }

    private static int deliveryCard(int deliveryDistance) {
        int daysForDelivery = 0;
        if (deliveryDistance <= 20) {
            daysForDelivery = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysForDelivery = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysForDelivery = 3;
        }

        return daysForDelivery;
    }
}