let nota1 = Number(prompt("Nota 1:"));
let nota2 = Number(prompt("Nota 2:"));
let nota3 = Number(prompt("Nota 3:"));
let nota4 = Number(prompt("Nota 4:"));

let media = (nota1 + nota2 + nota3 + nota4) / 4;

console.log("Média: " + media);

if (media >= 70) {
    console.log("Aprovado");
} else if (media >= 50) {
    console.log("Recuperação");
} else {
    console.log("Reprovado");
}
