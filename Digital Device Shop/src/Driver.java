import java.util.Scanner;

public class Driver{

    public Device ashop=new Device();
    private Device[] devices;
    private Scanner input = new Scanner(System.in);
    private Store store;

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        processOrder();
        runMenu();
    }

    private int mainMenu(){
        System.out.print("""
               Shop Menu
               ---------
                  1) List the Device
                  2) Add Device
                  3) Delete Device
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }

    private void runMenu(){
        int option = mainMenu();

        while (option != 0){

            switch (option){
                case 1 -> printDevice();
                case 2 -> addDevice();
                case 3 -> deleteADevice();

                default -> System.out.println("Invalid option entered: " + option);
            }


            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine();


            option = mainMenu();
        }


        System.out.println("Exiting...bye");
        System.exit(0);
    }


    private void processOrder(){

        System.out.print("How many Devices would you like to have in your Store?  ");
        int numberDevice = input.nextInt();

        store = new Store(numberDevice);


        for (int i = 0; i < numberDevice; i++){
            addDevice();
        }
    }


    private void addDevice(){
        input.nextLine();

        System.out.print("Enter the Device type:  ");
        String productType = input.nextLine();
        System.out.print("Enter the Device name:  ");
        String productName = input.nextLine();
        System.out.print("Enter the price:  ");
        double price = input.nextDouble();



        boolean isAdded = store.add(new Device());
        if (isAdded){
            System.out.println("Device Added Successfully");
        }
        else{
            System.out.println("No Device Added");
        }
    }


    private void printDevice(){
        System.out.println("List of Device are:");
        System.out.println(store.listDevice());
    }
    public void deleteADevice(){
        System.out.println("enter the name you want to delete");
        String name=input.next();
        ashop.deleteDevice(name);
    }
    public void deleteDevice(){
        String name=input.nextLine();
        for (int i = 0; i < devices.length; i++) {
            if(devices[i]!=null) {
                if (devices[i].getProductName().equals(name)) {
                    devices[i] = null;
                    if (i < devices.length - 1) {
                        for (int j = i + 1; j < devices.length; j++) {
                            devices[j - 1] = devices[j];
                        }
                    }
                    devices[devices.length - 1] = null;
                    System.out.println("Successfully delete!");
                    break;
                }
                if(!changeDeviceName(name)){
                    System.out.println("nothing is deleted!");
                    break;
                }
            }
        }}
        public boolean changeDeviceName(String name){
            for (int i = 0; i < devices.length; i++) {
                if(devices[i]!=null){
                    if(devices[i].getProductName().equals(name)){
                        return true;
    }
                }
            }
            return false;
    }



}