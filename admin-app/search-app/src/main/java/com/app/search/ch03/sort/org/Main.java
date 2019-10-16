package com.app.search.ch03.sort.org;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();

        FootballPlayer fp = player;

        BasketballPlayer bp = player;

        doAction(player);
        //---------------------------------
        Object myPlayer = new Player();
        FootballPlayer myFp = (FootballPlayer) myPlayer;
        //doAction(myPlayer);
        doAction(myFp);
    }

    private static void doAction(FootballPlayer footballPlayer){
        footballPlayer.playFootball();
    }

}
