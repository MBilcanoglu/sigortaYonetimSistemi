package sigortaYönetimSistemi;

import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Perform calculation specific to health insurance
        return getPrice() * 1.2;
    }
}
