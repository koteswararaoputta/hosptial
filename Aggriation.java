class Adress
{
 int doorNo;
 String streetName;
 String cityName;

Adress(int doorNo,String streetName,String cityName)
{
this.doorNo=doorNo;
this.streetName=streetName;
this,cityName=cityName;
}
}

class Employee
{
int id;
String name;
Adress add;
Employee(int id,String name,Adress add)
{
this.id=id;
this.name=name;
this.add=add;

}
void getData()
{
System.out.println("Employe id is"+id);
System.out.println("Employe name is"+name);
System.out.println("Employee adress deatils"+add.doorNo+"   "+add.streetName+"   "+add.cityName);
}
}

class Aggriation
{
public static void main(String args[])
{
Adress a = new Adress(234,"sr nagar","hyd");
//a.getData();
Employee e =  new Employee(101,"xyz",a);
e.getData();

}
}
