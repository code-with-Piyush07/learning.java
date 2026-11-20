class Human{
   private int age ;
     private String name;
     public int getage(){
        return age;
     }
     public void setage(int a){
        age = a;
     }
     public Human(){
      System.out.println("in constructor");

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
    System.out.println(obj.getname() +":" + obj.getage());
    obj.setage(30);
    
    obj.setname("piyush");
    

}
}