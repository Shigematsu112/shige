package javapackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javapackage {
    private String greeting;
    private String taste;
    private String category;
    private String currentDateTime;

    // コンストラクタでthisを使ってフィールドに代入
    public SushiInfo(String greeting, String taste, String category) {
        this.greeting = greeting;
        this.taste = taste;
        this.category = category;
        this.currentDateTime = getNowDateTime();
    }

    // 現在日時を取得
    private String getNowDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return now.format(fmt);
    }

    // 出力メソッド
    public void printInfo() {
