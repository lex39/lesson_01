public class Main {
  public static void main(String[] args) {
    // Задание 1
    int day = 234;
    int week = day / 7;
    int mount = day / week;
    System.out.println("Задание 1");
    System.out.printf("За %d дня(-ей) прошло %d полных недель(-ли). \n", day, week);
    System.out.printf("За %d дня(-ей) прошло %d полных месяцев(-а).  \n \n", day, mount);

    // Задание 2
    int x = 57;
    int ten = x / 10;
    int one = x % 10;
    System.out.println("Задание 2");
    System.out.printf("В заданом числе %d - %d десятков. \n", x, ten);
    System.out.printf("В заданом числе %d - %d единиц. \n", x, one);
    System.out.printf("Сумма цифр числа %d - %d. \n", x, ten + one);
    System.out.printf("Произведение цифр числа %d - %d. \n \n", x, ten * one);

    // Задание 3
    int year = 1991;
    System.out.println("Задание 3");
    System.out.printf("Если человек родился в %d, то его возраст %d.", x, 2023 - year);

  }
}