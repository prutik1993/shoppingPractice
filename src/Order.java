import java.util.ArrayList;
import java.util.List;

public class Order {
    /**
     * Last this question
     *
     */

    public static void main(String[] args) {

        // Print the welcome message
        System.out.println(Questions.welcomeMessage);


        //Create items list
        List<Item> items = new ArrayList<>();


        //create a loop and create and store items in the list until user says no

        do{
            String response = ScannerHelper.getString(
                        items.isEmpty() ? Questions.askItem : Questions.askContinue);

            if(response.toUpperCase().startsWith("N")) break;

            items.add(Item.createItem());


        }while(true);

        // if there is no item print out you exited application
        if(items.isEmpty()) System.out.println(Questions.errorMessage);
        else{

            Address address = Address.createAddress();

            Payment payment = Payment.createPayment();

            //print every item
            double totalPrice = 0;
            for (Item item : items) {
                System.out.println(item);
                totalPrice += item.price;
            }
            //print the total
            System.out.println(Questions.totalPrice + totalPrice);

            //print address
            //print paymentn

            System.out.println(address);
            System.out.println(payment);

           if(ScannerHelper.getString(Questions.confirmMassage).toUpperCase().startsWith("Y"))
               System.out.println(Questions.gotYourOrder);
           else System.out.println(Questions.errorMessage);





        }










    }
}
