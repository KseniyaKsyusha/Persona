package ua.en.kosse.oksana.tommy;


public class Phone1 {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone( "Samsung", "Galaxy S 10Lite",
                512, 8, 12);
        System.out.println(samsung.toString());
        System.out.println("*****Звонок***** ");
        samsung.call();
        System.out.println("*****СМС******** ");
        samsung.massage();
        System.out.println("*****Фото*******");
        samsung.photo();
        System.out.println("*****Видос******");
        samsung.video();

        NokiaPhone nokia = new NokiaPhone("Nokia", "4000 4G",
                125, 4);
        System.out.println(nokia.toString());
        System.out.println("*******Звонок****** ");
        nokia.call();
        System.out.println("********СМС******** ");
        nokia.massage();

    }

}








