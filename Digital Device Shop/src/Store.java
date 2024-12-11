public class Store {
    public Device ashop=new Device();
    private Device[] devices;
    private int total = 0;  //dual purpose. 1) number of items stored in array, 2) next available index location

    public Store(int numberItems) {
        devices = new Device[numberItems];
    }

    private boolean isFull() {
        return total == devices.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }


    public boolean add(Device device) {
        if (isFull()) {
            return false;
        } else {
            devices[total] = device;
            total++;
            return true;
        }
    }


    public String listDevice() {
        if (isEmpty()) {
            return "No products in the store";
        } else {
            String listOfDevice = "";
            for (int i = 0; i < total; i++) {
                listOfDevice += i + ": " + devices[i] + "\n";
            }
            return listOfDevice;
        }
    }







    }













