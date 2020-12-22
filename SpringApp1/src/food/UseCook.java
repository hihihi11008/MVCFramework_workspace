package food;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCook {
	public static void main(String[] args) {
		
		//스프링을 이용하지 않고 구현한예 
		/*
		FriPan pan = new FriPan();
		Cook cook = new Cook();

		cook.setPan(pan);//팬을 요리사에게 주입시키자
		cook.makeFood();
		*/
		
		//스프링을 이용해서 객체를 주입시켜 본다 (DI)
		//xml에 원하는 객체를 명시하면, 이객체가 작성된 xml.을 하악하여 객체들의 인스턴스를 생성
		//관리해준다. 이러한 역할을 수행하는 객체를 가리켜 spring Context 객체라 한다 
		ClassPathXmlApplicationContext context=null; //스프링xml 설정파일을 읽어서 작성된 객체의 인스턴스를 생성 및 관리해준다 (주입도해쥼)
		context = new ClassPathXmlApplicationContext("spring/config/context.xml");
		
		//xml이 이미 읽혀진 상태이므로, 메모리에는 인스턴스들이 존재할 것이고, 그 중 어떤 인스턴스를 가져올지는 getBean메서드로 가져오면 된다 
		Cook cook = (Cook)context.getBean("cook");
		cook.makeFood();
	}
}
