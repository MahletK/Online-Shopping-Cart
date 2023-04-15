package shoppingCart.shoppingCart.product.dto;

import shoppingCart.shoppingCart.product.domain.Product;

public class ProductAdapter {
    public static ProductDTO DTOFromProduct(Product product){
        ProductDTO productDTO = new ProductDTO(product.getName(), product.getPrice(), product.getQuantity());
        return productDTO;
    }

    public static Product productFromDTO(ProductDTO productDTO){
        Product product = new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getQuantity());
        return product;
    }
}
