public class Phone {
    private String brand;
    private String model;
    private double storage;
    private int batterypercent;
    public boolean is5gEnabled;
    private double budget;
    private int upgradeCount;

    public Phone(String brand, String model, double storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.batterypercent = 100;
        this.is5gEnabled = true;
        this.budget = 1000.0;
        this.upgradeCount = 0;
    }

    public void resetPhone() {
        brand = "";
        model = "";
        storage = 0.0;
        batterypercent = 100;
        is5gEnabled = true;
        budget = 1000.0;
        upgradeCount = 0;
        System.out.println("New phone created!");
    }

    public void upgrade() {
        budget = budget-500;
        storage = storage*1.5;
        model = model + " Pro";
        upgradeCount++;
        System.out.println("Phone upgraded!");
        if (upgradeCount >= 1) {
            budget = budget-500;
            storage = storage*1.5;
            model = model + " Max";
            upgradeCount++;
            System.out.println("Phone has been upgraded " + upgradeCount + " times.");
        }
        
        if (budget <= 0) {
            System.out.println("Not enough budget to upgrade!");
        }

    }

    public void fivegToggle() {
        is5gEnabled = false;
        if (is5gEnabled = false) {
            is5gEnabled = true;
        }
        batterypercent = batterypercent-25;
    }

    public void charger(int critval) {
        System.out.println("Charger bought!");
        batterypercent = critval;
    }

    public void batteryStatus() {
        System.out.println("Battery level: " + batterypercent + "%");
        if (batterypercent < 20) {
            System.out.println("Recharge your phone.");
        }
        
        if (batterypercent <= 0 && budget >= 100) {
            budget = budget - 100;
            System.out.println("Due to critical battery, we have deducted $100 from your budget and bought you a charger.");
            charger(0);
        }
    }

    public void usePhone(int timeMinutes) {
        batterypercent = batterypercent - timeMinutes;
        
    }

}
