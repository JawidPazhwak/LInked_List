public class WareHouseInventoryTester {
    public static void main(String[] args) {
        WareHouseInventory manager = new WareHouseInventory(null, 0);
        WareHouseInventory w1 = new WareHouseInventory("A123", 10);
        WareHouseInventory w2 = new WareHouseInventory("B123", 10);
        WareHouseInventory w3 = new WareHouseInventory("C123", 10);

        manager.addItem(w1);
        manager.addItem(w2);
        manager.addItem(w3);
        manager.showItem();
        manager.removeItem("B123");
        manager.showItem();
    }
}
