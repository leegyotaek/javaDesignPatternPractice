package observer.minmaxexample;

import observer.datasheetexample.DataSheetView;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

    private List<Integer> scores;
    private MinMaxView minMaxView;

    public void setMinMaxView(MinMaxView minMaxView){
        this.minMaxView = minMaxView;
    }

    public void addScore(int score){
        if(scores == null)
            scores = new ArrayList<>();

        scores.add(score);
        minMaxView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }

}
