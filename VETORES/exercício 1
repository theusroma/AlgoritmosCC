
#include <stdio.h>

int main() {

    int i, idades[5], maior, menor;
    
    //alimenta a estrututra
    for(i = 0; i < 5; i++){
        printf("Informe a idade [%d]: ", i);
        scanf("%d", &idades[i]);
    }
    
    //exibe as idades conforme digitadas na mesma ordem
    for(i = 0; i <5; i++){
        printf("\nIdade %d  = %d", i, idades[i]);
    }
    
    //apresente as idades em ordem inversa
    printf("\n\n\n\nApresente as idades em ordem inversa");
    for(i = 4; i >= 0; i--){
        printf("\nIdade %d  = %d", i, idades[i]);
    }
    
    //apresente as idades em grupos de pares e impares
    printf("\n\n\n\nApresente em grupos de pares");
    for(i = 0; i < 5; i++){
        if(idades[i] % 2 == 0){
            printf("\n %d", idades[i]);
        }
    }
    
    //apresente as idades em grupos de pares e impares
    printf("\n\n\n\nApresente em grupos de impares");
    for(i = 0; i < 5; i++){
        if(idades[i] % 2 == 1){
            printf("\n %d", idades[i]);
        }
    }
    maior = idades[1];
    menor = idades [1];
    //apresente o maior número
    printf("\n\n\n\nApresente o maior número");
    for(i = 0; i < 5; i++){
        if(idades[i] > maior){
            maior = idades[i];
        }
    }
    printf("\n%d", maior);
    
      //apresente o menor número
    printf("\n\n\n\nApresente o menor número");
    for(i = 0; i < 5; i++){
        if(idades[i] < menor){
            menor = idades[i];
        }
    }
    printf("\n%d", menor);
    return 0;
}
