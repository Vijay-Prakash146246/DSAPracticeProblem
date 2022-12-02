package Array.ArraysInJava;
class Student
{
    int roll;
    String name;

    public Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
}
public class Q2ArraysOfObjects
{
    public  static  void  main(String[]args)
    {
        Student[]arr = new Student[5];
        arr[0]=new Student(1,"niraj");
        arr[1]=new Student(2,"Vijay");
        arr[2]=new Student(3,"Sonu");
        arr[3]=new Student(4,"Monu");
        arr[4]=new Student(5,"Amit");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Element at index "+i+" : "+arr[i].roll+"  "+arr[i].name);
        }

    }
}
