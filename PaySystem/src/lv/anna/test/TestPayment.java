package lv.anna.test;

import lv.anna.employee.CommissionEmployee;
import lv.anna.employee.SalaryEmployee;
import lv.anna.paysystem.PaymentSystem;

public class TestPayment {
	
	public static void main(String[] args){
		
		PaymentSystem paymentSystem = new PaymentSystem();
		
		CommissionEmployee toms = new CommissionEmployee("Toms Ozolins", 1010101, 5000.5);
		paymentSystem.addPayee(toms);
		CommissionEmployee ieva = new CommissionEmployee("Ieva Berzina", 1010102, 5600.5);
		paymentSystem.addPayee(ieva);
		
		SalaryEmployee janis = new SalaryEmployee("Janis Kalnins", 1010103, 4000.5);
		paymentSystem.addPayee(janis);
		SalaryEmployee liga = new SalaryEmployee("Liga Zile", 1010104, 3000.5);
		paymentSystem.addPayee(liga);
		
		//simulate work 
		toms.giveComission(4.0);
		toms.giveComission(50.3);
		toms.giveBonus(17.0);
		janis.giveBonus(10.0);
		ieva.giveComission(40.2);
		ieva.giveBonus(30.0);
		toms.giveComission(4.0);
		toms.giveComission(52.3);
		ieva.giveComission(40.2);
		
		paymentSystem.processPayments();
		
		Double d = 40.3;
		System.out.println(String.format("%1$,.2f",d));
	}
	
}
	
	
