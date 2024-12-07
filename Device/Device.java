import com.sun.jdi.StringReference;

import java.util.Scanner;

    public class Device {

        static int price;
        public static void main(String[]args) {
            System.out.print("Welcome to our  digital device shop!");
            System.out.println("Please choose your ideal type.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Phone");
            System.out.println("Pad");
            System.out.println("Computer");
            String choice = scanner.next();
            switch (choice) {


                case "Phone" :
                String[] brands = {"iPhone", "HUAWEI", "Xiaomi"};
                String[] iPhonemodel = {"256Gpromax", "512Gpromax", "1TBpromax", "256gplus"};
                int[] iPhoneprice = {8999, 11999, 12999, 13999};
                String[] HUAWEImodel = {"256Gpromax", "512Gpromax", "1TBpromax", "256gplus"};
                int[] HUAWEIprice = {4999, 6999, 7599, 8999};
                String[] Xiaomimodel = {"256Gpromax", "512Gpromax", "1TBpromax", "256gplus"};
                int[] Xiaomiprice = {3999, 4999, 5099, 6999};
                System.out.println("Please choose your ideal brand:");
                String brand = scanner.next();

                    if (brand.equals("iPhone"))
                    {
                        System.out.println("256Gpromax, 512Gpromax, 1TBpromax, 256gplus");
                        System.out.println("Please choose your ideal model:");
                        String model = scanner.next();
                        for (int i = 0; i < iPhonemodel.length; i = i + 1) {
                            model.equals("iPhonemodel[i]");
                            price = iPhoneprice[i];
                            System.out.println("The price of your device is " + price);
                            break;
                        }
                    }
                if (brand.equals("HUAWEI"))
                {
                    System.out.println("256Gpromax, 512Gpromax, 1TBpromax, 256gplus");
                    for (int i = 0; i < HUAWEImodel.length; i = i + 1) {
                        System.out.println("Please choose your ideal model:");
                        String model = scanner.next();
                        model.equals("HUAWEImodel");
                        price = HUAWEIprice[i];
                        System.out.println("The price of your device is " + price);
                        break;
                    }
                }
                if (brand.equals("Xiaomi")) {
                    System.out.println("256Gpromax, 512Gpromax, 1TBpromax, 256gplus");
                    for (int i = 0; i < Xiaomimodel.length; i = i + 1) {
                        System.out.println("Please choose your ideal model:");
                        String model = scanner.next();
                        model.equals("Xiaomimodel[i]");
                        price = Xiaomiprice[i];
                        System.out.println("The price of your device is " + price);
                        break;
                    }
                }
                case "Pad":
                String []padbrands={"iPad","Matepad","Thinkpad"};
                String []ipadmodel={"128G2024","256G2024","256G2024pro11inches","512G2024pro13inches"};

                String []matepadmodel={"128G","256G","256Gpro","512Gpro"};

                String []thinkpadmodel={"128G144Hz","256G144Hz","512G144Hz"};
                int []ipadprice={8999,10999,12999,13999};
                int []matepadprice={4999,5999,6999,8999};
                int []thinkpadprice={999,1999,2599,3099};
                System.out.println("Please choose your ideal brand:");
                String padbrand=scanner.next();

                    if (padbrand.equals("ipad"))
                    {
                        System.out.println("128G2024,256G2024,256G2024pro11inches,512G2024pro13inches");
                        for (int i = 0; i < ipadmodel.length; i = i + 1) {
                            System.out.println("Please choose your ideal model");
                            String padmodel=scanner.next();
                            padmodel.equals("ipadmodel[i]");
                            price = ipadprice[i];
                            System.out.println("The price of your device is " + price);
                            break;
                        }
                    }
                    if(padbrand.equals("matepad")){
                        System.out.println("128G,256G,256Gpro,512Gpro");
                        for(int i=0;i<matepadmodel.length;i=i+1){
                            System.out.println("Please choose your ideal model");
                            String padmodel=scanner.next();
                            matepadmodel.equals("matepadmodel[i]");
                            price=matepadprice[i];
                            System.out.println("The price of your device is "+price);
                            break;
                        }
                    }
                    if(padbrand.equals("thinkpad")){
                        System.out.println("128G144Hz,256G144Hz,512G144Hz");
                        for(int i=0;i<thinkpadmodel.length;i=i+1){
                            System.out.println("Please choose your ideal model");
                            String padmodel=scanner.next();
                            matepadmodel.equals("thinkpadmodel[i]");
                            price=thinkpadprice[i];
                            System.out.println("The price of your device is "+price);
                            break;
                }
        }
}
        }
    }



