package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GameCharacter player1 = new GameCharacter("Raiden",10,20);
        GameCharacter player2 = new GameCharacter("Sub-Zero",5,25);

        player1.kick(player2);
        player2.kick(player1);

        for (int i = 0; i < 3; i++) {
            player2.hit(player1);
        }

        for (int i = 0; i < 4; i++) {
            player1.kick(player2);
        }

        System.out.println("LIFE POINT");
        System.out.println(player1.getname() + " : " + player1.getlifePoint());
        System.out.println(player2.getname() + " : " + player2.getlifePoint());

        System.out.println();

        player1.compare(player2);
    }
}
