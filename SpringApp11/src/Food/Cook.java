/*�丮�縦 �����Ѵ�*/
package Food;
public class Cook {
	private Pan pan;
	//�ܺηκ��� �ʿ��� ��ü�� ���Թޱ� ���� setter �޼��� 
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	
	public void makeFood() {
		pan.boil();
	}
}
