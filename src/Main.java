//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Ошибся и не сделал для домашки отдельную ветку и запулил её в мастер ветку из-за чего не смог сделать пул реквест

        int randomNum1 = (int) (Math.random() * 71); // 0 to 70
        int randomNum2 = (int) (Math.random() * 11); // 0 to 10
        int randomNum3 = (int) (Math.random() * 121); // 0 to 120
        int randomNum4 = (int) (Math.random() * 64); // 0 to 65
        int randomNum5 = (int) (Math.random() * 71); // 0 to 70
        int randomNum6 = (int) (Math.random() * 103); // 0 to 102
        int randomNum7 = (int) (Math.random() * 101); // 0 to 100
        int randomNum8 = (int) (Math.random() * 101); // 0 to 100
        int randomNum9 = (int) (Math.random() * 101); // 0 to 100

        //задача 1
        System.out.println(" ");
        System.out.println("задача 1");
        System.out.println(" ");
        int age = randomNum1;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " годам, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " годам, то он не достиг совершеннолетия, нужно немного подождать");
        }
        //задача 2
        System.out.println(" ");
        System.out.println("задача 2");
        System.out.println(" ");
        int temp = randomNum2;
        System.out.println("На улице " + temp + "°С, градусов");
        if (temp <= 5) {
            System.out.println(" нужно надеть шапку");
        } else {
            System.out.println(" можно идти без шапки");
        }
        //задача 3
        System.out.println(" ");
        System.out.println("задача 3");
        System.out.println(" ");
        int speed = randomNum3;
        System.out.println("Если скорость " + speed + " км/ч, то");
        if (speed >= 61) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        //задача 4
        System.out.println(" ");
        System.out.println("задача 4");
        System.out.println(" ");
        int ageTwo = randomNum4;
        System.out.println("Если возраст человека равен " + ageTwo + " годам, то");
        if (ageTwo == 1) {
            System.out.println("ему не нужно никуда ходить.");
        }
        if (ageTwo >= 2 && ageTwo <= 6) {
            System.out.println("ему нужно ходить в детский сад.");
        }
        if (ageTwo >= 7 && ageTwo <= 17) {
            System.out.println("ему нужно ходить в школу.");
        }
        if (ageTwo >= 18 && ageTwo <= 24) {
            System.out.println("ему нужно ходить в университет.");
        }
        if (ageTwo >= 25) {
            System.out.println("ему нужно ходить на работу.");
        }
        //задача 5
        System.out.println(" ");
        System.out.println("задача 5");
        System.out.println(" ");
        int ageThree = randomNum5;
        System.out.println("Если возраст ребенка равен " + ageThree + " годам, то");
        if (ageThree <= 5) {
            System.out.println("то он не может кататься на аттракционе.");
        }
        if (ageThree > 5 && ageThree < 14) {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageThree >= 14) {
            System.out.println("он может кататься без сопровождения взрослого.");
        }

        //задача 6
        System.out.println(" ");
        System.out.println("задача 6");
        System.out.println(" ");
        //int places = 102;
        int places = randomNum6;
        System.out.println("Если в вагон зайдут " + places + " пасажиров, то");
        if (places <= 60) {
            System.out.println("в вагоне останутся ещё сидячие места.");
        }
        if (places > 60 && places <= 101) {
            System.out.println("в вагоне остались только стоячие места.");
        } else {
            System.out.println("в вагоне нет мест.");
        }
        //задача 7
        System.out.println(" ");
        System.out.println("задача 7");
        System.out.println(" ");
        int one = randomNum7;
        int two = randomNum8;
        int three = randomNum9;
        System.out.println("число 1 равно "+ one);
        System.out.println("число 2 равно "+ two);
        System.out.println("число 3 равно "+ three);
        if (one > two && one > three) {
            System.out.println("самое большое число из всех "+ one);
        }
        if (two > one && two > three) {
            System.out.println("самое большое число из всех "+ two);
        }
        if (three > one && three > two) {
            System.out.println("самое большое число из всех "+ three);
        }
    }
}