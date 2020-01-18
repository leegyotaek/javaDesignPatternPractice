package observer.minmaxexample;

import java.util.stream.Stream;

public class Client {
    public static void main(String[] args){

        ScoreRecord scoreRecord = new ScoreRecord();
        MinMaxView minMaxView = new MinMaxView(scoreRecord, 3);
        scoreRecord.setMinMaxView(minMaxView);

        Stream.iterate(0, n->n+1).limit(5).forEach(n->{
            scoreRecord.addScore(n);
        });

    }
}
