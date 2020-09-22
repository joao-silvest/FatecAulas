function calcular(){
    var sal = parseFloat(document.getElementById('sal').value);
    var reajuste = 0;

    if(sal < 1000){
        reajuste = sal * 0.15;
        document.write("<h1>Reajuste: 15%</h1>");
        document.write("<h1>Novo salário: " + (sal+reajuste) + "</h1>");
    }else if(sal >=1000 && sal <= 1500){
        reajuste = sal * 0.10;
        document.write("<h1>Reajuste: 10%</h1>");
        document.write("<h1>Novo salário: " + (sal+reajuste) + "</h1>");
    }else{
        reajuste = sal * 0.05;
        document.write("<h1>Reajuste: 5%</h1>");
        document.write("<h1>Novo salário: " + (sal+reajuste) + "</h1>");
    }

}