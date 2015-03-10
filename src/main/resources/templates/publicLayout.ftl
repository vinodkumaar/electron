<#macro page title>
    <html>
        <head>
            <title>${title?html}</title>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"/>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        </head>
        <body>
        <!-- header section -->
            <nav class="navbar navbar-inverse navbar-fixed-top">
              <div class="container">
                <div class="navbar-header">
                  <a class="navbar-brand" href="#">Electon</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                  <ul class="nav navbar-nav">
                    <li class="active"><a href="/home">Home</a></li>
                  </ul>
                </div><!--/.nav-collapse -->
              </div>
            </nav>
        <!-- end of header section -->
        <#nested/>
        <!-- footer section -->
        </body>
    </html>
</#macro>