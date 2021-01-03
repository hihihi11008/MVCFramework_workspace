package gui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseClient {
	public static void main(String[] args) {
		//ChatClient�� has a ����� �����ϰ� �ִ� ��ü�������� new �������� 
		//�������� ApplicationContext�� �̿��Ͽ� �ν��Ͻ����� �������� 
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring/config/gui-context.xml");
		
		ChatClient chatClient=(ChatClient)context.getBean("chatClient");
		
		chatClient.init();
		
	}
}