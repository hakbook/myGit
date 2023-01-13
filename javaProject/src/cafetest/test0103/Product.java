package cafetest.test0103;

import java.util.Scanner;

public class Product {
	private String ID;//제품번호
	private String name;//제품명
	private String com;//제조사
	private int price;//단가
	private int num;//수량
	private double tax;//부가가치세(금액x0.1)
	private int money;//금액(단가x수량)
	
	public void input() {
		
		Scanner a = new Scanner(System.in);
		System.out.print("제품번호 : ");
		ID = a.next();
		System.out.print("제품명 : ");
		name = a.next();
		System.out.print("제조사 : ");
		com = a.next();
		System.out.print("단가 : ");
		price = a.nextInt();
		System.out.print("수량 : ");
		num = a.nextInt();
		
		money = price * num;
		tax = money * 0.1;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
