#!/usr/bin/python3.7



import cgitb

import sys
sys.path.insert(0, "/home/ubuntu/nofocus-tk/cgi-enabled")
from elem import *
print("Content-Type: text/html")
print("")

structure = []

head = Element("head", True)
csslink = Element("Link", False)
csslink.attributes = { "rel":"stylesheet", "type":"text/css", "href":"./../style.css"}
title = Element("title", True)
title.content="test.py"
structure.append(head.open())
structure.append(csslink.open())
structure.append(title.open()+title.close())
structure.append(head.close())

content = ""
for element in structure:
	print(element)
