package item01;

public class Item01Data {
	private String itemName;
	private Integer price;
	private Long id;

	private Item01Data(String itemName, Integer price) {
		this.itemName = itemName;
		this.price = price;
	}

	public static Item01Data createItem(String itemName, Integer price) {
		return new Item01Data(itemName, price);
	}

	public static Item01Data createPriceNullItem(String itemName) {
		return new Item01Data(itemName, null);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
