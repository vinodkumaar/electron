package electron.service;

import electron.domain.Item;
import electron.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findItems() {
        Iterable<Item> items = itemRepository.findAll();
        List<Item> itemsList = new ArrayList<Item>();
        for (Item i : items) {
            itemsList.add(i);
        }
        return itemsList;

    }

    public void save(Item item) {
        itemRepository.save(item);
    }
}
