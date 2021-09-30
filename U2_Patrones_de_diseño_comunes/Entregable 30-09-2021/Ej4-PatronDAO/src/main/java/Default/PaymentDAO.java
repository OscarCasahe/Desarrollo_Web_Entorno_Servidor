package Default;

import java.util.List;

public interface PaymentDAO {

    Payment createPayment(int customerNumber, String checkNumber, String paymentDate, double amount);
	List<Payment> getPayments();
}
