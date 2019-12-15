#!/usr/bin/python3.7



import cgitb

import sys
sys.path.insert(0, "/home/ubuntu/nofocus-tk/cgi-enabled")
from elem import *
print("Content-Type: text/html")
print("")


head = Element("head", True)
csslink = Element("Link", False)
csslink.attributes = { "rel":"stylesheet", "type":"text/css", "href":"./../style.css"}
title = Element("title", True)
title.content="test.py"
form = Element("form", True)
us = Element("input", False)
us.attributes={"id":"username", "type":"text"}
pw = Element("input", False)
pw.attributes={"id":"password", "type":"password"}
br = Element("br", False)

s = Structure()

s.stack(head.open())
s.stack(csslink.line())
s.stack(title.line())
s.stack(head.close())
s.stack(form.open())
s.stack(us.line())
s.stack(br.line())
s.stack(pw.line())
s.stack(form.close())

print(s.printStack())
