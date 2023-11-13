public class HWProgram22 {

    public static void main(String[] args) {

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.openSource();
        System.out.println("______________________________________________________________");
        Iphones iPhone = new Iphones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.icloud();
        System.out.println("______________________________________________________________");
        Smartphones androidSmartphone = new Androids();
        androidSmartphone.call();
        androidSmartphone.sms();
        androidSmartphone.internet();
        System.out.println("______________________________________________________________");
        Smartphones iphoneSmartphone = new Iphones();
        iphoneSmartphone.call();
        iphoneSmartphone.sms();
        iphoneSmartphone.internet();
        System.out.println("______________________________________________________________");
        LinusOS linusOS = new Androids();
        linusOS.openSource();
        System.out.println("______________________________________________________________");
        IOs iOs = new Iphones();
        iOs.icloud();
        System.out.println("______________________________________________________________");
    }
}