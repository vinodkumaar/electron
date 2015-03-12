<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Electron product list">

<div class="container">
    <div class="jumbotron">
        <h1>List of items</h1>

        <p>This is a template showcasing.</p>
    </div>
    <div class="row">

        <#list items as item>
          <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="panel">
                  <a class="thumbnail" href="/item/${item.id}">
                      <img class="img-responsive" src="http://demandware.edgesuite.net/sits_pod26/dw/image/v2/AASR_PRD/on/demandware.static/Sites-radioshack-Site/Sites-master-catalog/default/v1425981627437/images/02750232_00.jpg?sw=195&sh=195&sm=fit"
                           alt="Jumbotron example">
                  </a>
                  <h4>${item.name}</h4>

                  <p>Brief description of the product. It can be a couple of lines. Or little more.</p>

                  <div class="row">
                      <div class="col-xs-6">
                          <h4>Price : <span class="label label-danger">Rs. ${item.price}</span></h4>
                      </div>
                      <div class="col-xs-6">
                          <button class="btn btn-primary pull-right" onclick="addToCart('${item.id}')">Add to Cart</button>
                      </div>
                  </div>
              </div>
          </div>
        </#list>

    </div>
</div>
<script src="home_.js"></script>
</@p.publicTemplate>
