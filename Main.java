package foodorder;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    @SuppressWarnings("unused")
	ArrayList<Food> foodlist = new ArrayList<>();
		FoodManaging foodmanaging = new FoodManaging();
		int select;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			Menumain();
			select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1:
				do {
					MenuFoodManage();
					select = Integer.parseInt(sc.nextLine());
					switch(select) {
					case 1:
						foodmanaging.sc();
						break;
					case 2:
						foodmanaging.print();
						foodmanaging.DeleteFood();
						break;
					case 3:
						foodmanaging.print();
						foodmanaging.EditFood();
						break;
					case 4:
						foodmanaging.PrintOrder();
						break;
					case 5:
						foodmanaging.search();
						break;
					case 0:
						System.out.println("Back");
						break;
					default:
						break;
					}
				}while(select!=0);
				break;
			case 2:
				do {
					MenuOrder();
					select = Integer.parseInt(sc.nextLine());
					switch(select) {
					case 1:
						foodmanaging.print();
						foodmanaging.Price();
						break;
					case 0:
						System.out.println("Back");
						break;
					default:
						break;
					}
				}while(select!=0);
				break;
			default:
				break;
			}
		}while(select!=3);
	}
	static void MenuFoodManage() {
		System.out.println("--------MENU FOODMANAGE---------");
		System.out.println("********************************");
		System.out.println("0.Back to Main Menu");
		System.out.println("1.Add food");
		System.out.println("2.Delete food");
		System.out.println("3.Edit food");
		System.out.println("4.Table info");
		System.out.println("5.Payment");
		System.out.println("********************************");
		System.out.println("select");
		
	}
	static void MenuOrder() {
		System.out.println("------MENU ORDER------");
		System.out.println("**********************");
		System.out.println("0.Back to main menu");
		System.out.println("1.Print food and order");
		System.out.println("**********************");
		System.out.println("select");
	}
	static void Menumain() {
		System.out.println("------MAIN MENU-----");
		System.out.println("********************");
		System.out.println("1.Manage Food");
		System.out.println("2.Manage Order");
		System.out.println("3.Exit");
		System.out.println("********************");
		System.out.println("select");
		
	}
}