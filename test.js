function loadstuff()
{
$("#testing").attr("href","./testing/testing.html")
};
function start(){
var txt = '';
var xmlhttp = new XMLHttpRequest();


    

  xmlhttp.open("GET","abc.txt",true);
  txt = xmlhttp.responseText;
  xmlhttp.send();
  console.log(txt);
  txt += "js";
  $("#theSpan").text(txt);


};

function showAuthForm(){

	var box = $("#authform-wrapper")
	$("#signin").bind("click", function()
	{
		
			box.show();
		
	
	}
};
