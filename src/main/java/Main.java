public class Main {

    public static void main(String [] args) {
        Customer customer = new Customer("Kevin");
        Rental rental1 = new Rental(
                new Movie("Titanic", Movie.REGULAR),
                5
        );
        Rental rental2 = new Rental(
                new Movie("Toy Story", Movie.CHILDRENS),
                5
        );
        Rental rental3 = new Rental(
                new Movie("Rapido y Furioso 9", Movie.NEW_RELEASE),
                5
        );
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        System.out.println(customer.statement());
    }
}
