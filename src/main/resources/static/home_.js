function addToCart(itemId)
{
$.ajax({
    url: "/rest/cart/items",
    type: 'POST',
    contentType: 'application/json',
    data: '{"id":'+itemId+'}',
    }).then(function(result){
                refreshCart();
                });
}