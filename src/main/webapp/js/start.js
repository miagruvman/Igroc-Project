//$(document).ready(function () {


$(document).ready(function() {

    var fullname = $('#fullname');
    var fullname_warn = $('#fullname_warn');

    var email = $('#email');
    var email_warn = $('#email_warn');

    fullname.focus(function(){
        fullname_warn.removeClass('goodtogo');
        fullname_warn.addClass('warning');
        fullname_warn.html("Cannot be blank");

        fullname.blur(function(){
            fullname_warn.removeClass('warning');
            fullname_warn.addClass('goodtogo');
            fullname_warn.html("&nbsp;");
        });
    });

    email.focus(function(){
        email_warn.removeClass('goodtogo');
        email_warn.addClass('warning');
        email_warn.html("Cannot be blank");

        email.blur(function(){
            email_warn.removeClass('warning');
            email_warn.addClass('goodtogo');
            email_warn.html("&nbsp;");
        });
    });

});
//    $("#contactformbutton").click(function ()
//    {
//        alert('button clicked');
//    });

//    var name_js = $('#name-js');
//    var name_warn = $('.sr-only');
//    var email_js = $('#email-js');
//    var email_warn = $('.sr-only');
//
//    fullname.focus(function(){
//        name_warn.removeClass('goodtogo');
//        name_warn.addClass('warning');
//        name_warn.jsp("Cannot be blank");
//
//        fullname.blur(function(){
//            name_warn.removeClass('warning');
//            name_warn.addClass('goodtogo');
//            name_warn.jsp(" ");
//        });
//    });
//
//    email.focus(function(){
//        email_warn.removeClass('goodtogo');
//        email_warn.addClass('warning');
//        email_warn.jsp("Cannot be blank");
//
//        email.blur(function(){
//            email_warn.removeClass('warning');
//            email_warn.addClass('goodtogo');
//            email_warn.jsp(" ");
//        });
//    });
//
//});


