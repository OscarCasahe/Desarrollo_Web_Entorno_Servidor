package Default;

import java.util.List;

public class PaymentDaoImpl extends Payment implements PaymentDAO{
	
	public PaymentDaoImpl(int customNumber, String checkNumber, String paymentDate, double amount) {
		super(customNumber, checkNumber, paymentDate, amount);
		// TODO Auto-generated constructor stub
	}

	
	

	

	public Payment createPayment(int customerNumber, String checkNumber, String paymentDate, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

}
