function calcular() {
    var peso = parseFloat(document.getElementById('peso').value);
    var altura = parseFloat(document.getElementById('altura').value);

    var imc = peso / (altura * altura);

    if (imc <= 18.5) {
        document.write("<h1>Classificação: Magreza</h1>");
    } else if (imc >= 18.5 && imc <= 24.9) {
        document.write("<h1>Classificação: Normal</h1>");
    } else if (imc >= 25 && imc <= 29.9) {
        document.write("<h1>Classificação: Sobrepeso");
        document.write("<h2>Obesidade I</h2>");
    } else if (imc >= 30 && imc <= 39.9) {
        document.write("<h1>Classificação: Obesidade");
        document.write("<h2>Obesidade II</h2>");
    } else {
        document.write("<h1>Classificação: Obesidade Grave</h1>");
        document.write("<h2>Obesidade III</h2>");
    }

}