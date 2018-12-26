package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Informe o nome do Cliente");
		String nome = sc.nextLine();
		
		System.out.println("Informe o email do Cliente");
		String email = sc.nextLine();
		
		System.out.println("Informe a data de nascimento do Cliente: Exp.: DD/MM/YYYY");
		Date birthdate = sdf.parse(sc.next());
	
		Client cliente = new  Client(nome, email, birthdate);
		
		System.out.println("Informe os dados dessa ordem de compra");
		
		System.out.println("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
	
		Order compra = new Order(OrderStatus.valueOf(status));
				
		System.out.println("Quantos itens essa ordem de compra possui ?");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Informe os dados do item #"+i+1);
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String nomeP = sc.nextLine();
			System.out.println("Preço do produto");
			Double priceP = sc.nextDouble();
			Product produto = new Product(nomeP, priceP);
			
			System.out.println("Quantidade: ");
			int quantidadeItem = sc.nextInt();
			
			OrderItem item = new OrderItem(quantidadeItem, priceP);
			
			compra.addItem(item);
			
		}
		
		System.out.println(compra.toString());
		
		sc.close();

	}

}
