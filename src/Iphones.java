class Iphones implements Smartphones, IOs {


    @Override
    public void call() {
        System.out.println("Calling from iPhones...");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhones...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from iPhones...");
    }

    @Override
    public void icloud() {
        System.out.println("Using iCloud from iPhones...");
    }
}
