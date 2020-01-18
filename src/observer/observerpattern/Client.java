package observer.observerpattern;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args){

        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attatch(dataSheetView3);
        scoreRecord.attatch(dataSheetView5);
        scoreRecord.attatch(minMaxView);

        Stream.iterate(1, n->n+1).limit(5).forEach(n->{
            System.out.println("===========loop " + n + "==================");
            scoreRecord.addScore(n);
        });

    }
}
