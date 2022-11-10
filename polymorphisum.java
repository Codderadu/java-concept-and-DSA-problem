    class student{
        String name;
        int age;
        String gender;
     public static void printinfo(String name) {
            System.out.println(name);
            
        }
      public static void printinfo(int age) {
            System.out.println(age);
            
        }
      public static void printinfo(String name,int age,String gender) {
            System.out.println(name+" "+age+" "+gender);
            
        }
    
    }
    public class polymorphisum {
        public static void main(String args[]){
        student s1=new student();
        s1.name="adinath";
        s1.age=25;
        s1.gender="male";
        s1.printinfo(s1.age);
        }
        
    }
    

