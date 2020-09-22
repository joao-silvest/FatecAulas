function calcular(){
    var horas = parseInt(document.getElementById('horas').value);
    var sal = parseFloat(document.getElementById('sal').value);

    var horast = sal/2;
    var salb = horas * horast;
    var imposto = salb * 0.03; 

    document.write("<h1>Salário a receber: " + (salb-imposto) + "</h1>");
}