$(document).ready(function(){
    refreshCart();
});


function refreshCart()
{
    $.ajax({
        url: "/rest/cart/quantity",
        type: 'GET',
        contentType: 'application/json'
    }).then(function(result){

        $("#cart_quantity").text(JSON.parse(result).quantity);

    });
}
