<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Cart">
<div class="row">
    <div class="col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2">
        <#list cart.cartItems as cartItem>
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-xs-3">
                            <img class="img-responsive"
                                 src="${cartItem.item.imageUrl}">
                        </div>
                        <div class="col-xs-6">
                            <h4>${cartItem.item.name}</h4>

                            <div>
                                <h4><span class="label label-info">Rs. <span
                                        id="price">${cartItem.item.price}</span></span></h4>
                            </div>

                            <a href="/item/delete/${cartItem.item.id}">
                                <button class="btn btn-danger btn-xs pull-right">Remove from Cart
                                </button>
                            </a>
                        </div>
                        <div class="col-xs-3">
                            <select name="quantity" id="quantity_${cartItem.item.id}"
                                    onchange="updateCartItemQuantity(${cartItem.item.id})">
                                <#list 1..10 as count>
                                    <#if count == cartItem.quantity>
                                        <option value="${count}" label="${count}" selected/>
                                        <#else>
                                            <option value="${count}" label="${count}"/>
                                    </#if>

                                </#list>
                            </select>
                            <h4 class="pull-right">Total : <span class="label label-primary">Rs.<span
                                    id="total_${cartItem.item.id}">${cartItem.totalPrice}</span></span></h4>
                        </div>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</div>
<#if cart.cartItems?has_content>
    <div class="row">
        <div class="col-md-2 col-md-offset-5">

            <a href="/checkout">
                <button class="btn btn-danger btn-lg btn-block">Checkout
                </button>
            </a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-2 col-sm-8 col-sm-offset-2">
            <h2> Total Price: <span class="label label-primary">Rs.<span
                id="total_price}">${cart.totalPrice}</span></span> </h2>
        </div>
    </div>
    <#else>
        <div class="row">
            Your cart is empty, keep shopping.
        </div>
</#if>
<script src="cart_.js"></script>

</@p.publicTemplate>