package demo.domain;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    private String itemName;
    private String itemId;
    private int quantity;
    private double price; // price is quantity * unitPrice

    public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item() {
    }

    @JsonCreator
    public Item(@JsonProperty("itemName") String itemName,
                @JsonProperty("itemId") String itemId,
                @JsonProperty("quantity") int quantity,
                @JsonProperty("price") double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
