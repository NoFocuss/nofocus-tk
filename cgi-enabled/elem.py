

class Element():

	def __init__(self, tag, needs_close):
		self.tag = tag
		self.needs_close = bool()
		self.attributes = {}
		self.content = ""




	def open(self):
		output = (f"<{self.tag} ")

		if bool(self.attributes) == True:
			for attr in self.attributes:
				output += str(attr)
				output += "=\""+self.attributes[attr]+"\" "

		output += ">"
		return output


	def close(self):
		output = ""
		if self.content:
			output += self.content
		output += (f"</{self.tag}>")
		return output


	def __str__(self):
		output=open(self)
		if self.needs_close:
			output += close(self)
		return str(output)
