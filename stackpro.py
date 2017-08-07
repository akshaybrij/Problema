class Stack:
    def __init__(self):
        pass
    def createStack(self):
        stack=[]
        return stack
    def push(self,stack,str):
        stack.append(str)
    def isEmpty(self,stack):
        if size(stack)==0:
            return True;
    def pop(self,stack):
        if len(stack)==0:
            return
        else:
            return stack.pop()
stck=Stack();
stri="Hello"
n=len(stri)
stack=stck.createStack();
for i in stri:
    stck.push(stack,i)
string="";
for i in range(n):
   string+=stck.pop(stack);
print string
