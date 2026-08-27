class learning {
    public static void main(String[] args) {
        double unit = 1200;
        if(unit>=1000){
            double result = 500+ (unit - 1000)*5 ;
            double surcharge = result + 0.1*result;
            System.out.println("bill = " + surcharge);
        }
        else if (unit>=200 && unit<1000){
            double billprice = 500 + (unit - 200)*5;
           System.out.println(billprice);
    }
       else if(unit>=100&& unit<200){
        double amount = 200 + (unit - 100)*3;
        System.out.println(amount);
       }
       else
        System.out.println((100 - unit) *2);
}
}