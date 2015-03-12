package electron.service;


import electron.Application;
import electron.domain.Cart;
import electron.domain.CartItem;
import electron.domain.Item;
import electron.repository.CartItemRepository;
import electron.repository.CartRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
public class CartServiceTest {


  @Test
  public void shouldBeAbleToFetchCart(){
    //Given
    int id=1;
    CartRepository cartRepository = mock(CartRepository.class);
    CartItemRepository cartItemRepository = mock(CartItemRepository.class);
    CartService cartService = new CartService(cartRepository, cartItemRepository);
    //When
    cartService.getCart(id);
    //Then
    verify(cartRepository).findOne(id);
  }

//  @Test
//  public void shouldBeAbleToAddItemToCart(){
//    //Given
//    CartRepository cartRepository = mock(CartRepository.class);
//    CartItemRepository cartItemRepository = mock(CartItemRepository.class);
//
//    int cartId=1;
//    Cart cart = new Cart();
//    cart.setId(cartId);
//    cartRepository.save(cart);
//
//    CartItem item = new CartItem(1, 2);
//
//    CartService cartService = new CartService(cartRepository,cartItemRepository);
//    //When
//    cartService.saveCartItem(cartId,item);
//    //Then
//    //verify(cartRepository).deleteItem(cartId,itemId);
//    verify(cartItemRepository).save(item);
//  }

}
