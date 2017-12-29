
<html lang="en">
<head>
  <title>My LAZADUT Online Shop</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <style>
        .badge .badge-success {
            color: #337ab7;
            background-color: #fff;
          }
    </style>

<nav class="navbar navbar-inverse" >
    <a class="navbar-brand" href="#">
    <img src="https://cdn.shopify.com/s/files/1/2351/5779/t/19/assets/sticky_logo.png?7745581531723433983" width="30" height="30" alt="">
  </a>
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="${pageContext.request.contextPath}">LAZADUT</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/product/allproduct">Product</a></li>
        <li><a href="#">Costumer</a></li>
      </ul>
        <form class="navbar-form navbar-left" action="/action_page.php" style="margin-left:450px">
            <div class="input-group" class="container" >
                <input type="text" class="form-control col-md-10 col-lg-pull-1" style="width:-300px" placeholder="Cari produk" name="search" >
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit" style="margin-left:-11px">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
        </form>
      <ul class="nav navbar-nav navbar-right">
          <li>
              <a href="#"><span class="glyphicon glyphicon-shopping-cart" badge badge-success>${cart.carts.size()}</span> </a>
          </li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Daftar</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Masuk</a></li>
      </ul>
    </div>
  </div>
</nav>

</body>
</html>

