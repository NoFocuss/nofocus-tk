
def ini():
	print("Content-Type: text/html")
	



def createElem(tag, attr, content):
	output = ""
	output += "<"+str(tag)
	if str(attr) == "none":
		output+=">"
	else:
		output+=" " + str(attr) + ">"
	output+=str(content)+"</"+str(tag)+">"

	return output

def openElem(tag, attr):
	output = ""
	output += "<"+str(tag)
	if str(attr) == "none":
		output+=">"
	else:
		output+=" " + str(attr) + ">"
	return output

def closeElem(tag):
	output=""
	output+= "</" + tag + ">"
	return output


