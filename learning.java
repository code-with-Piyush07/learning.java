 /*class music
{
public void playmusic(){
System.out.println("playing music...");

}
public String getapen(int n){
    if(n<10)
    return "pen";
else 
    return "nothing";
}}



public class learning{
public static void main(String[] args) {
    music calc = new music();
     calc.playmusic();
     music obj = new music();
     String str = obj.getapen(10);
     System.out.println(str);
}
}*/
class calculate{
public int add(int n ,int m ,int p){
    int r = n+m+p;
    return r;

}
public double add (double x,double y){
double e = x+y;
return e;
}}
public class learning{
    public static void main(String[] args) {
        calculate calc = new calculate();
        calc.add(4,7);
       double result = calc.add(4,7);
       System.out.println(result);
    }
}

