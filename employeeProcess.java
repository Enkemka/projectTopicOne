
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.io.BufferedReader;
public class employeeProcess {



// public static String[] processDataxlxs(String line){

    
//     //process name into index 1


//     //precess age into index 2


//     //years with comapny into index 3


//     //deparment into index 4


//     //rating into index 5


    
//     //return array, each index is each value of a person
//         return;
//     }



//     public static String[] processDataJson(String line){

//         //process name into index 1
//         //precess age into index 2
//         //years with comapny into index 3
//         //deparment into index 4
//         //rating into index 5
        
//         //return array, each index is each value of a person
//             return;
//         }











    public static void main (String []args){
            String fileName = "data.csv";

                try(BufferedReader  reader = new BufferedReader (new FileReader(fileName))){
                    String list;
                    
                    while((list=reader.readLine())!=null){
                        System.out.println(" processing is complete");
                    }
                    String [] userList = list.split(",");

                    ArrayList<String> NameList = new ArrayList<>();
                    ArrayList<Integer > AgeList = new ArrayList<>();  
                    ArrayList<Double> performanceList = new ArrayList<>();     
                    ArrayList<String> depoartmentList = new ArrayList<>();  


                    for(int i = 0; i < userList.length; i++){
                        NameList.add(userList[i]);
                        ++i;
                        AgeList.add(Integer.parseInt(userList[i]));
                        ++i;
                        performanceList.add(Double.parseDouble(userList[i]));
                        ++i;
                        depoartmentList.add(userList[i]);
                    }
                }catch(IOException e){
                    e.printStackTrace(); 
                }



            System.out.println("hi");
    }
    
}
