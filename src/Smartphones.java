public interface Smartphones {
    void call();

    void sms();

    void internet();
}

interface LinusOS {
    void openSource();
}

interface iOS {
    void icloud();
}

class Androids implements Smartphones, LinusOS {

    @Override
    public void call() {
        System.out.println("Calling from Android...");
    }

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

class iPhones implements Smartphones, iOS {


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
