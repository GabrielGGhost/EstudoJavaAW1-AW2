var lastHilightedMenu = null;

function menuHightligt(menuIndex){
	menuDisapear();
	var myDiv = document.getElementById("menu" + menuindex);
	
	//armazena qual o item de menu foi selecionado
	lastHilightedMenu = myDiv;
	myDiv.style.display="block";
}

function menuDisappear(){
	//retorna true se diferente de null ou undefined
	
	if(lastHilightedMenu){
		lastHilightedMenu.style.display="none";
	}
}