package record2;

import java.util.ArrayList;
import java.util.List;

//product ile ilgili işlemler
public class ProductService {

    List<Product> products=new ArrayList<>();


    //yeni bir ürün ekleme
    public void addProduct(Product product){
        this.products.add(product);
    }


    //listeden bir ürünü iptal etme
    public void removeProduct(Product product){
        this.products.remove(product);
    }

    //tüm ürünleri listeleme
    public void allProducts(){
        for (Product p:this.products){
            System.out.println("Ürün adı: "+p.name()+"- Fiyatı: "+p.price()+" - Stok : "+p.stock());
        }
    }

    //sadece mevcut olan ürünleri listeleme
    public void availableProducts(){
        for (Product p:this.products){
            if (p.stock()>0){
                System.out.println("Ürün adı: "+p.name()+"- Fiyatı: "+p.price()+" - Stok : "+p.stock());
            }
        }
    }



}