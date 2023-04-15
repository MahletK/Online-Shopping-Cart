package shoppingCart.shoppingCart.user.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shoppingCart.shoppingCart.user.domain.Address;
import shoppingCart.shoppingCart.user.domain.Role;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    Long id;
    String userName;
    String password;
    String email;
    String phoneNumber;
    Address address;
}
