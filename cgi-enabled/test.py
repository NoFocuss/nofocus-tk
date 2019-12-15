#!/usr/bin/python3.7



import cgitb
cgitb.enable()
import sys
sys.path.insert(0, "/home/ubuntu/nofocus-tk/cgi-enabled")
import elem
print("Content-Type: text/html")
print("")

head = []

head.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"./../style.css\">")
head.append(elem.createElem("title", "none", "test.py"))
content = ""
for element in head:
	content+=element
print(elem.createElem("head", "none", content))

