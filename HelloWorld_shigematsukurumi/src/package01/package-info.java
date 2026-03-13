package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageCreator {

    private String msg1;
    private String msg2;
    private String msg3;
    private String nowDateTime;

    public MessageCreator() {
        this.msg1 = "こんにちは！ここは日本です！";
        this.msg2 = "この寿司はうまい";
        this.msg3 = "寿司は和食です";

        // 今日の日時を取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.nowDateTime = now.format(fmt);
    }

    public void printMessages() {
        System.out.println(this.msg1);
        System.out.println(this.msg2);
        System.out.println(this.msg3);
        System.out.println("今の現在日時は" + this.nowDateTime + "です");
    }
}
package package01;

import logic.MessageCreator;

public class Main {
    public static void main(String[] args) {
        MessageCreator mc = new MessageCreator();
        mc.printMessages();
    }
}
