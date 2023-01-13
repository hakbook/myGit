package cafetest.test0103;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public static void main(String[] args) {
		List<Product> pro = new ArrayList<>();
		System.out.println("2건의 제품정보를 입력하세요.");
		Product p1 = new Product();
		p1.input();
		Product p2 = new Product();
		p2.input();
		
		pro.add(p1);
		pro.add(p2);
		
		DecimalFormat df = new DecimalFormat("###,###");
		
		System.out.println("================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액");
		System.out.println("------------------------------------------------");
		for(int i=0; i<pro.size(); i++) {
			Product pro2 = pro.get(i);
			System.out.println(pro2.getID()+"\t"+pro2.getName()+"\t"+pro2.getCom()+"\t"
					+df.format(pro2.getPrice())+"\t"+pro2.getNum()+"\t"+df.format(pro2.getMoney()));
		}
		System.out.println("================================================");
	}
}