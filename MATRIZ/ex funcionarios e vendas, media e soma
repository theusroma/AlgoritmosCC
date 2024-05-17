/*Escreva um programa que receba o valor de 3 vendas de 5 funcionários, armazene os valores em
uma matriz, e utilizando estrutura de repetição, apresente na tela a somatória e a média das vendas
de cada funcionário.*/

#include <stdio.h>
int main (){

int soma[5] = {0, 0, 0, 0, 0};
float media[5] = {0, 0, 0, 0, 0};
int m[5][3], i, j, venda[5][3] = {10, 20, 30,
                                  40, 50, 60,
                                  70, 90, 11,
                                  22, 33, 44,
                                  55, 66, 77
};
char nome[5][30] = {"matheus","lucas","andre","pedro","gabriel"};



    for(i=0; i<5; i++){
        printf("\nNome: %s", nome[i]);
        for(j=0; j<3; j++){
            printf("\nVenda: %d", venda[i][j]);
        }
        printf("\n");
}

    for(i=0; i<5; i++){
      for(j=0; j<3; j++){
          soma[i] = soma[i] + venda[i][j];
      }
}

    
    for(i=0; i<5; i++){
        printf("\nA soma das vendas do %s são de: %d", nome[i], soma[i]);
    }    
    
    for(i=0; i<5; i++){
        printf("\nA média das vendas do %s são de: %d", nome[i], soma[i] / 3);
    }    
  
return 0;
}

/*
    for(i=0; i<5; i++){
        printf("\nDigite o nome do funcionário: ");
        scanf("%s", &nome[i]);
        for(j=0; j<3; j++){
            printf("Digite o valor da venda: ");
            scanf("%d", &venda[j]);
        }
}*/
