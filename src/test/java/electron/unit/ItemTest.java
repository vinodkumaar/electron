package electron.unit;

import electron.Application;
import electron.domain.Item;
import electron.domain.ItemType;
import electron.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
public class ItemTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void shouldSaveAnItemInDB() {
        Item testItem = buildTestItem();
        Item savedItem = itemService.save(testItem);
        assertEquals(testItem.getName(), savedItem.getName());
        assertEquals(testItem.getDescription(), savedItem.getDescription());
        assertEquals(testItem.getType(), savedItem.getType());
        itemService.delete(savedItem);
    }

    @Test
    public void shouldFindAnItemInDB() {
        Item testItem = buildTestItem();
        int id = itemService.save(testItem).getId();
        Item itemFound = itemService.find(id);
        assertEquals(testItem.getName(), itemFound.getName());
        assertEquals(testItem.getDescription(), itemFound.getDescription());
        assertEquals(testItem.getType(), itemFound.getType());
        itemService.delete(itemFound);
    }

    private Item buildTestItem() {
        Item testItem = new Item();
        testItem.setName("Test Item");
        testItem.setPrice(10.0);
        testItem.setDescription("Sample description");
        testItem.setAvailableQuantity(10);
        testItem.setType(ItemType.BOARD);
        return testItem;
    }

}
