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

s = Structure()

s.stack(head.open())
s.stack(csslink.line())
s.stack(title.line())
s.stack(head.close())

print(s.printStack())
