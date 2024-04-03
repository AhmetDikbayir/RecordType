package record2;

public record Product(String name,double price,int stock) {

    //recordlar only readable dır, setter metodu eklenemez!!!!
//    public void setStock(int stock){
//        this.stock=stock;
//    }


}