package ch17_0106;

import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	//main메소드에서 GUI작성보다는 기본생성자에서 
	public JFrameEx() {
		super("JFrame 예제");//제목처리
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameEx();
		
	}
}
