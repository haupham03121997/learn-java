// Khi nào html được hiển thị nôi dụng <=> window.onload

$(document).ready(function (){

        $(".btn-delete-user").on("click" , function (){
                var  userId = $(this).attr("data-id");
                var This = $(this);
                $.ajax({
                        method: "GET",
                        url: `http://localhost:8080/demoservlet/user/delete?id=${userId}`,
                })
                    .done(function( result ) {
                            This.closest("tr").remove();
                            console.log("Result " , result)
                    });
        })
})