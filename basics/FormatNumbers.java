import java.text.NumberFormat;

public class FormatNumbers {
    
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);


        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);


        // method chaining
        String result3 = NumberFormat.getCurrencyInstance().format(100);
        System.out.println(result3);

    }

}
