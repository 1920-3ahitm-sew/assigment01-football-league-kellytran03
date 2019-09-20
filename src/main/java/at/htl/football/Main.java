package at.htl.football;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filename = "bundesliga-1819.csv";

        String line;

        League league = new League();

        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            scanner.nextLine();


            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] parts = line.split(";");

                int date = Integer.parseInt(parts[0]);
                String homeTeam = parts[1];
                String guestTeam = parts[2];
                int homeGoals = Integer.parseInt(parts[3]);
                int guestGoals = Integer.parseInt(parts[4]);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


        public static void printTable(List<Team> teams) {

        }
    }
}
