class students{
    String name;
    int age;
    int marks;}

class learning{
    public static void main(String[] args) {
        students S1 = new students();
        S1.name = "Piyush";
        S1.age = 23;
        S1.marks = 22;
         students student[]= new students[1];
         student [0] = S1;
         System.out.println(student[0].name+":"+student[0].marks);


    }
}