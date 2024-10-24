import java.util.ArrayList;
import java.util.Scanner;

public class TvSeries {
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating;

    public TvSeries() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Vad heter tv serien?");
        name = myScan.nextLine();
    }

    public TvSeries(String InName) {
        name = InName;
    }

    public void changeRating(int newRating) {
        rating = newRating;
    }

    public void addEpisode(int numOfEpisode, int season) {
        if (season > episodes.size()) {
            for (int i = 0; i < season - 1; i++) {
                episodes.add(0);
            }
        }
        episodes.add(season - 1, numOfEpisode);
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Rating: " + rating);
    }
}
