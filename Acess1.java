package Emp;
public class A
{
public int age;
public String name;
public void data()
{
System.out.println("this is data");
}
}

package it;
import Emp.it;
public class B
{
public void data2()
{
System.out.println("this is data2");
A.age=20;
A.name="xyz";
A.data();
}

}

class Acess1
{
public static void main(String args[])
{
A a = new A();
a.A();
}
}
