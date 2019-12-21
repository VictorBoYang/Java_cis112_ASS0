package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        float[] player_score = new float[4];
//        String[] player_name = new String[4];
        int array_size = 4;
        Player[] Player_list = new Player[array_size];
        int n = 0;

        for (int i = 0;i < array_size;i++){
            Player player = new Player();
            float score = 0;
            Scanner keyboard = new Scanner(System.in);

            System.out.printf("Please enter the name of runner #%d: ",(n+1));
            String name = keyboard.nextLine();
            do{
                System.out.printf("Please enter %s's finish time (in minutes): ",(name));
                String string_score = keyboard.nextLine();
                score = Float.parseFloat(string_score);
            }while(score <= 0);
            player.setName(name);
            player.setScore(score);
            Player_list[i] = player;
            n = n + 1;
        }

        for(int j = 0;j < Player_list.length-1;j++){
            for(int i = 0; i < Player_list.length-1;i++){
                if(Player_list[i].getScore() > Player_list[i+1].getScore()) {
                    Player temp_player = Player_list[i];
                    Player_list[i] = Player_list[i+1];
                    Player_list[i+1] = temp_player;
                }
            }
        }

        String[] place_list = {"Gold Medal Winner: ","Silver Medal Winner: ","Bronze Medal Winner: "};
        for(int i = 0;i < 3;i++){
            String result = String.format("%s %s",place_list[i],Player_list[i].getName());
            System.out.println(result);
        }
    }
}

