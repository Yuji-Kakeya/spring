package local.kakeya.demo.model;

public class Demo {
	public String message;

	Demo(){
		System.out.println("Constructor");
	}

	public void setMessage(String message){
		this.message = message;
		System.out.println("setMessage -> " + this.message);
		System.out.println(this);
	}
}
