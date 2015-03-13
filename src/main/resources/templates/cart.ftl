<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Cart">
<div class="row">
    <div class="col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2">
        <#list cart.cartItems as cartItem>

            <#assign itemId = "${cartItem.itemId}">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-xs-3">
                            <img class="img-responsive"
                                 src="${.vars[itemId].imageUrl}">
                        </div>
                        <div class="col-xs-6">
                            <h4>${.vars[itemId].name}</h4>

                            <div>
                                <h4><span class="label label-info">Rs. <span id="price">${.vars[itemId].price}</span></span></h4>
                            </div>

                            <a href="/item/delete/${.vars[itemId].id}"><button class="btn btn-danger btn-xs pull-right">Remove from Cart
                            </button> </a>
                        </div>
                        <div class="col-xs-3">
                            <select name="quantity" id="quantity" onchange="calculatePrices()">
                                <#list 1..10 as count>
                                    <option value="${count}" label="${count}"/>
                                </#list>
                            </select>
                            <h4 class="pull-right">Total : <span class="label label-primary">Rs.<span
                                    id="total">1200</span></span></h4>
                        </div>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</div>
<script src="carte.js"></script>

</@p.publicTemplate>