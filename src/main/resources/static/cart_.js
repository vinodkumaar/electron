function updateCartItemQuantity(itemId){

    $.ajax({
        url: "/rest/cart/cartitem/"+itemId,
        type: 'PUT',
        contentType: 'application/json',
        data: '{"quantity":'+$('#quantity_'+itemId).val()+'}',
        }).then(function(result){
                    refreshCart();
                    calculatePrices();
                    });

}

function calculatePrices()
{
}