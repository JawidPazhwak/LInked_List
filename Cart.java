public class Cart {
    public Item item;
    public Item first;
    public String name;

    public Cart(String name){
        this.name = name;
        System.out.println(name + " Created");
    }
    public void addItem(Item i){
        if(first == null){
            first = i;
        }
        else{
            Item current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = i;
            System.out.println(i.name + " added to the cart");
        }
    }
    public void addItem(Item i1, Item i2, Item i3){
        Item[] item = {i1, i2, i3}; 
        for(int i = 0; i < item.length; i ++){
            Item j = item[i];
            if(first == null){
                first = j;
            }
            else{
                Item current = first;
                while(current.next != null){
                    current = current.next;
                }
                current.next = j;
            }
            System.out.println(j.name + " added to the cart");
        }
    } 
    public void details(){
        Item current = first;
        while(current != null){
            current.details();
            current = current.next;
        }
    }
    public double calculatPrice(){
        Item current = first;
        double sum = 0;
        if(first != null){
            sum = sum + first.price;
        }
        while(current.next != null){
            current = current.next;
            sum = sum + current.price;
        }
        return sum;
    }
    public void getItemsCount(){
        Item current = first;
        int counter = 0;
        if(first != null){
            counter ++;
        }
        while(current.next != null){
            current = current.next;
            counter ++;
        }
        System.out.println("Total Items: " + counter);
    }
    public void searchItem(Item i){
        Item current = first;
        boolean found = false;
        if(first != null && first.equals(i)){
            System.out.println(i.name + " found");
            i.details();
        }
        else{
            while(current.next != null){
                if(current.equals(i)){
                    System.out.println(i.name + " found");
                    i.details();
                    found= true;
                }
                current = current.next;
            }
            if(!found){
                System.out.println(i.name + " not found");
            }

        }
    }
    public void deleteItem(Item i){
        Item current = first;
        Item prev = null;
        if(current.equals(i)){
            first = current.next;
            System.out.println(i.name + " deleted from the cart");
        }
        else{
            while(current != null && !current.equals(i)){
                prev = current;
                current = current.next;
            }
            if(current == null){
                System.out.println(i.name + " not found");
            }
            else{
                prev.next = current.next; 
                System.out.println(i.name + " deleted from the cart");
            }
        }
        
    }
    public void mergCart(Cart c){
        Item current = first;
        Item prev = null;
        while(current != null){
            prev = current;
            current = current.next;
        }
        prev.next = c.first;
        System.out.println(this.name + " merged with " + c.name);
    }
}
