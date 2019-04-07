package pack1;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal obj=new Animal();
System.out.println(obj.age+" "+obj.breed+" "+obj.name+" "+obj.weight);
System.out.println(obj.canBark()+" "+obj.isWild());



Animal obj1=new Animal();
obj1.name="Sharik";
System.out.println(obj.age+" "+obj.breed+" "+obj.name+" "+obj.weight);
System.out.println(obj1.canBark()+" "+obj1.isWild());


Animal obj2=new Animal();
System.out.println(obj.age+" "+obj.breed+" "+obj.name+" "+obj.weight);
System.out.println(obj2.canBark()+" "+obj2.isWild());


	}

}
