package cpe;
import cpe.repository.*;
import cpe.entity.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    private OrderRepository orderRepository;
    private ListItemRepository listItemRepository;
    private ItemRepository itemRepository;
    private CustomerRepository customerRepository;
 
    @Autowired
    public DataLoader(OrderRepository orderRepository, ListItemRepository listItemRepository, ItemRepository itemRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.listItemRepository = listItemRepository;
        this.itemRepository = itemRepository;
        this.customerRepository = customerRepository;
       
    }



    @Override
    public void run(ApplicationArguments args) throws Exception {


        //Bill_of_lading
 //  this.bill_of_ladingRepository.save(new Bill_of_lading(product, typeproduct, user))

       // product data
      this.productRepository.save(new Product("coke", 20.2, 1));
      this.productRepository.save(new Product("่joke", 20.2, 1));
      this.productRepository.save(new Product("oke", 20.2, 1));

    // typeproduct
        this.typeProductRepository.save(new TypeProduct("export"));
        this.typeProductRepository.save(new TypeProduct("import"));
        this.typeProductRepository.save(new TypeProduct("export"));
    // User
         this.userRepository.save(new User("B5814824","John"));
         this.userRepository.save(new User("B5714824","jam"));
         this.userRepository.save(new User("B5614824","jame"));

       
       // test load data in billOfLa
        Product p  = this.productRepository.findByProductId(1L);  //find id =  1   
        TypeProduct t =  this.typeProductRepository.findByTypeId(1L);  //find id =  1 
        User u = this.userRepository.findByUserId(1L);  //find id =  1 
     
        Product p2  = this.productRepository.findByProductId(2L);  //find id =  1   
        TypeProduct t2 =  this.typeProductRepository.findByTypeId(2L);  //find id =  1 
        User u2 = this.userRepository.findByUserId(2L);  //find id =  1 

        Product p3  = this.productRepository.findByProductId(3L);  //find id =  1   
        TypeProduct t3 =  this.typeProductRepository.findByTypeId(3L);  //find id =  1 
        User u3 = this.userRepository.findByUserId(3L);  //find id =  1 
        //save billOfLa 
        this.bill_of_ladingRepository.save(new Bill_of_lading(p,t,u));
        this.bill_of_ladingRepository.save(new Bill_of_lading(p2,t2,u2));
        this.bill_of_ladingRepository.save(new Bill_of_lading(p3,t3,u3));
    }
    
}
