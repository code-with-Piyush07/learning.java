//calculator
public class learning{
    public static void main(String[] args) {
        double a = 8;
        double b = 9;
        char c = '+';
        double result = 0;
    switch(c){
        case '+' :
            result= a+b;
            System.out.println(result);
            break;
        case '-':
            result = a-b;
            System.out.println(result);
            break;
        case '*' :
            result= a*b;
            System.out.println(result);
            break;
        case '%' : 
        {if(a!=0&&b!=0)
            {result= a%b;
            System.out.println(result);}
            else
                System.out.println("enter valid");}
            break;
       case('/') :{
        if(a!=0&&b!=0)
            {result= a/b;
            System.out.println(result);}
        else
                System.out.println("enter valid");}
            break;
    }
       
      String str = result>0 ? "positive" : "negative" ;
      System.out.println(str);
}
    
    }
