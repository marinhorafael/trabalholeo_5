function valida() {
	var i;
	var j;
	var msgerr;
	var x = document;
	var txt = '';
	
	for (i = 0; i < x.length; i++) {
		if(x.elements[i].value == ''){
			j = document.forms[0][i].name;
			msgerr = ('Preencha o campo ' + j + '. Não é permitida a entrada vazia!\n' );
			txt = txt + msgerr;
		}
	}
	
	if (txt != ''){
		alert(txt);
		return false;
	}
}

function retornaZero() {
/*	var i;
	var j;
	var msgerr;
	var x = document;
	var txt = '';
	
	for (i = 0; i < x.length; i++) {
		if(x.elements[i].value == ''){
			j = document.forms[0][i].name;
			msgerr = ('Preencha o campo ' + j + '. Não é permitida a entrada vazia!\n' );
			txt = txt + msgerr;
		}
	}
	
	if (txt != ''){
		alert(txt);
		return false;
	}
*/
return 0
}