var res = (function(){
    return{
        connexion  : function(tipo, numero){
            var url = 'https://hidden-depths-06338.herokuapp.com/convertir/' + tipo + '/' + numero
            fetch(url, {
                mode: 'no-cors',
                method: 'GET',
                headers: {
                        "Content-type": "application/json",
                        'Access-Control-Allow-Origin': '*'
                         }
            })
                .then(response => response.json())
                .then(json => $('#Resultado').html(json.Resultado))
        }
    }
})();