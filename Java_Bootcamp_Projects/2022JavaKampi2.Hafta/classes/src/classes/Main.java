package classes;

public class Main {

	public static void main(String[] args) {
		//reference type 
		CustomerManager customerManager;
		//Garbage Collector tarafından customerManager'ın oluşturulduğu adres siliniyor.
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
	
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		//int referans türü olmadığı için sayi1 in değeri 10 olarak kalır(primitive type=değer(value) tip)
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		//Diziler referans tip olduğu için sayilar2[0]=10 olur
		
		
	}

}


