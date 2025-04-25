public class WareHouseInventory {
    public int id;
    public static int nextId;
    public String code;
    public int quantity;
    public WareHouseInventory firstBin;
    public WareHouseInventory nextBin;
    
    public WareHouseInventory(String code, int quantity){
        this.code = code;
        this.quantity = quantity;
        id = ++ nextId;
        nextBin = null;
        System.out.println(id + ": Bin " + code + " created");
    }
    public void addItem(WareHouseInventory w){
        if(firstBin == null){
            firstBin = w;
            System.out.println(w.code + " added");
        }
        else{
            WareHouseInventory current = firstBin;
            while(current.nextBin != null){
                current = current.nextBin;
            }
            current.nextBin = w;
            System.out.println(w.code + " added");
        }
    }
    public void removeItem(String code){
        if(firstBin.code.equals(code)){
            firstBin = null;
            System.out.println(code + " removed");
        }
        else{
            WareHouseInventory current = firstBin;
            while(current.nextBin != null && !current.nextBin.code.equals(code)){
                current = current.nextBin;
            }
            if(current.nextBin != null){
                current.nextBin = current.nextBin.nextBin;
                System.out.println(code + " removed");
            }
        }
    }
    public void showItem(){
        System.out.println("Items: ");
        if(firstBin == null){
            System.out.println("WareHous is empty");
        }
        else{
            WareHouseInventory current = firstBin;
            while(current != null){
                System.out.println("ID: " + current.id + "\nCode: " + current.code + "\nQuantity: " + current.quantity);
                current = current.nextBin;
            }
        }
    }

}
