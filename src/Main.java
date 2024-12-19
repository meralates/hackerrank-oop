import java.util.*;
//https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
abstract class Book {//soyut sınıf
    String title;

    abstract void setTitle(String s);//türeyen sınıflar bunu kullanmak zorunda
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);

        System.out.println("The title is: " + new_novel.getTitle());

        sc.close();
    }
}
