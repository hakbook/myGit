package cafetest.test0104;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<EC> li = new ArrayList<>();
		li.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918523468", 55900));
		li.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691426845", 23600));
		li.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160756982", 2600000));
		map.put("li", li);
		print(map);
	}

	 static void print(Map<String, Object> map) {
		 ArrayList<EC> list = (ArrayList<EC>)map.get("li");
		 System.out.println("------------------------------------------------------------------");
		 System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		 System.out.println("------------------------------------------------------------------");
		 for(EC ec : list) {
			 System.out.println(ec.getNo()+"\t"+ec.getOrderDate()+"\t"+ec.getProduct()+"\t"+ec.getCardName()+"\t"+
		                ec.getCardNo().replace(ec.getCardNo().subSequence(6, 9), "****")+"\t"+ec.getPay());
		 }
		 System.out.println("------------------------------------------------------------------");
	}
}
