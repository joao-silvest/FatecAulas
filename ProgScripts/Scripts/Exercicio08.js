function verificar(){
    var voto = parseInt(document.getElementById('voto').value);

    var pre1 = 0;
    var pre2 = 0;
    var nulo = 0;
    var branco = 0;
    var qtd = 0;

    while(voto){

        switch (voto) {
            case 1:
                pre1++;
                qtd++;
                break;
            case 2:
                pre2++;
                qtd++;
                break;
            case 3:
                nulo++;
                qtd++;
                break;
            case 4:
                branco++;
                qtd++;
            default:
                break;
        }

        /*if(voto == 1){
            pre1++;
            qtd++;
        }else if(voto == 2){
            pre2++;
            qtd++;
        }else if(voto == 3){
            nulo++;
            qtd++;
        }else if(voto == 4){
            branco++;
            qtd++;
        }else{
            break;
        }*/
    }

    document.write("Candidato 1: " + (qtd/pre1) + "%");
    document.write("Candidato 2: " + (qtd/pre2) + "%");
    document.write("Votos nulos: " + (qtd/nulo) + "%");
    document.write("Votos em branco: " + (qtd/branco) + "%");


}