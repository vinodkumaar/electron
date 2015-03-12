package electron.controllers;


import electron.domain.Order;
import electron.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/delivery_details", method = RequestMethod.GET)
    public String getDeliveryDetails(Map<String, Object> model) {
//        model.put("message", "Hello Electron!");
        return "delivery_details";
    }

    @RequestMapping(value = "/checkout",method=RequestMethod.POST)
    public String saveDeliveryDetails(Map<String, Object> model,HttpServletRequest request) {
//System.out.println(request.;
        Order order=buildOrder(request);
        orderService.save(order);
        return "user_registration";
    }

    private Order buildOrder(HttpServletRequest request) {

        Order order=new Order();
        order.setCustomerName(request.getParameter("name"));
        order.setAddress(request.getParameter("address"));
        order.setEmail(request.getParameter("email"));
        order.setPaymentMode(request.getParameter("paymentmode"));
       // order.setCartId((Integer)request.getSession().getAttribute("cartId"));
        order.setCartId(11);
        return order;
    }

}
