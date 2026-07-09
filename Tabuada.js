let numero = Number(prompt("Digite um número:"));
let limite = Number(prompt("Até qual multiplicador deseja ver a tabuada?"));

for (let i = 1; i <= limite; i++) {
    console.log(numero + " x " + i + " = " + (numero * i));
}
