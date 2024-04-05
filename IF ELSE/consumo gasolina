// Escreva um algoritmo em pseudocódigo que leia a distancia em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso, calcule o consumo em Km/l e apresenteuma mensagem de acordo com a tabela abaixo
#include <stdio.h>

int main() {
    
    float litros, distancia, consumo;
    
    printf("Qual a distância em quilometros?");
    scanf("%f", &distancia);
    
    printf("Qual a quantidade de litros consumidos?");
    scanf("%f", &litros);
    
    consumo = distancia / litros;
    
    if(consumo <= 8){
        printf("Venda seu carro");
    }
    else if(consumo >= 8 && consumo <= 14){
        printf("Econômico");
    }
    else if(consumo >= 14){
        printf("O carro é super econômico");
    }

    return 0;
}
