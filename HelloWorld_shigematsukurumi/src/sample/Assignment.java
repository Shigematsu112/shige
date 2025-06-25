package sample;

public class Assignment {

    public static void main(String[] args) {
        // 【1〜4】変数の宣言・初期化・代入・出力
        byte byteVar = 0;
        short shortVar = 0;
        int intVar = 0;
        long longVar = 0L;
        float floatVar = 0.0f;
        double doubleVar = 0.0;
        char charVar = '\u0000';
        String stringVar = null;
        boolean booleanVar = false;
        byteVar =10;//代入
        shortVar=100;//代入
        intVar=1000;//代入
        longVar=10000;//代入
        doubleVar=10.5;//代入
        charVar='a';//代入
        stringVar="ハロー";//代入
        booleanVar=true;//代入
        
        
        System.out.println(byteVar + shortVar + intVar + longVar);      // 11110
        System.out.println(byteVar + shortVar + intVar + longVar);      // 11110
        System.out.println(floatVar + doubleVar);                       // 20.0 
        System.out.println(floatVar + doubleVar);                       // 20.0
        System.out.println(charVar);                                    // a
        System.out.println(stringVar);                                  // ハロー
        System.out.println(booleanVar);                                 // true
        System.out.println(charVar);                                    // a
        System.out.println(stringVar);                                  // ハロー
        System.out.println(booleanVar);                                 // true
        System.out.println(byteVar + shortVar + intVar + longVar + 20); // 11130
        System.out.println(byteVar + shortVar + intVar + longVar + 20); // 11130
        System.out.println((long)byteVar * shortVar * intVar * longVar); // 10000000000
        System.out.println((long)byteVar * shortVar * intVar * longVar); // 10000000000
        System.out.println(doubleVar / 100);                             // 0.105
        System.out.println(doubleVar / 100);                             // 0.105
        System.out.println(byteVar - shortVar);                          // -90
        System.out.println(byteVar - shortVar);                          // -90

        // 【5】ハローJAVA43
        int num = 20;
        int num1 = 23;
        System.out.println("ハローJAVA" + (num + num1));

        // 【6〜7】自己紹介 & BMI
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        // 【8】再代入バージョン
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";
        bmi = weight / ((height / 100) * (height / 100));
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        // 【9】自己代入して加算
        age += age;       // → 48
        height += height; // → 337.0
        weight += weight; // → 128.4
        bmi = weight / ((height / 100) * (height / 100));
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        
        age = 24;
        height = 168.5;
        weight = 64.2;
        bmi = weight / ((height / 100) * (height / 100));

        // 【10】25歳以上かどうか（ifなし）
        System.out.println(age >= 25);      // false（正しい）

        // 【11】年齢・身長・体重を文字列に変換し連結
        String result = String.valueOf(age) + String.valueOf(height) + String.valueOf(weight);
        System.out.println(result);

        // 【12】年齢・身長を整数に変換
        String ageStr = "48";
        String heightStr = "337";
        int ageInt = Integer.parseInt(ageStr);
        int heightInt = Integer.parseInt(heightStr);
        System.out.println(ageInt);
        System.out.println(heightInt);

        // 【13】年齢が25以上 または 身長が160以上
        System.out.println(ageInt >= 25 || heightInt >= 160);
    }
}
