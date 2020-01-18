package observer.minmaxexample;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinMaxView {
    private int viewCount;
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord, int viewCount){
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update(){
        List<Integer> list = scoreRecord.getScoreRecord();
        System.out.println("MinMaxView update was called");
        System.out.println("===============================");
        System.out.println("Min : " + Collections.min(list));
        System.out.println("Max : " + Collections.max(list));
        System.out.println("===============================");
    }
}
