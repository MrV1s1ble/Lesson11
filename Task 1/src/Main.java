public class Main {
    public static void main(String[] args) {
        Phone nokia = new Phone(8999887766L, "Nokia", 213.2, "China");
        Phone xiaomi = new Phone(8999887777L, "Xiaomi", 203.5, "China");
        Phone apple = new Phone();
        System.out.println(nokia);
        System.out.println(xiaomi);
        System.out.println(apple);
        nokia.receiveCall("Allice");
        System.out.println();
        xiaomi.receiveCall("Peter", 8999887777L);
    }
}
