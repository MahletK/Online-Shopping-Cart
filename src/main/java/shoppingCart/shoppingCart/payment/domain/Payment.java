package shoppingCart.shoppingCart.payment.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shoppingCart.shoppingCart.order.domain.Order;
import shoppingCart.shoppingCart.user.domain.User;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    @Id
    @GeneratedValue
    Long id;
    Date date;
    Double amount;
    @OneToOne
    @JoinColumn(name = "order_id")
    Order order;
    @OneToOne
    @JoinColumn(name = "user_id")
    User user;
    @OneToOne
    @JoinColumn(name = "payment_type_id")
    PaymentType paymentType;
}
