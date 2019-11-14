package View;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Showtime;

import java.util.ArrayList;

public class MovieGoerBookingListShowTimesView extends View {

    private ArrayList<Showtime> showTimes;
    private ArrayList<String> options = new ArrayList<>();


    private String title = "Showtime List for Movie: ";
    private String viewContent = "Here are the ShowTimes";


    public MovieGoerBookingListShowTimesView(ArrayList<Showtime> showTimes){
        this.showTimes = showTimes;
        if (this.showTimes.size() != 0){
            this.title += this.showTimes.get(0).getMovie().getTitle();
        }
    }


    @Override
    public void activate() {

        super.setTitle(this.title);
        super.setViewContent(this.viewContent);
        super.activate();

        int userInput = IOManager.printMultipageOptionsWithReturnedChoice(this.showTimes,5);
        processUserInput(userInput);
    }

    /**
     * This method helps to manage execution of code based on the user put choice on the View options.
     * @param input the index of the options
     */
    @Override
    protected void processUserInput(int input) {

        if (input == -1){
            ViewNavigator.popView();
        }else{
            ViewNavigator.pushView(new MovieGoerBookingSeatSelectionView(this.showTimes.get(input - 1)));
        }

    }
}
