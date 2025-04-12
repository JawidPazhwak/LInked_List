public class CartTester {
    public static void main(String[] args){
        Item i1 = new Item("Pen", "12P", 10);
        Cart c1 = new Cart("Stationary Cart");
        Cart c2 = new Cart("Stationary Cart 2");
        c1.first = i1;
        Item i2 = new Item("Notebook", "12N", 10);
        Item i3 = new Item("Eraser", "12E", 10);
        Item i4 = new Item("Marker", "12M", 10);
        Item i5 = new Item("Pencil", "12P", 10);
        Item i6 = new Item("Pencil Sharpener", "12PS", 10);
        Item i7 = new Item("Compass", "12C", 10);
        Item i8 = new Item("Highlighter", "12H", 10);
        Item i9 = new Item("Bag Pack", "12BP", 10);

        c1.addItem(i2);
        c1.addItem(i3);
        c1.addItem(i4, i5, i6);
        c1.details();
        System.out.println("Total Price of this cart: " + c1.calculatPrice());
        c1.getItemsCount();
        c1.searchItem(i9);
        c1.searchItem(i1);
        c1.deleteItem(i1);
        c1.details();
        c1.deleteItem(i9);
        c2.addItem(i7);
        c2.addItem(i8);
        c2.addItem(i9);
        c1.mergCart(c2);
        c1.details();


    }
}
