arrayDeNomes = ['joao', 'marcello', 'carla', 'fernanda']

function maiorNome(arrayDeNomes) {

  if (arrayDeNomes.length == 0) return undefined;

  var maior = arrayDeNomes[0];
  for (let i = 1; i < arrayDeNomes.length; i++) {
    if (maior.length < arrayDeNomes[i]) {
      maior = arrayDeNomes[i];
    }
  }
}