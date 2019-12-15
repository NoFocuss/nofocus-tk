#!/usr/bin/python3.7



import cgitb
cgitb.enable()
import sys
sys.path.insert(0, "/home/ubuntu/nofocus-tk/cgi-enabled")
import elem
print("Content-Type: text/html")
print("")
n = ""
head = []

head.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"./../style.css\">")
head.append(elem.createElem("title", None, "test.py"))

content = ""
for element in head:
	content+=element
print(elem.createElem("head", None, content))

print(elem.openElem("form"))
print(elem.openElem("input", (f"{attr("id", "username")} {attr("type", "text")}")))

print(elem.openElem("input", (f"{attr("id", "pw")} {attr("type", "password")}")))

print(elem.closeElem("form"))
print(elem.createElem("p", None, "test"))
