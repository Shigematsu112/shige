package curriculum_New_question;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class curriculum_New_22 {

    // フィールド
    private String place;
    private String food;
    private String category;

    // ★ 正しいコンストラクタ（void を付けない & クラス名と同じ）
    public curriculum_New_22(String place, String food, String category) {
        this.place = place;
        this.food = food;
        this.category = category;
    }

    // メッセージを作るメソッド
    public void printMessages() {

        System.out.println("こんにちは！ここは" + this.place + "です！");
        System.out.println("この" + this.food + "はうまい");
        System.out.println(this.food + "は" + this.category + "です");

        // 今日の日時を取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("今の現在日時は" + now.format(fmt) + "です");
    }
}


