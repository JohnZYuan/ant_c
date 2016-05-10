window.addEventListener('load',function(){
	changeContent();
});

function changeContent(){
	$(".content").not("#content-1-1").hide();
	
	var ulOfNavi = $("#navigation").find("ul");
	var li_1 = ulOfNavi.eq(0).find("li").eq(0);
	li_1.click(function(){
		$(".content").filter("#content-1-1").show();
		$(".content").not("#content-1-1").hide();
	});
	
	var li_2 = ulOfNavi.eq(0).find("li").eq(1);
	li_2.click(function(){
		$(".content").filter("#content-2-1").show();
		$(".content").not("#content-2-1").hide();
	});
	
}