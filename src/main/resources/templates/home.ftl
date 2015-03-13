<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Electron product list">

<div class="container">
    <div class="row">

        <#list items as item>
            <div class="col-xs-12 col-sm-6 col-md-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <a class="thumbnail" href="/item/${item.id}">
                            <img id="itemImage" src="${item.imageUrl}"
                                 alt="${item.name}">
                        </a>
                        <h4>${item.name}</h4>

                        <p>${item.description}</p>

                        <div class="row">
                            <#if item.price??>
                                <div class="col-xs-6">
                                    <h4><span class="label label-danger label-lg">Rs. ${item.price}</span></h4>
                                </div>
                                <div class="col-xs-6">
                                    <button class="btn btn-primary pull-right" onclick="addToCart('${item.id}')">Add to
                                        Cart
                                    </button>
                                </div>
                                <#else>
                                    <div class="col-xs-6">
                                        <h4><span class="label label-danger">Contact Us</span></h4>
                                    </div>
                            </#if>
                        </div>
                    </div>
                </div>
            </div>
        </#list>

    </div>
</div>
<script src="home_.js"></script>
</@p.publicTemplate>
