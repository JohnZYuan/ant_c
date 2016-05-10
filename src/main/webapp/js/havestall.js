function carport(unitname,sx,sy,ex,ey){
	this.unitname = unitname;
	this.sx = sx;
	this.sy = sy;
	this.ex = ex;
	this.ey = ey;
}

var carport1 = new carport("第一单元",1,1,3,3);
var carport2 = new carport("第二单元",1,5,3,8);
var carport3 = new carport("第三单元",5,5,8,8);
var cp = new Array(carport1,carport2,carport3);

function displayCurrentStallStatus(){
	var url = "url(" + "img/car.jpg" + ")";
	for(var i = 0;i < cp.length;i++){
		//实际上每个页面都对应一个表(不共用),但是数据是共同的
		simulateCarportCondition(mytable,cp[i].unitname,cp[i].sx,cp[i].sy,cp[i].ex,cp[i].ey,url);
	}
	mytable.rows[0].cells[0].style.backgroundImage = "";
	mytable.rows[2].cells[7].style.backgroundImage = "";
	mytable.rows[7].cells[4].style.backgroundImage = "";
	mytable.rows[7].cells[7].style.backgroundImage = "";
	document.getElementById("totalstall").innerHTML = total - 4;
}