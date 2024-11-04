public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte age = 19;
        if (age < 18) {
            System.out.println("Усли возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Усли возраст человека равен " + age + " он совершеннолетний");
        }

        System.out.println("Задача 2");
        System.out.println();
        byte temp = -19;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3");
        System.out.println();
        byte vel = 72;
        if (vel < 60) {
            System.out.println("Если скорость " + vel + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + vel + " можно ездить спокойно");
        }

        System.out.println("Задача 4");
        System.out.println();
        age = 125;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " то ему рано ходить в детский сад");
        } else {
            if (age < 7) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
            } else {
                if (age < 18) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
                } else {
                    if (age < 25) {
                        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
                    } else {
                        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в на работу");
                    }
                }
            }
        }

        System.out.println("Задача 5");
        System.out.println();
        age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            if (age > 4 && age <14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            }else{
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");

            }

        }

        System.out.println("Задача 6");
        System.out.println();
        int pas = 104;
        if (pas < 61) {
            System.out.println("В вагоне еще есть " + (60 - pas) + ", сидячих мест");
        } else {
            if (pas > 60 && pas <103) {
                System.out.println("В вагоне еще есть " + (102 - pas) + ", стоячих мест");
            }else{
                   System.out.println("В вагоне не осталось мест");
            }

            System.out.println("Задача 7");
            System.out.println();
            int one = 1;
            int two = 2;
            int three = 3;

            if ((one > two) && (one > three)){
                System.out.println("Большее число: " + one);
            }else{
                if (two > three){
                    System.out.println("Большее число: " + two);
                }else {
                    System.out.println("Большее число: " + three);
                }


            }


        }

    }
}