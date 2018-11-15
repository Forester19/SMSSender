import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SMSSender sd = new SMSSender("Forester21","Forester2121","utf-8", true);



     /* Passer passer = new Passer();
        ArrayList<String> list = passer.splitStrings(passer.readFile());
        ArrayList<String> newlist = new ArrayList<String>();
       for (int i=0; i<list.size(); i++){
           if(list.get(i).contains("(") && list.get(i).contains(")")){
               newlist.add(list.get(i));
           }
       }

        for (int i=0; i<newlist.size(); i++){
            System.out.println(newlist.get(i));
        }
*/
//        Parser2 parser2 = new Parser2();
//        ArrayList<String> res = parser2.separateString(parser2.readFile());
//        res.add("380953102806");


            sd.sendSms("380682488330","Здравствуйте. Закупаем ДОРОГО вторсырье." ,1, "", "", 0, "", "");
            sd.getSmsCost("380682488330", "erfer", 0, 0, "", "");
            sd.getBalance();

        /*sd.sendSms("380682488330","Здравствуйте. Закупаем ДОРОГО вторсырье: макулатура, ПЕТ, пленка, металл, цветной металл, стеклобой. Подробно: +380977794832" ,1, "", "", 0, "", "");
        sd.getSmsCost("380682488330", "blablabla", 0, 0, "", "");
        sd.getBalance();
*/

    }
}
