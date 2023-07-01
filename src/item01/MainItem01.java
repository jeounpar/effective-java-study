package item01;

public class MainItem01 {
	public static void main(String[] args) {
		Item01Repository item01Repository = Item01Repository.getInstance();
		Item01Data itemA = Item01Data.createItem("itemA", 1000);
		item01Repository.save(itemA);
		Item01Data findItemA = item01Repository.findById(itemA.getId());

		Item01Data itemB = Item01Data.createPriceNullItem("itemB");
		item01Repository.save(itemB);
		Item01Data findItemB = item01Repository.findById(itemB.getId());

		System.out.println("findItemA.getPrice() = " + findItemA.getId());
		System.out.println("findItemA.getPrice() = " + findItemA.getPrice());
		System.out.println("findItemA.getItemName() = " + findItemA.getItemName() + "\n");

		System.out.println("findItemB.getPrice() = " + findItemB.getId());
		System.out.println("findItemB.getPrice() = " + findItemB.getPrice());
		System.out.println("findItemB.getItemName() = " + findItemB.getItemName() + "\n");
	}
}
