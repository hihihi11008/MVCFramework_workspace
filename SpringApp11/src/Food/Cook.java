/*요리사를 정의한다*/
package Food;
public class Cook {
	private Pan pan;
	//외부로부터 필요한 객체를 주입받기 위한 setter 메서드 
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	
	public void makeFood() {
		pan.boil();
	}
}
