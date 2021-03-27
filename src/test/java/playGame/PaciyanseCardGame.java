package playGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaciyanseCardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the game!\nEnter the amount of players to begin: ");
        int playerNum = input.nextInt();
        String[] spades = {"1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", "AS"};
        String[] hearts = {"1H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AH"};
        String[] diamonds = {"1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AD"};
        String[] clubs = {"1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AC"};
        List<String> deck = new ArrayList<String>();
    }
    }
