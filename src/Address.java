public class Address {
    /**
     * Forth this class
     */

    // Create 4args non street2 included constructor here

    public Address(String street1, String city, String state, String country, String zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }


    // Create 5args every variable included constructor here
    //NOTE use this();

    public Address(String street1, String street2, String city, String state, String country, String zip) {
       this(street1, city, state, country, zip);
        this.street2 = street2;
    }

    // Create public static final variables for address questions here
    public static final String askStreet1 = "What is your street1?";
    public static final String askStreet2 = "What is your street2? (OPTIONAL)";
    public static final String askCity = "What is your city?";
    public static final String askState = "What is the current state?";
    public static final String askCountry = "What is the name of your country?";
    public static final String askZip = "What is your zipcode?";
    public static final String askZipOneMore = "Please enter valid  zipcode?";

    // Create 5 variables
    public String street1;
    public String street2;
    public String city;
    public String state;
    public String country;
    public String zip;

    /**
     * Create a method which will ask questions for addresses,
     * and it should create the object and return it
     *
     * NOTE use different constructors with street2 and without street2
     *
     * createAddress()
     */

    public static Address createAddress(){
        String street1 = ScannerHelper.getString(askStreet1);
        String street2 = ScannerHelper.getString(askStreet2);
        String city = ScannerHelper.getString(askCity);
        String state = ScannerHelper.getString(askState);
        String country = ScannerHelper.getString(askCountry);
        String zip = ScannerHelper.getString(askZip);

        while(!isValidZip(zip)) {
            zip = ScannerHelper.getString(askZipOneMore);
        }



        if(street2.isEmpty()) return new Address(street1,city,state,country,zip);
        return new Address(street1,street2,city,state,country,zip);
    }

    public static boolean isValidZip(String zip){

        if(zip.length() != 10 && zip.length() != 5) return false;

        for (int i = 0; i < zip.length(); i++) {
            if(!(zip.charAt(i) == '-' && i == 5)) continue;
                if(!Character.isDigit(zip.charAt(i)))return false;
            }
        return true;
    }


    //Create a toString method, but it should print out street2 ONLY when it is not null
    // condition ? true=do this : else do this
    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                (street2 != null ? ", street2='" + street2 + '\'' : "") +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip=" + zip +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createAddress());


    }
}
