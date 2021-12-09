public class TextStatement extends Statement{

    @Override
    String headerString(Customer aCustomer) {
       return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    String eachRentalString(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
                String.valueOf(aRental.getCharge()) + "\n";
    }

    @Override
    String footerString(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge() ) + "\n" +
                "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
