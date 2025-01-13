
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Collections;
// import java.util.Comparator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashMap;



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
//     
//         //deparment into index 3
//         //rating into index 4
        
//         //return array, each index is each value of a person
//             return;
//         }










    public static void main (String []args){
            String fileName = "data.csv";


 ArrayList<String> NameList;
ArrayList<Integer> AgeList;
 ArrayList<Double> performanceList;
 ArrayList<String> depoartmentList;

 NameList = new ArrayList<>();
 AgeList = new ArrayList<>();  
performanceList = new ArrayList<>();     
depoartmentList = new ArrayList<>(); 

ArrayList<Integer> HighestAge;
 ArrayList<Double> HighestPerformance;

                try(BufferedReader  reader = new BufferedReader (new FileReader(fileName))){
                    String list;
                    StringBuilder displayList = new StringBuilder();
                    while((list=reader.readLine())!=null){
                        System.out.println(" processing is complete"+list);
                        displayList.append(list+",");
                    }
                    
                    String [] userList = displayList.toString().split(",");

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
                        performanceList.add(Double.parseDouble(userList[i]));
                        ++i;
                        depoartmentList.add(userList[i]);

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
//
String writeToFile="example.txt";
String deparmentName=null;
try(BufferedWriter writer = new BufferedWriter(new FileWriter(writeToFile))) {

    writer.write("the deparment" + deparmentName+"general statistics");





}catch(IOException e){
 e.printStackTrace();
}

//fix file output




//use multithreading to write to multiples files at the same time 

// files should each contain top performers , 
//percetaage  of emplyees in each deparment
//sync emplyee count in each deparment


            System.out.println("hi");
    }
    
}
