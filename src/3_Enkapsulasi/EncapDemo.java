package encapdemo;

public class EncapDemo {

     private String name;
     private int age=20;
     
     public String getName(){
         return name;   
     }
     
     public void setName(String newName){
         name = newName;
     }
     
     public int getAge(){
         return age=age;
     }
     
     public void setAge(int newAge){
         if(newAge > 30){
             age = 30;
         }
         else{
            age = newAge;
         }
     }
    }
