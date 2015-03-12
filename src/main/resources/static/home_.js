function addToCart(itemId)
{
$.ajax({
    url: "/rest/cart/items",
    type: 'POST',
    contentType: 'application/json',
    data: '{"id":'+itemId+'}',
    }).then(function(result){
                    $("#cart_quantity").text(JSON.parse(result).quantity);
                });
}