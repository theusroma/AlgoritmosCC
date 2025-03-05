// Faça um programa em C que leia o peso de um boxeador e informe a categoria a qual oboxeador pertence conforme a tabela a seguir
#include <stdio.h>

int main() {
    float morango, maca, valormorango, valormaca, valortotal, totalkg, total;
    
    printf("Quantos kgs de morango foram comprados? ");
    scanf("%f", &morango);
    
    printf("Quantos kgs de maça foram comprados? ");
    scanf("%f", &maca);
    
    if(morango <= 5){
       valormorango = morango * 6.50;
    }
    else if(morango > 5){
       valormorango = morango * 6.20;
    }
    
    if(maca <= 5){
        valormaca = maca * 3.80;
    }
    else if(maca > 5){
        valormaca = maca * 3.50;
    }
    
    valortotal = valormaca + valormorango;
    totalkg = maca + morango;
    total = valormorango + valormaca;
    
    if(valortotal >= 50 || totalkg >= 10){
        total = total * 0.10;
    }
   
    
    printf("\nA quantidade de quilos comprados de morango é de: %.2f kgs", valormorango);
    
    printf("\nA quantidae de quilos comprados de maca é de %.2f kgs", valormaca);
    
    printf("\nO valor a se pagar é de %.2f reais", valortotal - total);
    
    
    
    
    printf("\n %.2f", valortotal);
    
    return 0;
}
