
function start(){
var txt = '';
var xmlhttp = new XMLHttpRequest();


    var txt = xmlhttp.responseText;

  xmlhttp.open("GET","abc.txt",true);
  xmlhttp.send();
  console.log(xmlhttp.responseText)
  txt += "js";
  document.getElementById("theSpan").innerHTML = xmlhttp.responseText;


};
