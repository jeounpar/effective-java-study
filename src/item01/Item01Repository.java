package item01;

import java.util.HashMap;
import java.util.Map;

public class Item01Repository {
	private static final Map<Long, Item01Data> store = new HashMap<>();
	private static long sequence = 0L;

	private static final Item01Repository instance = new Item01Repository();

	private Item01Repository(){}

	public static Item01Repository getInstance(){
		return instance;
	}

	public Item01Data save(Item01Data item) {
		item.setId(++sequence);
		store.put(item.getId(), item);
		return item;
	}

	public Item01Data findById(Long id) {
		return store.get(id);
	}
}
