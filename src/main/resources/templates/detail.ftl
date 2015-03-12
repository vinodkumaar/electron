<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Electron product list">

<div class="container">
    <div class="row">

        <div class="row">
            <div class="col-md-4">
                <a class="thumbnail" href="/item/${item.id}">
                    <img id="itemDetailsImage" src="${item.imageUrl}"
                         alt="${item.name}">
                </a>
            </div>

            <div class="col-md-8">
                <h2>${item.name}</h2>

                <p>${item.description}</p>
                <#if item.price??>
                    <h4>Price : <span class="label label-danger">Rs. ${item.price}</span></h4>
                    <button class="btn btn-primary pull-right" onclick="addToCart('${item.id}')">Add to
                        Cart
                    </button>
                <#else>
                    <h4>Price : <span class="label label-danger">Contact Us</span></h4>
                </#if>
            </div>
        </div>

    </div>
</div>
<script src="home_.js"></script>
<link rel="stylesheet" type="text/css"
      href="css/home.css"/>
</@p.publicTemplate>
