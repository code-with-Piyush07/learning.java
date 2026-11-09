/*
   public class learning{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("piyush");
        sb.append("Kumar");
        sb.deleteCharAt(2);
        sb.insert(10,"java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}*/
 class mobile{
    String name;
    int price;
    static String brand;
    public void show(){
        System.out.println(name + ":" +price +":"+brand);

    }
    public static  void show1(mobile obj){
        System.out.println(obj.name + ":" +obj.price +":"+brand);
    }
}

class learning{
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.name = "apple";
        obj1.price = 1500;
        mobile.brand = "smartphone";
        mobile obj2 = new mobile();
        obj2.name = "samsung";
        obj2.price = 1700;
        mobile.brand = "s";
        obj1.show();
        obj2.show();
        mobile.show1(obj1);


    }
}