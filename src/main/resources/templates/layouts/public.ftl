<#macro publicTemplate title>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>${title}</title>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css"/>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"/>
            <link rel="stylesheet" href="css/home.css"/>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
            <script src="common.js"></script>

        </head>
        <body role="document">
        <!-- header section -->
            <!-- Fixed navbar -->
                <nav class="navbar navbar-inverse navbar-fixed-top">
                  <div class="container">
                    <div class="navbar-header">
                      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                      </button>
                      <a class="navbar-brand" href="/">Electron <span class="glyphicon glyphicon-home" aria-hidden="true"></span></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                      <ul class="nav navbar-nav navbar-right">
                          <li ><a href="/cart">Cart <span class="glyphicons glyphicons-shopping-cart"></span></span><span id="cart_quantity" class="badge"></span></a></li>
                          <li ><a href="/checkout">Checkout <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span></a></li>
                      </ul>
                    </div><!--/.nav-collapse -->
                  </div>
                </nav>
        <!-- end of header section -->
        <div class="container theme-showcase" role="main" style="margin-top:5em">
            <#nested/>
        </div>
        <!-- footer section -->
        </body>
    </html>
</#macro>