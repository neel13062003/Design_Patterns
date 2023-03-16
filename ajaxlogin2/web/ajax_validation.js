$(document).ready(function() {
    $('#userid').onchange('blur', function() {
        var userid = $(this).val();
        if(userid !== '') {
            $.ajax({
                url: 'ajax_validation.jsp',
                method: 'POST',
                data: {userid: userid},
                success: function(data) {
                    $('#userid-status').html(data);
                }
            });
        }
    });
});
