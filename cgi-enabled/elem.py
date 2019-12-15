
structure = []
class Element():

	def __init__(self, tag, needs_close):
		self.tag = tag
		self.needs_close = needs_close
		self.attributes = {}
		self.content = ""




	def open(self):
		output = (f"<{self.tag} ")

		if bool(self.attributes) == True:
			for attr in self.attributes:
				output += str(attr)
				output += "=\""+self.attributes[attr]+"\" "

		output += ">"
		return str(output)


	def close(self):
		output = ""
		if self.content:
			output += self.content
		output += (f"</{self.tag}>")
		return str(output)


	def line(self):
		output=str(self.open())
		if self.needs_close:
			output += str(self.close())
		return str(output)

class Structure():
	def __init__(self):
		self.structure = []

	def stack(self, value):
		self.structure.append(str(value))

	def printStack(self):
		for x in self.structure:
			print(str(x))
