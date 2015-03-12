package electron.service;

import electron.Application;
import electron.domain.Order;
import electron.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
public class OrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void shouldSaveAnOrderInDB() {
        Order testOrder = buildOrder();
        Order savedOrder = orderService.save(testOrder);
        assertEquals(testOrder.getCustomerName(), savedOrder.getCustomerName());
        assertEquals(testOrder.getAddress(), savedOrder.getAddress());
        assertEquals(testOrder.getCartId(), savedOrder.getCartId());
        assertEquals(testOrder.getEmail(), savedOrder.getEmail());
        assertEquals(testOrder.getPaymentMode(), savedOrder.getPaymentMode());
        orderService.delete(savedOrder);
    }

    @Test
    public void shouldFindAnOrderInDb() {
        Order testOrder= buildOrder();
        int id = orderService.save(testOrder).getId();
        Order orderFound = orderService.find(id);
        assertEquals(testOrder.getCustomerName(), orderFound.getCustomerName());
        assertEquals(testOrder.getAddress(), orderFound.getAddress());
        assertEquals(testOrder.getCartId(), orderFound.getCartId());
        assertEquals(testOrder.getEmail(), orderFound.getEmail());
        assertEquals(testOrder.getPaymentMode(), orderFound.getPaymentMode());
        orderService.delete(orderFound);
    }

    private Order buildOrder() {
        Order order = new Order();
        order.setCartId(10);
        order.setCustomerName("Sultan");
        order.setPaymentMode("cod");
        order.setEmail("sultan@gmail.com");
        order.setAddress("XUZZZZ");
        return order;
    }
}
