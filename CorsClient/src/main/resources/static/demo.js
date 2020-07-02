

$(document).ready(function(){
      $ajax({
    	  url:"http://localhost:2323/PmsRest/products/101",
         
      }).then(function(data,status,xhr){
    	  
      Var obj=JSON.Parse(JSON.stringfy(data))
       $("#id1").html(obj.productid)
        $("#id2").html(obj.productname)
         $("#id3").html(obj.price)
          $("#id4").html(obj.manufacturer)
      });



});