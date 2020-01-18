package observer.datasheetexample;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

    private List<Integer> scores;
    private DataSheetView dataSheetView;

    public void setDataSheetView(DataSheetView dataSheetView){
        this.dataSheetView = dataSheetView;
    }

    public void addScore(int score){
        if(scores == null)
            scores = new ArrayList<>();

        scores.add(score);
        dataSheetView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }

}
