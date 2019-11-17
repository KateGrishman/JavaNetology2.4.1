package netology241;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader() {
            @Override
            public void getBook(Administrator administrator) {

            }

            @Override
            public void returnBook(Administrator administrator) {

            }
        };
        Guest guest = new Guest();
        AdminAndLibrarian adminAndLibrarian = new AdminAndLibrarian();
        adminAndLibrarian.giveBook(guest);
        guest.supplyBook(adminAndLibrarian);
    }
}
