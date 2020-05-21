import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("product.csv");
        try{
            System.out.println("truoc khi them san pham");
            readProduct(file);
            System.out.println("moi nhap san pham moi");
            String name =scanner.nextLine();
            String ID = scanner.nextLine();
            String Country = scanner.nextLine();
            int price = scanner.nextInt();
            addProduct(file,name,ID,Country,price);
            System.out.println("sau khi them san pham");
            readProduct(file);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void addProduct(File file,String name,String ID,String Country, int price) throws IOException{
        BufferedWriter brWriter = new BufferedWriter(new FileWriter(file,true));
        brWriter.newLine();
        brWriter.write( name+","+ID+","+Country+","+price );
        brWriter.close();
    }
    public static void readProduct(File file)throws IOException{
        FileReader fileReader= new FileReader(file);
        BufferedReader brReader = new BufferedReader(fileReader);
        String line;
        ArrayList<Product> listProduct = new ArrayList<>();
        while ((line = brReader.readLine()) != null){
            String[] arr = line.split(",");
            listProduct.add(new Product(arr[0],arr[1],arr[2],Integer.parseInt(arr[3])));
        }
        for (Product product : listProduct) {
            System.out.println(product);
        }
        brReader.close();
    }
}
