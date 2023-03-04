

var diceImages = {
    1: "images/1.png",
    2: "images/2.png",
    3: "images/3.png",
    4: "images/3.png",
    5: "images/5.png",
    6: "images/6.png",
  };


function displayDiceRolls() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "/trill-terninger");
    xhr.onreadystatechange = function() {
    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
        var diceRollsDiv = document.getElementById("trillTerninger");
        diceRollsDiv.innerHTML = xhr.responseText;
    }
    };
    xhr.send();
}


 // SPILLBRETTE
const gridContainer = document.querySelector('.grid-container');
    
for (let i = 1; i <= 190; i++) {
  const gridItem = document.createElement('div');
  gridItem.classList.add('grid-item');
  gridContainer.appendChild(gridItem);
}
