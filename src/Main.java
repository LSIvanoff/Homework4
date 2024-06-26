public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        //else {
            //System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        //}



        //Задание 2
        System.out.println("Задание 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //else {
            //System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        //}


        //Задание 3
        System.out.println("Задание 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
        //else {
            //System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        //}


        //Задание 4
        System.out.println("Задание 4");
        int ageOfThePerson = 25;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад");
        }
        if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу");
        }
        if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то его место в университете");
        }
        if (ageOfThePerson > 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему пора ходить на работу");
        }
        //else if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
            //System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу");
        //} else if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
            //System.out.println("Если возраст человека равен " + ageOfThePerson + ", то его место в университете");
        //} else if (ageOfThePerson > 24) {
            //System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему пора ходить на работу");
        //}


        //Задание 5
        System.out.println("Задание 5");
        int ageOfTheChild = 15;
        if (ageOfTheChild  < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то он может кататься без сопровождения взрослого");
        }


        //Задание 6
        System.out.println("Задание 6");
        int trainCarCapacity = 102;
        int seatPlace = 60;
        int standingPlace = trainCarCapacity - seatPlace;
        int passenger = 75;
        if (passenger >= 102) {
            System.out.println("Вагон полон, мест нет");
        } else if (passenger >= 60) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }


        //Задание 7
        System.out.println("Задание 7");
        int one = 10;
        int two = 8;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");
        } else {
            System.out.println("Число " + three + " большее");
        }

    }
}