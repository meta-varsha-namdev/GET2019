function Function() {
    var string=prompt("Enter the string you want to repeat","hello");
    var number=prompt("Enter the number by which you want to repeat");
    document.getElementById("demo").innerHTML= string.repeat(number,0);
}