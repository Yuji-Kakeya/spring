package local.kakeya.demo.model;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	public String message;

	Demo(){
		System.out.println("Constructor");
		for (Method method: this.getClass().getMethods()){
			System.out.println(method.getName());			
		}
		System.out.println(this.getClass().getModule().getClassLoader().resource);
	}

	public void setMessage(String message){
		this.message = message;
		System.out.println("setMessage -> " + this.message);
		System.out.println(this);
	}
}
