<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Cart">
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="row">
                    <div class="col-sm-3">
                        <img class="img-responsive" src="http://demandware.edgesuite.net/sits_pod26/dw/image/v2/AASR_PRD/on/demandware.static/Sites-radioshack-Site/Sites-master-catalog/default/v1425981627437/images/02750232_00.jpg?sw=195&sh=195&sm=fit">
                    </div>
                    <div class="col-sm-3">
                        <h4>Product Name</h4>
                        <div>
                            <h4>Price : <span class="label label-danger">Rs. <span id="price">200</span></span></h4>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <select name="quantity" id="quantity" onchange="calculatePrices()">
                            <#list 1..10 as count>
                                <option value="${count}" label="${count}"/>
                            </#list>
                        </select>
                    </div>
                    <div class="col-sm-3">
                        <h4 class="pull-right">Total : <span class="label label-danger">Rs.<span id="total">1200</span></span></h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="carte.js"></script>

</@p.publicTemplate>