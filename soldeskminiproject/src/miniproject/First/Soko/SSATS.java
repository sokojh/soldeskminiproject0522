package miniproject.First.Soko;
import java.awt.*;
import javax.swing.*;
public class SSATS extends Frame{
	public SSATS() {
		//프레임 상속받아서 Super로 받아옴
		super("SSATS");
		
//프레임 사이즈
		setSize(300, 300);
		setVisible(true);
	}
//메인
	public static void main(String args[]) {
		//프레임 객체 생성
		SSATS fe = new SSATS();
		//패널 객체 생성
		Panel p = new Panel();
		//버튼 객체 생성
		Button b1 = new Button("타이머설정");
		Button b2 = new Button("QR이미지설정");
		Button b3 = new Button("QR이미지 팝업");
		//체크박스 객체 생성
		Checkbox ck1=new Checkbox("프로그램항상위(Ctrl+Q 단축기사용가능)"); 
		Checkbox ck2=new Checkbox("컴퓨터시작할때 시작");	
	    //status Label 객체 생성
		Label sl1 = new Label("프로그램 Status");
		Label sl2 = new Label("시간설정상태");
	//패널에 컴포넌트 붙이기
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(ck1);
	p.add(ck2);
	p.add(sl1);
	p.add(sl2);
	//패널을 프레임에 붙이기
   fe.add(p);
   
		
	}
}
