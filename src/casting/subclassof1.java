package casting;
public class subclassof1 extends downcasting
{
public void job()
{
	System.out.println("subclaSS OF OWN METHOD");
}
public void farm()
{
	System.out.println("subclass of two farm");
}
public void money()
{
	System.out.println("return to super class");
}
	public static void main(String[] args) 
	{
		System.out.println("--upcasting perform--");
		//upcasting perform[sub cls mdhun tya proerty return krto]
		downcasting obj=new subclassof1();//upcasting perform
		obj.car();
		obj.money();//update the same method prperty will excute
		obj.farm();
		System.out.println("-sigle inheritance-");
		subclassof1 sub=new subclassof1();//call the all method of sub supercls
		sub.job();
		sub.money();
		sub.car();
		sub.farm(23,20);
		
	System.out.println("-downcasting perform--");
		//perform downcating
		//syn-subclassname objname=(subclassname)objofupcasting;
		subclassof1 p=(subclassof1)obj;
		p.car();//sperclass chi property return krn
		p.farm();//update vali property sudha superclass return krel
		p.job();//subclass chi  property asel
		p.money();
		
	}

}
