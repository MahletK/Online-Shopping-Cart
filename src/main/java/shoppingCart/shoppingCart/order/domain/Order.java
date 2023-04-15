package shoppingCart.shoppingCart.order.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shoppingCart.shoppingCart.payment.domain.Payment;
import shoppingCart.shoppingCart.user.domain.User;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue
    Long id;
    Double totalPrice;
    @OneToOne
    @JoinColumn(name = "user_id")
    User user;
    @OneToOne
    @JoinColumn(name = "payment_id")
    Payment payment;
    List<OrderLine> orderLines;

    public Order(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
