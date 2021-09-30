package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassB {

	public static void main(String[] args) {

		ClassA cls = new ClassA();
		Class obj = cls.getClass();

		System.out.println("-------------CLASS----------");
		System.out.println(obj.getSimpleName());
		
		System.out.println("-------------Constructors----------");
		Constructor[] cons=obj.getDeclaredConstructors();
		System.out.println("Number of Constructors :" +cons.length);
		for(Constructor c:cons) {
			System.out.println(c.getName());
		}

		System.out.println("------------- METHODS----------");
		Method[] mthds = obj.getDeclaredMethods();
		System.out.println("Number of Methods:" + mthds.length);
		for (Method m : mthds) {
			System.out.println(m.getName()+"---------Return Type----" +m.getReturnType());

			Parameter[] params = m.getParameters();
			for (Parameter p : params) { // To get the arguements
				System.out.println(p.getName());
			}
		}

	}

}
