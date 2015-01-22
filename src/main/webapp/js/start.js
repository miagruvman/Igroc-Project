$(document).ready(function () {

    $(".webshop-item").click(function ()
    {
        var id = $(this).attr("id");

        $.ajax({
            type: "GET",
            url: "../igroc/shop/product?id=" + id
        }).success(function (e) {
            console.log("Funka");
            $("body").load("../igroc/shop/product?id=" + id);
        }).error(function (e) {
            console.log("Funka icke");
        });

    });

 $( "#contactformbutton" ).click(function() {
  console.log( "Handler for .click() called." );
});

    
//    $(function () {
//        $("#contactform").on('submit', function (e) {
//            alert('Du skrev in något');
//            var form = $("#contactform");
//            e.preventDefault();
//            $.ajax({
//                type: "POST",
//                url: "jersey-thymeleaf/igroc/contact",
//                data: form.serialize(),
//                success: function (data) {
//                    alert(data.toString());
//
//                }
//            });
//        });
//    });
});


  