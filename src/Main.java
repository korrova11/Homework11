import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ввод значений для задачи про високосный год
        int inYear = 2021; //введите значение года здесь
        defineLeapYear(inYear);
        // ввод значений для задачи про операционную систему
        byte inClientOs = 1;// введите значение 1 для Android, 0 для iOs
        int inClientDeviceYear = 2021; // введите год выпуска устройства
        recommendInstallingVersion(inClientOs, inClientDeviceYear);
        //ввод значений для задачи про доставку банковской карты
        int distance = 20; // введите расстояние
        String message = calculateDeliveryDays(distance);
        System.out.println(message);
    }

    public static void defineLeapYear(int year) {
        System.out.println("Задача 1");

        // остаток от деления номера года на 4
        int remDiv = year % 4;
        // остаток от деления на 400
        int fourHundrYear = year % 400;
        // остаток от деления на 100
        int hundredYear = year % 100;
        boolean leapYear = (((remDiv == 0) && (hundredYear != 0)) || (fourHundrYear == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void recommendInstallingVersion(byte clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = 2015;
        boolean oldAndroid = (clientDeviceYear < currentYear && clientOS == 1);
        boolean oldIOS = (clientDeviceYear < currentYear && clientOS == 0);
        if (oldAndroid) {
            System.out.println("Установите облегченную версию для Android по ссылке.");
        } else if (oldIOS) {
            System.out.println("Установите облегченную версию для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

    }

    public static String calculateDeliveryDays(int deliveryDistance) {
        System.out.println("Задача 3");
       // int deliveryDistance;
        // deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
           // System.out.println(
            return  "Потребуется дней " + day;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
           // System.out.println(
            return "Потребуется дней " + (day + 1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            //System.out.println(
            return "Потребуется дней " + (day + 2);
        } else {
           // System.out.println(
              return "К сожалению, адрес доставки находится далеко, мы Вам не можем доставить карту.";
        }

    }
}