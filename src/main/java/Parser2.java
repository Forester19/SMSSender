import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 15.11.2018.
 */
public class Parser2 {
    public ArrayList<String> readFile(){
        ArrayList<String> listOfStrings= new ArrayList<String>();
        try {
            File file = new File("e.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                listOfStrings.add(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStrings;
    }

    public ArrayList<String> separateString(ArrayList<String> list){
        ArrayList<String> newlist = new ArrayList<String>();
        for(int i=0; i<list.size(); i++){
            String h = list.get(i).replaceAll(" ", "").replaceAll("\\(","").replaceAll("\\)","")
                    .replaceAll("\\+","").replaceAll("  ","");
            newlist.add(h);
        }
        ArrayList<String> resList = new ArrayList<String>();
        for(int i=0; i<newlist.size(); i++){
        if(!newlist.get(i).contains("380")){
            String res = "38" + newlist.get(i);
            resList.add(res);
        }
        }
        return resList;
    }
}
