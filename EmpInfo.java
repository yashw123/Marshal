class Employee
{
int id;
String name;

void setdata()
{

id=101;
name="Yash";
}

void display()
{
System.out.println("ID Is"+" "+id);
System.out.println("Name  Is"+" "+name);
}

}

class EmpInfo
{
public static void  main(String args[])
{
Employee e= new Employee();
e.setdata();
e.display();
}

}