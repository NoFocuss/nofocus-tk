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
body = Element("body", True)
form = Element("form", True)
us = Element("input", False)
us.attributes={"id":"username", "type":"text", "placeholder":"Username"}
pw = Element("input", False)
pw.attributes={"id":"password", "type":"password", "placeholder":"Password"}
br = Element("br", False)
div_auth = Element("div", True)
div_auth.attributes={"id":"auth", "class":"auth_wrapper"}

div_auth2 = Element("div", True)
div_auth2.attributes={"id":"auth_form"}
s = Structure()


s.stack(head.open())
s.stack(body.open())
s.stack(csslink.line())
s.stack(title.line())
s.stack(head.close())
s.stack(div_auth.open())
s.stack(div_auth2.open())
s.stack(form.open())
s.stack(us.line())
s.stack(br.line())
s.stack(pw.line())
s.stack(form.close())
s.stack(div_auth2.close())
s.stack(div_auth.close())
s.stack(body.close())
print(s.printStack())
