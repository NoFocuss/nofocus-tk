
def ini():
	x = ("Content-Type: text/html\n")
	x+=""
	return str(x)


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

if __name__ != '__main__':
	print(ini())
	
