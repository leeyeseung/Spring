package dependence;

public class HelloMain {

	public static void main(String[] args) {
		IHelloService helloService = new HelloService();
		HelloController controller = new HelloController();
		controller.setHelloService(helloService);
		controller.hello("홍길동");

	}

}
