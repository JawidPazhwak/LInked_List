public class Item {
    public String name;
    public String code;
    public int price;

    public Item next;

    public Item(String name, String code, int price){
        this.name = name;
        this.code = code;
        this.price = price;
        next = null;
        System.out.println(this.name + " created");
    }
    public void details(){
        System.out.println("Name: " + name + "\n" + "Code: " + code + "\n" + "Price: " + price);
    }

}
