class Queue 
{
    constructor() 
    {
        this.elements=[];
    }

    enqueue(element)
    {
        this.elements.push(element);
        this.display();
    }

    Dequeue()
    {
        if(this.elements.length==0)
        {
            document.getElementById("demo").innerHTML="Queue:Underflow";
        }
        else
        {
            this.elements.shift();
            this.display();
        }
    }

    display()
    {

        var str = "Queue:"; 
        for(var i = 0; i < this.elements.length; i++) 
            str += this.elements[i] +" "; 

        document.getElementById("demo").innerHTML=str;
    }
}

var queue=new Queue();

function addElement()
{
    queue.enqueue(document.getElementById("inputQueue").value);
    document.getElementById("inputQueue").value="";
}

function deleteElement()
{
    queue.Dequeue();
}    
