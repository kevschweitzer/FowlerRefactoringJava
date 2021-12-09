import java.util.Enumeration;

public class TextStatement extends Statement{

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals().elements();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge() ) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    String headerString(Customer aCustomer) {
       return "Rental Record for " + aCustomer.getName() + "\n";
    }
}
