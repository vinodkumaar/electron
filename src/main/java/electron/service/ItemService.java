package electron.service;

import com.google.common.collect.Lists;
import electron.domain.Item;
import electron.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findItems() {
        return Lists.newArrayList(itemRepository.findAll());
    }

    public void save(Item item) {
        itemRepository.save(item);
    }
}
