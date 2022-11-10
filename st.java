class student{
    String name;
    String age;
    public void print(){
        System.out.println("string name");
    }
    public void prints(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(student s2){
       this.name=s2.name;
       this.age=s2.age;
    }
    student()
    {

    }
}
public class st {
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="adinath";
        s1.age="male";
        student s2=new student(s1);
        s2.prints();
    }
    
}
