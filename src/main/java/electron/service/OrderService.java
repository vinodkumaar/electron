package electron.service;


import electron.domain.Order;
import electron.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }
    public void delete(Order savedOrder) {
        orderRepository.delete(savedOrder);
    }
    public Order find(int id) {
        return orderRepository.findOne(id);
    }
}
