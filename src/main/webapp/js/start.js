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

    $('#contactable').contactable({
        subject: 'A Feeback Message'
    });

});


  