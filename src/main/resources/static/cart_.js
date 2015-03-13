function updateCartItemQuantity(itemId){

    $.ajax({
        url: "/rest/cart/cartitem/"+itemId,
        type: 'PUT',
        contentType: 'application/json',
        data: '{"quantity":'+$('#quantity_'+itemId).val()+'}',
        }).then(function(result){
                    refreshCart();
                    calculatePrices(itemId);
                    });

}

function calculatePrices(itemId)
{
   $.ajax({
          url: "/rest/cart/cartitem/"+itemId+"/totalPrice",
          type: 'GET',
          contentType: 'application/json',
          }).then(function(result){
                      $('#total_'+ itemId).text(JSON.parse(result).totalPrice);
                      });
}