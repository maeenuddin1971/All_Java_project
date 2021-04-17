package forhad_sir_lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Forhad_sir_lab {
    
    
    
    
    static int commonInt=3;
//to store a list of queued process
Map<String, Integer> waitingMAp=new LinkedHashMap<>();
List<Integer>waitingTimeList=new ArrayList<>();
//to Store elapsed time.
int timepassed=0;









public  void mainL(){
    //input process name and time in order.
    waitingMAp.put("p0", 3);
    waitingMAp.put("p1", 3);
    waitingMAp.put("p2", 3);
    waitingMAp.put("p3", 9);
    //first time getting the list of process.
    List<String>process=new ArrayList<>();
    //it will call recursively till no process is waiting.
    while(!waitingMAp.isEmpty()){
        process.addAll(this.getRoundRobin(waitingMAp));
    }
    System.out.print(process);
    System.out.println();
    System.out.print(waitingTimeList);
}










    public List<String> getRoundRobin(Map<String, Integer> 
    processMap){
    Map<String, Integer> Local=new LinkedHashMap<>();
    Local.putAll(processMap);
    waitingMAp.clear();
    List <String>curr=new ArrayList<>();
    for(Map.Entry<String, Integer> entry :Local.entrySet()){
        curr.add(entry.getKey());

   waitingTimeList.add(entry.getValue()>3?timepassed=timepassed+3:     (timepassed=timepassed+entry.getValue()));

        if(entry.getValue()>commonInt){
            waitingMAp.put(entry.getKey(),entry.getValue()-commonInt);
        }
        }

    return curr;

    }
    
    

  
    public static void main(String[] args) {
       Forhad_sir_lab h=new Forhad_sir_lab();
       h.mainL();
    }
    
}
