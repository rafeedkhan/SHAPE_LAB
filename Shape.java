
public class Shape {
	 Shape2D is2D=new Shape2D();
	Shape3D is3D=new Shape3D();
	//static Triangle t=new Triangle();

	public double a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//t.area(1,2);
		
	}
	public void ID()
	{
		System.out.println("This is Shape Class");
	}
	public double area(double ...x)//variadic function shown
	{
		for(double y:x)
		{
			a*=y;	
		}
		return a;
	}
	double area(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	double area(double a) {
		// TODO Auto-generated method stub
		return 0;
	}
//	TRY
//	{	
//		IF(!(IS3D.GETCLASS()==SHAPE2D.CLASS))
////		{
////			THROW 1;			
////		}
//	}
//	
//	CATCH(ARITHMETICEXCEPTION X)
//	{
//		SYSTEM.OUT.PRINTLN("IS3D IS NOT AN OBJECT OF SHAPE2D");
//	}
//	//ELSE
//	//{
//		SYSTEM.OUT.PRINTLN("IS3D IS NOT AN OBJECT OF SHAPE2D");
//	//}
}

