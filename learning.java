/*number guessing without scanner



class learning{
    public static void main(String[] args) {
        int secret= 33;
        
        int i = 1;
        while(i<=7){
            int guess = 98;
            if(guess>secret){
            System.out.println("attempt "+ i +"TOO HIGH" );
        break;}
        
        else if(guess<secret){
            System.out.println("attempt" + i+ "TOO LOW");
        break;}
        else
            System.out.println("correct" +i + "in attempt");
          i++;
 
        } 
    }
}*/
class learning{
    public static void main(String[] args) {
        String str = "menu";
        int i=1;
        
        do{
            System.out.println("1.burger $2");
            System.out.println("2.pizza $3");
            System.out.println("3.sandwhich $1");
            System.out.println("4.exit");
        i++;}while(i<=1);
        int n=1;
        switch(n){
            case 1:
                {System.out.println("burger quantity?"); 
                int j =2;
                int amt1 = 2*j;
                System.out.println( "amt = " + (amt1) +"$");
                  String result = amt1>=300?"large order":"small order";
                  System.out.println(result);
                break;}
            case 2:
                {System.out.println("pizza");
                int k = 5;
                int amt = (3*k);
                System.out.println("amt = "+ amt + "$");
                 String result1 = amt>=300?"large order":"small order";
                 System.out.println(result1);
                break;}
            case 3:
                {System.out.println("sandwhich");
                int k = 1;
                int amt2= k*1;
                System.out.println( "amt = " + (amt2) +"$");
                String result2 = amt2>=300?"large order":"small order";
                System.out.println(result2);
                break;}
            case 4:
                System.out.println("thankyou");
                break;
                default:
                System.out.println("enter valid");
        }
    }
}