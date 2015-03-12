<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Electron product list">

<div class="container">
    <div class="row">

        <#list items as item>
          <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="panel">
                  <a class="thumbnail" href="/item/${item.id}">
                      <img id="itemImage" src="${item.imageUrl}"
                           alt="${item.name}">
                  </a>
                  <h4>${item.name}</h4>

                  <p>${item.description}</p>

                  <div class="row">
                      <div class="col-xs-6">
                          <#if item.price??>
                              <h4>Price : <span class="label label-danger">Rs. ${item.price}</span></h4>
                          <#else>
                              <h4>Price : <span class="label label-danger">Contact Us</span></h4>
                          </#if>
                      </div>

                  </div>
              </div>
          </div>
        </#list>

    </div>
</div>
<script src="home_.js"></script>
<link rel="stylesheet" type="text/css"
      href="css/home.css" />
</@p.publicTemplate>
