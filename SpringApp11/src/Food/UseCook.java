package Food;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCook {
	
	public static void main(String[] args) {
		//팬을 올리자 
		/*
		 * FriPan pan = new FriPan(); 
		 * Cook cook = new Cook();
		 */
		
		//팬을 요리사에게 주입 
		/*
		 * cook.setPan(pan); 
		 * cook.makeFood();
		 */
		
		//스프링을 이용 
		//xml에 원하는 객체를 명시하면, 이 객체가 작성된 xml.을 파악하여 객체들의 인스턴스를 생성 및 관리 
		//이러한 역할을 수행하는 객체를 가리켜 .spring Context 객체라 한다. 
		ClassPathXmlApplicationContext
		
	}
}
