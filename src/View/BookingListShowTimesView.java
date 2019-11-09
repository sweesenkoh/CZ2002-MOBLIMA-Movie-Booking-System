package View;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Showtime;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingListShowTimesView extends View {

    private ArrayList<Showtime> showTimes;
    private ArrayList<String> options = new ArrayList<>();


    private String title = "Show Time List for Movie: ";
    private String viewContent = "Here are the ShowTimes";


    public BookingListShowTimesView(ArrayList<Showtime> showTimes){
        this.showTimes = showTimes;
        this.title += this.showTimes.get(0).getMovie().getTitle();
    }

    @Override
    public void activate() {

        super.setTitle(this.title);
        super.setViewContent(this.viewContent);
        super.activate();

        int userInput = IOManager.printMultipageOptionsWithReturnedChoice(this.showTimes,5);
        processUserInput(userInput);
    }
    @Override
    protected void processUserInput(int input) {

        if (input == -1){
            ViewNavigator.popView();
        }else{
            ViewNavigator.pushView(new BookingSeatSelectionView(this.showTimes.get(input - 1)));
        }

    }
}
