#include <stdio.h>

int main() {
    
    int indiceum, indicedois, distancia, i, j;
    int matriz[4][4] = {0, 10, 8, 20,
                        10, 0, 25, 30,
                        0, 25,  0, 12,
                        20, 30, 12, 0};
                        
                        
    
    for(i=0; i<4; i++){
        for(j=0; j<4; j++){
            printf("%d  ", matriz[i][j]);
        }
        printf("\n");
    }
    
    
    printf("\nDigite o primeiro indíce: ");
    scanf("%d", &indiceum);
    
    
    printf("Digite o segundo indíce: ");
    scanf("\n%d", &indicedois);
    
    distancia = matriz[indiceum - 1][indicedois - 1];
    
    printf("A distância entre %d e %d é de %d", indiceum, indicedois, distancia);
    

    return 0;
}
