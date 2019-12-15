
def ini():
	print("Content-Type: text/html")
	print("")



def createElem(tag, attr, content):

	output = (f"<{tag}")
	if attr == None:
		output+=">"
	else:
		output+=" " + str(attr) + ">"
	if content != None:
		output+=str(content)
	output += "</"+str(tag)+">"
	return output

def openElem(tag, attr):
	output = (f"<{tag}")
	if str(attr) != None:
		output+=(f"  {attr}>")
	else:
		output+=">"
	return output

def closeElem(tag):
	output=(f"</{tag}>")
	return output

def attr(name, value):
	name = str(name)
	value = str(value)
	output= (f"{name}=\"{value}\" ")
	return output
