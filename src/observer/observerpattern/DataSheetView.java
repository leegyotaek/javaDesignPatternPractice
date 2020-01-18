package observer.observerpattern;

import java.util.List;

public class DataSheetView implements Observer{
    private int viewCount;
    private ScoreRecord scoreRecord;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount){
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update(){
        List<Integer> list = scoreRecord.getScoreRecord();
        System.out.println("dataSheetView update was called");
        System.out.println("===============================");
        list.stream().limit(viewCount).forEach(integer -> {
            System.out.println(integer);
        });
        System.out.println("===============================");
    }
}
