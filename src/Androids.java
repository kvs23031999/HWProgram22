public class Androids implements Smartphones, LinusOS {

    @Override
    public void call() {System.out.println("Calling from Android...");}

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from Android...");
    }

    @Override
    public void openSource() {
        System.out.println("Android is based on LinuxOs...");
    }
}
