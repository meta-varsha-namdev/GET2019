class Stack
 {
    constructor()
    {
        this.elements=[];
    }

    pushElement(element)
    {
        this.elements.push(element);
        this.display();
    }

    popElement()
    {
        if(this.elements.length==0)
        {
            document.getElementById("value").innerHTML="Stack:Underflow";
        }
        else
        {
        this.elements.pop();
        this.display();
        }
        
    }

    display()
    {

        var str = "Stack:"; 
        for(var i = 0; i < this.elements.length; i++) 
            str += this.elements[i] +" "; 

        document.getElementById("value").innerHTML=str;
    }

}

var stack=new Stack();

function addStackElement()
{
    stack.pushElement(document.getElementById("inputStack").value);
    document.getElementById("inputStack").value="";
}

function deleteStackElement()
{
    stack.popElement();
}