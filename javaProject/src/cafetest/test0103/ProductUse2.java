package cafetest.test0103;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse2 {
	public static void main(String[] args) {
		int c;
		
		Scanner b = new Scanner(System.in);
		List<Product> pro2 = new ArrayList<>();
		System.out.println("제품정보를 입력하세요");
		
		for(;;) {
		Product p1 = new Product();
		p1.input();
		pro2.add(p1);
		System.out.println("끝내려면 0을 아니라면 아무정수나 입력하세요.");
		
		String d = b.next();
		c = Integer.parseInt(d);
		if(c==0) {
			System.out.println("프로그램을 종료합니다.");
			break ;
		}
	}
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("============================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t부가가치세\t금액");
		System.out.println("-----------------------------------------------------------");
		for(int i=0; i<pro2.size(); i++) {
			Product pro3 = pro2.get(i);
			System.out.println(pro3.getID()+"\t"+pro3.getName()+"\t"+pro3.getCom()+"\t"
					+df.format(pro3.getPrice())+"\t"+pro3.getNum()+"\t"+
					df.format(pro3.getTax())+"\t"+df.format(pro3.getMoney()));
		}
		System.out.println("===========================================================");
	}
}