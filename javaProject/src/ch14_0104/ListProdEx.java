package ch14_0104;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<ProdEx> list = new ArrayList<>();
		
		list.add(new ProdEx("냉장고", "S101", "삼성", 200, 2));
		list.add(new ProdEx("TV", "L101", "LG", 300, 4));
		list.add(new ProdEx("청소기", "D101", "다이슨", 250, 2));
		list.add(new ProdEx("컴퓨터", "H101", "한성", 350, 3));
		map.put("list", list);
		print(map);
	}
	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		System.out.println("-------------------------------------(단위:만원)---");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("------------------------------------------------");
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()+"\t"+
		s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("------------------------------------------------");
	}
}
