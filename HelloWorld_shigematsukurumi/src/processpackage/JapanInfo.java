package processpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JapanInfo {
    private String greeting;
    private String sushiComment;
    private String sushiType;
    private String currentDateTime;

    public JapanInfo() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiComment = "この寿司はうまい";
        this.sushiType = "寿司は和食です";

        // 現在日時の取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.currentDateTime = "今の現在日時は" + now.format(formatter) + "です";
    }

    public void displayInfo() {
        System.out.println(this.greeting);
        System.out.println(this.sushiComment);
        System.out.println(this.sushiType);
        System.out.println(this.currentDateTime);
    }
}
