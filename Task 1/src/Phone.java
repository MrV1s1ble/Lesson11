public class Phone {
    long phoneNumber;
    String phoneModel;
    double phoneWeight;
    String country = "China";

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone: " +
                "phoneNumber = " + phoneNumber +
                ", phoneModel = '" + phoneModel + '\'' +
                ", phoneWeight = " + phoneWeight +
                ", country = '" + country + '\'' +
                '.';
    }

    public Phone(long phoneNumber, String phoneModel, double phoneWeight, String country) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
        this.country = country;
    }

    public void receiveCall(String name) {
        System.out.print("Звонит абонент по имени: " + name);
    }
    public void receiveCall(String name, long phoneNumber) {
        receiveCall(name);
        System.out.println(", номер: " + phoneNumber);
    }
}
