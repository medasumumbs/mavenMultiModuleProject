import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple","Iphone 3G", BigDecimal.valueOf(10000));
        System.out.println(phone);
        phone = new Phone("Appol","Iphone X", BigDecimal.valueOf(140000));
    }
}
