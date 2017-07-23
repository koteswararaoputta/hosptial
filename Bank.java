class sbi
{
void bankOfIntrest()
{
System.out.println("sbi bank of intrest 10%");
}
}
class Andhra extends sbi
{
void bankOfIntrest()
{
//super. bankOfIntrest();
System.out.println("Andhra bank of intrest 20%");
}
}
class icic extends Andhra
{
void bankOfIntrest()
{
//super. bankOfIntrest();
System.out.println("icic bank of intrest 30%");
}
}
class Bank
{
public static void main(String args[])
{


/*icic c = new icic();
c.bankOfIntrest();
Andhra a = new Andhra();
a.bankOfIntrest();
sbi i = new sbi();
i.bankOfIntrest();*/

sbi obj;
obj=new sbi();
obj.bankOfIntrest();
obj=new Andhra();
obj.bankOfIntrest();
obj=new icic();
obj.bankOfIntrest();
}
}
