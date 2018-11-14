public class Main {
    public static void main(String[] args) {
        SMSSender sd = new SMSSender("Forester21","Forester2121","utf-8", true);
        sd.sendSms("380734718501","Люблю тебя, сладкая моя))))" ,1, "", "", 0, "", "");
        sd.getSmsCost("380734718501", "blablabla", 0, 0, "", "");
        sd.getBalance();
        sd.sendSms("380734718501","Люблю тебя, сладкая моя))))" ,1, "", "", 0, "", "");
        sd.getSmsCost("380734718501", "blablabla", 0, 0, "", "");
        sd.getBalance();






    }
}
