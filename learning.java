// number analyser
 public class learning{
  public static void main(String[] args) {
    int n = 556;
    if(n>0){
        if(n%2==0)
            System.out.println("positive " + " even &");
        else 
            System.out.println("positive" + " odd & ");
    }
    else if(n==0)
        System.out.println("zero");
    else
        System.out.println("negative");
     String result = n%5==0?"divisible by 5 " : "not divisible by 5";
     System.out.println(result);

  }
}