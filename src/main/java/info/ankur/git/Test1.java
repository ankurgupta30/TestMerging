package info.ankur.git;

public class Test1 {
	public static void main(String[] str){

		print("Tom1");
		featureForFuture1("This is not meant for production");
		print("Dick");
		print("Harry1");
		print("Sherry");
		print("Dick");
		featureForFuture("This is not meant for production");
	}
	private static void featureForFuture(String str){
			System.out.println("Hello " + str);
		}
	}	
	private static void print(String str){
		System.out.println("Hello " + str);
	}

	private static void featureForFuture1(String str){
			System.out.println("Hello " + str);
		}
	}
}
