function init(){

	var select = document.getElementById('choosetype');
	var type = select.value;//原始选项--住户
	var cname = document.getElementById('cname');
	var caddress = document.getElementById('caddress');
	//登录
	document.getElementById('loginbtn').addEventListener('click',function(){
		login();
	});
	
	//注册
	document.getElementById('registerbtn').addEventListener('click',function(){
		register(type);
	});
	
	select.onchange = function(){
		var newtype = document.getElementById('choosetype').value;
		if(type == newtype){
			cname.style.display = 'none';
			caddress.style.display = 'none';
		}else{
			cname.style.display = 'block';
			caddress.style.display = 'block';
		}
	}
}


			
function login(){
	var username = document.getElementById('username').value;
	var password = document.getElementById('password').value;
	var form = document.getElementById('loginform');//根据登录人员的用户名，选择登录页面
	if(username == "user"){//默认
		//跳转到网站首页
	}else if(username == "xfy" && password == "123"){
		//跳转到管理员页面
		form.attributes['action'].value = "admin.html#content";
	}else if(username == "xxx" && password == "111"){
		//跳转到有车位的人的页面
		form.attributes['action'].value = "havestall.html#content";
	}else if(username == "xxx" && password == "222"){
		//跳转到无车位的人的页面
		form.attributes['action'].value = "havenostall.html#content";
	}
}

function register(type){
	if(type == '住户'){
	
	}else if(type == '管理员'){
		
	}
}