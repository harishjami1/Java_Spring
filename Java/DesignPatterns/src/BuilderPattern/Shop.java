package BuilderPattern;

public class Shop {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setram(8).setscr_size(16).setprocessor("Qualcomm").get_phone();
        System.out.println(phone.toString());
    }
}
