package dto;

import net.socketconnection.jva.ValorantAPI;
import net.socketconnection.jva.enums.Rank;
import net.socketconnection.jva.models.player.PlayerCard;
import net.socketconnection.jva.player.ValorantPlayer;

import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ValorantAPI valorantAPI = new ValorantAPI();

        String username = " ";
        String tag = " ";

        System.out.println("What is your username?");
        username = scanner.nextLine();
        System.out.println("What is your tag?");
        tag = scanner.nextLine();


        // Pass the main instance to the player instance and fill the player with an username and tag or riot id
        ValorantPlayer valorantPlayer = new ValorantPlayer(valorantAPI).fetchData(username, tag);

        // Read out the rank using the Rank enum for example
        Rank rank = valorantPlayer.getRank();
        // Print out the rank using the getName() method
        System.out.println("Rank: " + rank.getName());

        // Read out the level
        int level = valorantPlayer.getLevel();
        // Read out the last amount of RR he got or lost
        int mmrChange = valorantPlayer.getMmrChange();

        // Get the players banner using the PlayerCard model
        PlayerCard playerCard = valorantPlayer.getPlayerCard();
        // Print out the banners url in different sizes
        System.out.println(playerCard.getSmall());
        System.out.println(playerCard.getLarge());
        System.out.println("Player Level: " + level);
        System.out.println("Last change in Ranked Rating " + mmrChange + " RR");

    }
}