function init(){

	var select = document.getElementById('choosetype');
	var type = select.value;//ԭʼѡ��--ס��
	var cname = document.getElementById('cname');
	var caddress = document.getElementById('caddress');
	//��¼
	document.getElementById('loginbtn').addEventListener('click',function(){
		login();
	});
	
	//ע��
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
	var form = document.getElementById('loginform');//���ݵ�¼��Ա���û�����ѡ���¼ҳ��
	if(username == "user"){//Ĭ��
		//��ת����վ��ҳ
	}else if(username == "xfy" && password == "123"){
		//��ת������Աҳ��
		form.attributes['action'].value = "admin.html#content";
	}else if(username == "xxx" && password == "111"){
		//��ת���г�λ���˵�ҳ��
		form.attributes['action'].value = "havestall.html#content";
	}else if(username == "xxx" && password == "222"){
		//��ת���޳�λ���˵�ҳ��
		form.attributes['action'].value = "havenostall.html#content";
	}
}

function register(type){
	if(type == 'ס��'){
	
	}else if(type == '����Ա'){
		
	}
}