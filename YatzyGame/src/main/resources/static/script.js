
// Funksjon som kalles når knappen trykkes
function trillTerninger(){
    // Henter terningene ved å kalle Java-metoden
    var terninger = Java.trillTerninger();

    // Oppdaterer terningene på siden
    var terningDiv = document.getElementById("terningDiv");
    // Sletter alt som er i terningDiv
    terningDiv.innerHTML = "";

    for(var i = 0; i < terninger.length; i++){
        var terning = terninger[i];
        var terningElement = document.createElement("p");
        terningElement.innerText = "Terning " + (i + 1) + ": " + terning.verdi;
        terningDiv.appendChild(terningElement);
    }

    console.log();
}
