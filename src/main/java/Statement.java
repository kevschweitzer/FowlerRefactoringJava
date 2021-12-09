import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals().elements();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += eachRentalString(each);
        }

        //add footer lines
        result += footerString(aCustomer);
        return result;
    }

    abstract String headerString(Customer aCustomer);
    abstract String eachRentalString(Rental aRental);
    abstract String footerString(Customer aCustomer);
}
