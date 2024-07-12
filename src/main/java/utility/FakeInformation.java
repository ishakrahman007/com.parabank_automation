package utility;

import com.github.javafaker.Faker;

public class FakeInformation {

    private String firstName;
    private String lastName;
    private  String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String ssnNumber;
    private String userName;
    private String password;
    private int loanAmount;
    private int downPayment;

    Faker faker = new Faker();

    public FakeInformation(){
        this.firstName=faker.name().firstName();
        this.lastName=faker.name().lastName();
        this.address=faker.address().streetAddress();
        this.city=faker.address().city();
        this.state=faker.address().state();
        this.zipCode=faker.address().zipCode();
        this.phoneNumber=faker.phoneNumber().phoneNumber();
        this.ssnNumber=faker.numerify("###-##-####");
        this.userName=faker.name().username();
        this.password=faker.internet().password(6,8,true,true,true);
        this.loanAmount=faker.number().numberBetween(5000,10000);
        this.downPayment=faker.number().numberBetween(2000,4000);
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSsnNumber() {
        return ssnNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Faker getFaker() {
        return faker;
    }

}
