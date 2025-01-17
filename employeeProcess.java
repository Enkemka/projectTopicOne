
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Collections;
// import java.util.Comparator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class employeeProcess {









//     public static String[] processDataJson(String line){

//         //process name into index 1
//         //precess age into index 2
//     
//         //deparment into index 3
//         //rating into index 4
        
//         //return array, each index is each value of a person
//             return;
//         }










    public static void main (String []args){
            String fileName = "data.csv";


 ArrayList<String> NameList = new ArrayList<>();
ArrayList<Integer> AgeList = new ArrayList<>(); 
 ArrayList<Double> performanceList = new ArrayList<>(); 
 ArrayList<String> depoartmentList = new ArrayList<>();

 
 
   
depoartmentList = new ArrayList<>(); 
String [] userList;
ArrayList<Integer> HighestAge= new ArrayList<>();
;
 ArrayList<Double> HighestPerformance= new ArrayList<>();
 ;

                try(BufferedReader  reader = new BufferedReader (new FileReader(fileName))){
                    String list;
                    StringBuilder displayList = new StringBuilder();
                    while((list=reader.readLine())!=null){
                        System.out.println(" processing is complete"+list);
                        displayList.append(list+",");
                    }
                    
                     userList = displayList.toString().split(",");

                   for (String i : userList) {
                    System.out.println(i);
                   }

                      


                    

//add value to hash map for deparment
//if the deparment is alreadt in the has map icrease by 1 
                   

                    for(int i = 0; i < userList.length; i++){
                        NameList.add(userList[i]);
                        ++i;
                        AgeList.add(Integer.parseInt(userList[i]));
                        ++i;
                        depoartmentList.add(userList[i]);
                        ++i;
                        performanceList.add(Double.parseDouble(userList[i]));

                    } 
                    HighestAge=new ArrayList<>(AgeList);
                    Collections.sort(HighestAge);
                    HighestPerformance= new ArrayList<>(performanceList);
                    Collections.sort(HighestPerformance);

                }catch(IOException e){
                    e.printStackTrace(); 
                }



                HashMap<String,Integer> map = new HashMap<>();

                map.put("HR", 0);
                map.put("Finance", 0);
                map.put("Engineering", 0);
                map.put("Marketing", 0);

        

                for(String i:depoartmentList){
                    if(map.containsKey(i)){
                        map.put(i,map.get(i)+1);  
                    }
                }

String writeToFile="example.txt";

try(BufferedWriter writer = new BufferedWriter(new FileWriter(writeToFile))) {

    writer.write("the deparment general statistics");

    writer.write("we have a total of" + HighestAge.size()+" people working here");
    
    writer.write("highest socres are " +HighestPerformance.toString());

    writer.write("highest agesss"+HighestAge.toString());

    ExecutorService executorService = ExecutorService.newFixedThreadPool(//map size);

for(Integer values :map.values()){

    Runnable task = new thread(//string, map);
    


}



}catch(IOException e){
 e.printStackTrace();
}


//deparment percentages

//all 3 done simultaniously and attached to its own file with thread pooling



            System.out.println("hi");
    }
    
}
