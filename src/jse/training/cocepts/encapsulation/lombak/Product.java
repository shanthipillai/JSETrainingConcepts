package jse.training.cocepts.encapsulation.lombak;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
private int productId;
private String productName;
private String addresss;


}
