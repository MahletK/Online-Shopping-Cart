package shoppingCart.shoppingCart.product.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shoppingCart.shoppingCart.user.domain.User;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue
    Long id;
    String name;
    Double price;
    int quantity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @OneToOne
    @JoinColumn(name = "category_id")
    ProductCategory category;
}
