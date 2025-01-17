import java.io.IOException;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class thread implements Runnable{
    
    private String deparmentName;
    private Map<String,Integer> myMap;

    public thread (String deparmentName, Map<String,Integer> myMap){
        this.deparmentName=deparmentName;
        this.myMap=myMap;
    }

    @Override
    public void run(){
int NumerOfEmplyees=0;
for(Integer values: myMap.values()){
    NumerOfEmplyees+=values;

}

if(myMap.containsKey(deparmentName)){
int amountInDepartment = myMap.get(deparmentName);

Double PercentInDepartment = (double)amountInDepartment / NumerOfEmplyees;

}

String Filepath=deparmentName+"Information.csv";

try(BufferedWriter writer = new BufferedWriter(new FileWriter(Filepath))){
    writer.write("");
    writer.write("");
    writer.write("");


}catch(IOException e){
e.printStackTrace();
}




    }
}
