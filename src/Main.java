import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        checkingForLeap(2020);
        //task 2
        updateOS(2022,1);
        //task 3
        deliveryCard(95);
    }
    public  static void checkingForLeap(int year){
        if (year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " - не високосный год");
            } else {
                System.out.println(year + " - високосный год");
            }
        } else {
            System.out.println(year + " - не високосный год");

        }
    }
    public static void updateOS(int clientDeviceYear,int clientOS){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void deliveryCard(int deliveryDistance){
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }
}