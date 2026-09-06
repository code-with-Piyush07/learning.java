class students{
    int rollno ;
    String name;
    int marks;


}
class learning{
    public static void main(String[] args) {
        students s1 = new students();
        s1.rollno =4;
        s1.name = "Piyush";
        s1.marks = 90;

        students s2 = new students();
        s2.rollno= 5;
        s2.name = "god";
        s2.marks = 100;

       students student[]= new students[2];
       student [0]= s1;
       student[1]= s2;

       for(int i = 0;i<student.length;i++){
        System.out.println(student[i].name + ":" + student[i].marks);

       }
    }
}