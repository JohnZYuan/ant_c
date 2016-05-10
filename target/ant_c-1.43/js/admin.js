var total = 0;
var available = 0;
var totalSpan = document.getElementById("totalstall");
var availableSpan = document.getElementById("availablestall");
var distributeSpan = document.getElementById("distributestall");
var mytable;
//自动创建车库表格
function autoCreateTable(){
	var table = document.createElement("table");
	table.setAttribute("id","displaycarportstatustable");
	table.style.border = "1px solid #fff";
	table.style.width = "auto";
	table.style.height = "auto";
	table.style.position = "relative";
	var line = 40;
	var list = 20;
	for(var i = 1;i <= line;i++){
		//创建tr
		var tr = document.createElement("tr");
		for(var j = 1;j <= list;j++){
			//在表格行中添加td
			tr.appendChild(createTd());
		}
		table.appendChild(tr);
	}
	mytable = table;
	document.getElementById("currentParkingStatus").appendChild(table);
}

//创建td
function createTd(){
	var td = document.createElement("td");
	setStyleAndListener(td);
	return td;
}

//为td设置样式和监听事件
function setStyleAndListener(td){
	td.style.width = "30px";
	td.style.height = "30px";
	td.style.backgroundImage = "";
	td.style.backgroundColor = "#ccc";
	td.style.padding = "3px";
	td.style.border = '3px solid #9c3';
	//手动控制车位使用情况
	td.onclick = function(){
		setColumnDetail(this);
		totalSpan.innerHTML = total;
		//available = total;
		availableSpan.innerHTML = available;
	}
}

function setColumnDetail(column){
	if(column.style.backgroundImage != ""){
		column.style.backgroundImage = "";
		total -= 1;
	}
	//else{
	//	column.style.backgroundImage = "url(" + "img/car.jpg" + ")";
	//	total += 1;
	//}
}

//增加车库
function addCarport(){
	//弹出一个对话框，选择车库所属单元，行，列
	var dialog = document.getElementById("fillincarportinfo");
	var confirm = document.getElementById("confirm");
	dialog.style.display = "block";
	confirm.onclick = function(){
		complete(this.parentNode);
	}
}

//提交车库信息
function complete(dialog){
	dialog.style.display = "none";
	var unitname = document.getElementById("unitname").value;
	var sx = document.getElementById("s_x").value;
	var sy = document.getElementById("s_y").value;
	var ex = document.getElementById("e_x").value;
	var ey = document.getElementById("e_y").value;
	carportItem(unitname,sx,sy,ex,ey);
	//清空对话框中的内容
	clearDialog(document.getElementById("unitname"),document.getElementById("s_x"),document.getElementById("s_y"),document.getElementById("e_x"),document.getElementById("e_y"));
}

//增加车库项
function carportItem(unitname,sx,sy,ex,ey){
	var table = document.getElementById("carporttable");
	var tr = document.createElement("tr");
	//在content-1-1动态生成的表格
	var displayCarportStatusTable = document.getElementById("displaycarportstatustable");
	for(var i = 1;i <= 6;i++){
		var td = document.createElement("td");
		if(i != 6){
			switch(i){
				case 1:
					td.innerHTML = unitname;
				break;
				case 2:
					td.innerHTML = sx;
				break;
				case 3:
					td.innerHTML = sy;
				break;
				case 4:
					td.innerHTML = ex;
				break;
				case 5:
					td.innerHTML = ey;
				break;
			}
		}else{
			td.innerHTML = '<input type="button" value="删除车库" class="delete" />';
			td.onclick = function(){
				deleteCarport(table,tr,displayCarportStatusTable);
			}
		}
		tr.appendChild(td);
	}
	table.appendChild(tr);
	
	clearDialog(unitname,sx,sy,ex,ey);
	//在content-1-1动态生成的表格中根据sx,sy,ex,ey选择车库，并分配对应的单元名
	simulateCarportCondition(displayCarportStatusTable,unitname,sx,sy,ex,ey,"url(" + "img/car.jpg" + ")");
}

//在表格中模拟车库实况
//理想状态下，当增加车库时，它周围的一圈单元格都不能使用，它下方的一块区域(下面一行中的一部分区域)被合并用来显示所属单元
//当删除车库时，它连同周围一圈区域都可以被使用，将原来被合并的单元格拆分成单个的单元格
//当url == ""时，为删除车库,否则为增加车库
function simulateCarportCondition(table,unitname,sx,sy,ex,ey,url){
	var _sx = sx - 1,_sy = sy - 1,_ex = ex - 1,_ey = ey - 1;
	var amount = 0;
	if(url != ""){
		for(var i = _sx;i <= _ex;i++){
			for(var j = _sy;j <= _ey;j++){
				table.rows[i].cells[j].style.backgroundImage = url;
			}
		}
		total += (ex - sx + 1) * (ey - sy + 1);
		addUnitNumberForCarport(table,unitname,_sx,_sy,_ex,_ey);
	}else{
		amount = countAmountOfUsableStall(table,_sx,_sy,_ex,_ey);
		for(var i = _sx;i <= _ex;i++){
			for(var j = _sy;j <= _ey;j++){
				table.rows[i].cells[j].style.backgroundImage = url;
			}
		}
		total -= amount;
		deleteUnitNumberForCarport(table,_sx,_sy,_ex,_ey);
	}
	document.getElementById("totalstall").innerHTML = total;
	//available = total;
	document.getElementById("availablestall").innerHTML = available;
}

//计算车库已用车位
function countAmountOfUsableStall(table,_sx,_sy,_ex,_ey){
	var amount = 0;
	for(var i = _sx;i <= _ex;i++){
		for(var j = _sy;j <= _ey;j++){
			if(table.rows[i].cells[j].style.backgroundImage != ""){
				amount += 1;
			}
		}
	}
	return amount;
}
/* 合并单元格 -- 考虑到复杂度，不去合并单元格
//为模拟的车库添加单元号
function addUnitNumberForCarport(table,unitname,_sx,_sy,_ex,_ey){
	var u_sx = _ex + 1,
		u_sy = _sy;
		u_ex = _ex + 1;
		u_ey = _ey;
	for(var i = u_sy + 1;i <= u_ey;i++){
		table.rows[u_sx].deleteCell(i);
	}
	
	table.rows[u_sx].cells[u_sy].colSpan = (u_ey - u_sy + 1);
	table.rows[u_sx].cells[u_sy].innerHTML = unitname;
}

//删除与车库匹配的单元号
function deleteUnitNumberForCarport(table,_sx,_sy,_ex,_ey){
	var u_sx = _ex + 1,
		u_sy = _sy;
		u_ex = _ex + 1;
		u_ey = _ey;
	table.rows[u_sx].deleteCell(u_sy);
	for(var i = u_sy;i <= u_ey;i++){
		var td = table.rows[u_sx].insertCell(i);
		setStyleAndListener(td);
	}
}
*/

//不合并单元格
//为模拟的车库添加单元号
function addUnitNumberForCarport(table,unitname,_sx,_sy,_ex,_ey){
	
	//在table中创建一个绝对定位的label
	var absolutelabel = document.createElement("label");
	absolutelabel.style.position = "absolute";
	absolutelabel.style.zIndex = "100";
	absolutelabel.style.top = (_ex + 1) * 30 + 2 + "px";
	absolutelabel.style.left = _sy * 30 + 2 + "px";
	absolutelabel.style.backgroundColor = "#ccc";
	absolutelabel.style.width = (_ey - _sy) * 30 + 27 + "px";
	absolutelabel.style.height = "27px";
	absolutelabel.style.lineHeight = "27px";
	absolutelabel.style.overflow = "hidden";
	absolutelabel.innerHTML = unitname;
	table.rows[_ex].cells[_sy + 1].appendChild(absolutelabel);
}

//删除与车库匹配的单元号
function deleteUnitNumberForCarport(table,_sx,_sy,_ex,_ey){
	table.rows[_ex].cells[_sy + 1].removeChild(table.rows[_ex].cells[_sy + 1].childNodes[0]);
}

//清空对话框中的内容
function clearDialog(unitname,sx,sy,ex,ey){
	unitname.value = "";
	sx.value = "";
	sy.value = "";
	ex.value = "";
	ey.value = "";
}

//删除车库
function deleteCarport(table,tr,displayCarportStatusTable){
	var s_x = tr.cells[1].innerHTML,
		s_y = tr.cells[2].innerHTML,
		e_x = tr.cells[3].innerHTML,
		e_y = tr.cells[4].innerHTML;
	table.removeChild(tr);
	//在表格中"删除"车库
	simulateCarportCondition(displayCarportStatusTable,"",s_x,s_y,e_x,e_y,"");
}

//分配车位
function distributeCarport(){
	//在distributeSpan中能够显示车位信息
	//并且在模拟表格中使用闪烁边框显示车位
	distributeSpan.innerHTML = "(3,3)";
}