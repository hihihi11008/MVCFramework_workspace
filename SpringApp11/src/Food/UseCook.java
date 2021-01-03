package food;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCook {
	
	public static void main(String[] args) {
		//���� �ø��� 
		/*
		 * FriPan pan = new FriPan(); 
		 * Cook cook = new Cook();
		 */
		
		//���� �丮�翡�� ���� 
		/*
		 * cook.setPan(pan); 
		 * cook.makeFood();
		 */
		
		//�������� �̿� 
		//xml�� ���ϴ� ��ü�� ����ϸ�, �� ��ü�� �ۼ��� xml.�� �ľ��Ͽ� ��ü���� �ν��Ͻ��� ���� �� ���� 
		//�̷��� ������ �����ϴ� ��ü�� ������ .spring Context ��ü�� �Ѵ�. 
		ClassPathXmlApplicationContext context=null; //������xml ���������� �о �ۼ��� ��ü�� �ν��Ͻ��� ���� �� �������ش�(���Ե�����)
		context = new ClassPathXmlApplicationContext("spring/config/context.xml");
		
		//context.xml�� �̹� ������ �����̹Ƿ�, �޸𸮿��� �ν��Ͻ����� ������ ���̰�, �� �� � �ν��Ͻ��� ���������� getBean�޼���� ��������ȴ� 
		Cook cook=(Cook)context.getBean("cook");
		
		cook.makeFood();
		
	}
}
