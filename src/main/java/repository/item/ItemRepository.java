package repository.item;

import domain.item.Item;

import java.util.List;

public interface ItemRepository {

    public Item save(Item item);

    public Item findById(Long id);

    public List<Item> findAll();

    public void update(Long itemId, Item updateParam);
}
