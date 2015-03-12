<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Electron product list">
<form name="delivery" action="checkout" method="post">

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Customer Details</h3>
    </div>
    <div class="panel-body">


        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="Enter name" required />
        </div>
        <div class="form-group">
        <label for="address">Address</label>
        <textarea class="form-control" rows="3" name="address" id="address" placeholder="Enter Address" required></textarea>
        </div>

        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" name="email" id="email" placeholder="Enter email" required />
        </div>
    </div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Payment Options</h3>

    </div>
    <div class="panel-body" required>
        <label class="radio-inline">
            <input type="radio" name="paymentmode" id="cod" value="cod" checked required > Cash on Delivery
        </label>
        <label class="radio-inline">
            <input type="radio" name="paymentmode" id="creditcard" value="creditcard" > Credit Card
        </label>
      </div>
    </div>
    <button type="submit" class="btn btn-default"><strong>Check Out</strong></button>
</form>


</@p.publicTemplate>

