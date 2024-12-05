import java.util.Scanner;

    public class Device {
        static int price;
        public static void main(String[]args){
            System.out.print("Welcome to our shop!");
            Scanner scanner = new Scanner(System.in);
            String[] brands ={"iPhone","HUAWEI","Xiaomi"};
            String[]iPhonemodel={"256Gpromax","512Gpromax","1TBpromax","256gplus"};
            int[]iPhoneprice={8999,11999,12999,13999};
            String[]HUAWEImodel={"256Gpromax","512Gpromax","1TBpromax","256gplus"};
            int[]HUAWEIprice={4999,6999,7599,8999};
            String[]Xiaomimodel={"256Gpromax","512Gpromax","1TBpromax","256gplus"};
            int[]Xiaomiprice={3999,4999,5099,6999};
            System.out.println("Please choose your ideal brand:");
            String brand=scanner.next();
            System.out.println("Please choose your ideal model:");
            String model=scanner.next();
            if(brand.equals("iPhone"));
            {
                for(int i=0;i<iPhonemodel.length;i=i+1) {
                    model.equals("iPhonemodel[i]");
                    price = iPhoneprice[i];
                    System.out.println("The price of your device is "+price);
                }
            }
            if(brand.equals("HUAWEI"));
            {
                for(int i=0;i<HUAWEImodel.length;i=i+1){
                    model.equals("HUAWEImodel");
                    price=HUAWEIprice[i];
                    System.out.println("The price of your device is "+price);
                }
            }
            if(brand.equals("Xiaomi")){
                for(int i=0;i<Xiaomimodel.length;i=i+1){
                    model.equals("Xiaomimodel[i]");
                    price=Xiaomiprice[i];
                    System.out.println("The price of your device is "+price);
                }
            }
        }

}



