package gui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseClient {
	public static void main(String[] args) {
		//ChatClient�� has a ����� �����ϰ� �ִ� ��ü���� ���� new���� ���� 
		//�������� ApplicationContext�� �̿��Ͽ� �ν��Ͻ����� ����(=injection)����
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("gui/gui-context.xml");
		
		ChatClient chatClient = (ChatClient)context.getBean("chatClient");
		chatClient.init();
	}
}
