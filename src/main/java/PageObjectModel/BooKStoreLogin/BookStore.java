package PageObjectModel.BooKStoreLogin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookStore {

    public static void main(String[] args) {
        System.out.println("created");

        String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        System.out.println(TimeStamp);
    }
}
