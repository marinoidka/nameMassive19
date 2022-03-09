import java.util.Arrays;

import pro.learnup.javaqa.group2.chernykh2.Addition;

import java.util.Arrays;

public class lightGame {

    public static boolean isGreenLight = false;

    public static void main(String[] args) {


            int[] speeds = {0, 6, 9};

            String[] inputData = { "Nick 12", "Leo 6", "Alex 10" };


            if (isGreenLight == false) {

                System.out.println("Количество выбывших игроков: " + Addition.droppedOut(speeds));
                System.out.println("Скорость выбывших игроков: " + Arrays.toString(Addition.speedDroppedOut(speeds)));
                System.out.println("Скорость не выбывших игроков: " + Arrays.toString(Addition.speedStayedIn(speeds)));
                System.out.println("Имена выживших игроков: " + Arrays.toString(Addition.survivors(inputData)));
            }

            else {
                System.out.println("Все игроки проходят дальше");
            }
    }
}