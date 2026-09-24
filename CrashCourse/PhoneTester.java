public class PhoneTester {
    

    public static void main(String[] args) {

        Phone sams = new Phone("Samsung", "Galaxy 17", 512.0);
        Phone apps = new Phone("Apple", "Iphone 17", 512.0);

        sams.resetPhone();
        sams.upgrade();
        sams.usePhone(25);
        sams.fivegToggle();
        sams.batteryStatus();
        sams.charger(50);

        apps.resetPhone();
        apps.upgrade();
        apps.usePhone(50);
        apps.fivegToggle();
        apps.batteryStatus();
        apps.charger(25);

    }

}