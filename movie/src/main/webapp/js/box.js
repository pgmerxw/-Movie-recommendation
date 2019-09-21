 $(function(){
        var wjx_none = '☆'; // 空心五角星
        var wjx_sel = '★'; // 实心五角星
 
        //鼠标移进变实星
        $(".comment li").on("mouseover",function(){
            $(this).text(wjx_sel).prevAll("li").
            text(wjx_sel).end().nextAll().text(wjx_none);
        	$("#aaa").val($(this).val());
            
        });
 
        //鼠标移出变空星
        $(".comment li").on("mouseout",function(){
           if($("li.current").length === 0){
                $(".comment li").text(wjx_none);
           }else{
               $("li .current").text(wjx_sel).prevAll().text(wjx_sel).end().nextAll().text(wjx_none);
           }
        });
 
        //鼠标点击保持当前状态
        $(".comment li").on("click",function(){
            $(this).attr("class","current").siblings().removeClass("current");
            
        	$("#aaa").val($(this).val());
            //alert($(this).val());
        });
 
 
    });