package observer.observerpattern;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord){
        this.scoreRecord = scoreRecord;
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
