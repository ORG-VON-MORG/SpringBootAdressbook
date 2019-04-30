$(document).ready(function () {
    $('#clickable tbody tr').click(function () {
       alert($(this).text());

       var test ="test"
       $("#firstname").val(test);

    });



});


