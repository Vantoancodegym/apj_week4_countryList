import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountryList {

    public static void main(String[] args) {
        File soureFile=new File("countryList.txt");
        BufferedReader reader;
        try {
            reader=new BufferedReader(new FileReader(soureFile));
            String line=null;
            while ((line=reader.readLine())!=null){
                String[] splitString=line.split("\"");
                for (int i = 0; i < splitString.length; i++) {
                    if (!splitString[i].equals(","))
                    System.out.print(splitString[i]+"\t");
                }
                System.out.print("\n");

            }
        }catch (IOException e){
            System.out.println(e);
        }

    }

}