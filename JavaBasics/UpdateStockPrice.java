package JavaBasics;
import java.util.Scanner;

public class UpdateStockPrice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        Product[] prod =new Product[n];
        for(int i=0; i<n; i++){
            int id = sc.nextInt();
            String name = sc.nextLine();
            sc.nextLine();
            double price = sc.nextDouble();
            prod[i] = new Product(id, name, price);
        }

        int enterid = sc.nextInt();
        //sc.nextLine();
        
        double newprice = sc.nextDouble();
        sc.close();

        double result= updatePriceForGivenStockProduct(prod, enterid);

        double result1= updatePrice(prod, newprice, enterid);

        if(result == 0){
            System.out.println("no ID found");
        }
        else{
            System.out.println("Id found :" + result);
        }

        if(result1 == 0){
            System.out.println("no ID found");
        }
        else{
            System.out.println("Changed price :" + result1);
        }
        
            
    }

    public static double updatePriceForGivenStockProduct (Product[] prod, int enterid) {
        for(int i=0; i<prod.length; i++){
            if(enterid ==  prod[i].getid()){
                return prod[i].getprice();
            }
        }
        return 0;   
    }


    public static double updatePrice(Product[] prod, double newprice, int enterid){
        for(int i=0; i<prod.length; i++){
            if(enterid == prod[i].getid()){
                prod[i].setprice(newprice);
                return prod[i].getprice();
            }
        }
        return 0;
    }

    
}



class Product{
    int prodid;
    String prodname;
    double price;

    Product(int id, String name, double price){
        this.prodid = id;
        this.prodname = name;
        this.price = price;
    }

    int getid(){
    return prodid;
    }

    double getprice(){
        return price;
    }

    void setprice(double price){
        this.price=price;
    }



}

