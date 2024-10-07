// package java_2024.5_7_2024_work;

import java.util.*;

class Client {
    private String name;
    private int age;
    private String address;
    private String policyNumber;
    private double premiumAmount;

    public Client(String name, int age, String address, String policyNumber, double premiumAmount) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.policyNumber = policyNumber;
        this.premiumAmount = premiumAmount;
    }

    public void displayDetails() {
        System.out.println("Client Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Premium Amount: Rs." + premiumAmount);
        System.out.println("------------------------------------");
    }
}

public class Insurance {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        
        
        System.out.print("Number of clients = ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
			System.out.print("Name = ");
			String name=sc.next();
			System.out.print("Age = ");
			int age=sc.nextInt();
			System.out.print("address = ");
			String address=sc.next();
            System.out.print("Policy number = ");
            String policyNumber = sc.next();
            System.out.print("Premium amount = ");
            double premiumAmount = sc.nextDouble();

            clients.add(new Client(name, age, address, policyNumber, premiumAmount));
			
		}

      for (Client client : clients) {
        client.displayDetails();
      }

       sc.close();
    }
}
