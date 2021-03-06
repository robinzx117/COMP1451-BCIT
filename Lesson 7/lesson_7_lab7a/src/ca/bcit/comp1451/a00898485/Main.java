package ca.bcit.comp1451.a00898485;

/**
 * class Main
 *
 * @author Xin Zhao (A00898485) with Manpreet Kaur
 * @version 1.0
 */

public class Main {
    //Symbolic Constants:
    public static final String IPOD_PURPOSE   = "music";
    public static final String IPAD_PURPOSE   = "learning";
    public static final String IPHONE_PURPOSE = "talking";

    public static void main(String[] args) {
        Main main = new Main();
        main.IDevicesTest();
        main.IPodTest();
        main.IPadTest();
        main.IPhoneTest();
    }

    public void IDevicesTest() {
        IPod   ipod   = new IPod   (IPOD_PURPOSE, 17, 25.0);
        IPad   ipad   = new IPad   (IPAD_PURPOSE, false, "iPadOS 14");
        IPhone iphone = new IPhone (IPHONE_PURPOSE, 200.0, "Bell");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("IDevicesTest:");
        ipod.printDetails();
        ipad.printDetails();
        iphone.printDetails();
        System.out.println(ipod.toString());
        System.out.println(ipad.toString());
        System.out.println(iphone.toString());
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void IPodTest() {
        IPod ipod1 = new IPod (IPOD_PURPOSE, 12, 25.0);
        IPod ipod2 = new IPod (IPOD_PURPOSE, 17, 25.0);
        IPod ipod3 = new IPod (IPOD_PURPOSE, 17, 28.0);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("IPodTest:");
        System.out.println(ipod1.equals(ipod2));
        System.out.println(ipod2.equals(ipod3));
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void IPadTest() {
        IPad ipad1 = new IPad (IPAD_PURPOSE, false, "iPadOS 14");
        IPad ipad2 = new IPad (IPAD_PURPOSE, true,  "iOS 12");
        IPad ipad3 = new IPad (IPAD_PURPOSE, true,  "iPadOS 14");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("IPadTest:");
        System.out.println(ipad1.equals(ipad3));
        System.out.println(ipad2.equals(ipad3));
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void IPhoneTest() {
        IPhone iphone1 = new IPhone (IPHONE_PURPOSE, 200.0,  "Bell");
        IPhone iphone2 = new IPhone (IPHONE_PURPOSE, 195.0,  "Fido");
        IPhone iphone3 = new IPhone (IPHONE_PURPOSE, 210.0,  "Fido");
        IPhone iphone4 = new IPhone (IPHONE_PURPOSE, 189.99, "Rogers");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("IPhoneTest:");
        System.out.println(iphone1.equals(iphone2));
        System.out.println(iphone1.equals(iphone3));
        System.out.println(iphone1.equals(iphone4));
        System.out.println("------------------------------------------------------------------------------------------");
    }
}