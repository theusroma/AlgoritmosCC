/*Escreva um programa que declare um array de inteiros e um ponteiro para inteiros. Associe o ponteiro ao array. Agora, some mais um a cada posição do array usando o ponteiro.*/

#include <stdio.h>
int main() {
   
   int v[5]={7, 2, 3, 4, 5};
   int *p, x, i;
   
   p = v;
   
   for(i=0; i<5; i++){
       printf("\n%d", p[i] + 1);
       }
   
    return 0;
}
