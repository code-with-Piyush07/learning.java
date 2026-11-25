/*class Human{
   private int age ;
     private String name;
     public int getage(){
        return age;
     }
     public void setage(int a){
        age = a;
     }
     public Human(){
     age = 12;
     name = "john";

     }
     public Human(int a,String n){
      age = a;
      name = n;
     }
     public String getname(){
        return name;
     }
     public void setname(String n){
        name = n;
     }

}
public class learning{
    public static void main(String[] args) {
        
    
    Human obj = new Human();
    Human obj1 = new Human(18,"piyush");
    System.out.println(obj1.getname() + ":" + obj1.getage());
    System.out.println(obj.getname() +":" + obj.getage());
   
    
     
    

}
}*/
class A{
   public void show(){
      System.out.println("in classs");
   }
} 
public class learning{
   public static void main(String[] args) {
      //A neww = new A();
      //neww.show();
    new A().show();
   }
}