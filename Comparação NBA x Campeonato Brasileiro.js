let pontosNBA = 200;
let tempoNBA = 48;

let golsBrasileirao = 2.53;
let tempoBrasileirao = 96;

let mediaNBA = pontosNBA / tempoNBA;
let mediaFutebol = golsBrasileirao / tempoBrasileirao;

let diferenca = mediaNBA / mediaFutebol;

console.log("Pontos por minuto na NBA: " + mediaNBA.toFixed(2));
console.log("Gols por minuto no Brasileirão: " + mediaFutebol.toFixed(4));
console.log("A NBA marca aproximadamente " + diferenca.toFixed(2) + " vezes mais pontos por minuto.");
