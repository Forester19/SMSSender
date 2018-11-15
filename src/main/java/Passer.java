import java.io.*;
import java.util.ArrayList;


public class Passer {
    public ArrayList<String> readFile(){
        ArrayList<String> listOfStrings= new ArrayList<String>();
        try {
            File file = new File("k.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            System.out.println(line == null);
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

    public ArrayList<String> splitStrings(ArrayList<String> string){
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<string.size(); i++){
            String[] ii =  string.get(i).split(",");
            for(int j = 0; j<ii.length; j++){
                list.add(ii[j]);
            }
        }
        return list;
    }
}
