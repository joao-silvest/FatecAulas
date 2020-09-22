function calcular() {
    var idade = parseFloat(document.getElementById('idade').value);

    if (idade > 4 && idade < 8) {
        document.write("<h1>Categoria: Infantil A</h1>");
    } else if (idade > 7 && idade < 11) {
        document.write("<h1>Categoria: Infantil B</h1>");
    } else if (idade > 10 && idade < 14) {
        document.write("<h1>Categoria: Juvenil A</h1>");
    } else if (idade > 13 && idade < 18) {
        document.write("<h1>Categoria: Juvenil B</h1>");
    } else {
        document.write("<h1>Categoria: Senior</h1>")
    }
}