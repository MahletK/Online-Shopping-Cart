package shoppingCart.shoppingCart.user.dto;

import shoppingCart.shoppingCart.user.domain.User;

//Long id;
//        String userName;
//        String password;
//        String email;
//        String phoneNumber;
//        AddressDTO addressDTO;
public class UserAdapter {
    public static User UserFromDTO(UserDTO userDTO){
        User user = new User(userDTO.getId(), userDTO.getUserName(), userDTO.getPassword(), userDTO.getEmail(),
                userDTO.getPhoneNumber(), userDTO.getAddress());
        return user;
    }

    public static UserDTO UserDTOFromUser(User user){
        UserDTO userDTO = new UserDTO(user.getId(), user.getUserName(), user.getPassword(), user.getEmail(),
                user.getPhoneNumber(), user.getAddress());

        return userDTO;
    }
}
