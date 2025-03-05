/* Altere o programa anterior para também declarar e inicializar um array que armazene o código de cada
funcionário (número inteiro positivo), e utilize estrutura de repetição para apresentar na tela uma lista numerada
contendo o código e o nome de cada funcionário da empresa.*/
#include <stdio.h>

int main() {

    int i, j, codigo[5];
    char nome[5][31];/* = {"Matheus Santos",
                        "Letícia Pacheco",
                        "Fernanda Bande",
                        "Sandy junior",
                        "Park Jimin"};*/
                        
    int codigos[5] = {   1020,
                         2030,
                         3020,
                         4030,
                         5040
    };
    
    int vendas[4][4];/* = { 1111, 1111, 1111, 1111,
                         2222, 2222, 2222, 2222,
                         3333, 3333, 3333, 3333,
                         4444, 4444, 4444, 4444};*/
                         
                         
    for(i=0; i<5; i++){
        printf("Digite o nome do funcionário: ");
        scanf("%s", nome[i]);
    }
    for(i=0; i<5; i++){
        printf("\n%d- %s", i + 1, nome[i]);
    }
    printf("\n");
    
   /* for(i=0; i<5; i++){
        printf("Digite o código do funcionário %d: ", i + 1);
        scanf("%d", &codigo[i]);
    }
    */
    for(i=0; i<5; i++){
        printf("\n%d- %s  %d", i + 1, nome[i], codigos[i]);
    }
    
    printf("\n\nVENDAS\n");
    
    for(i=0; i<4; i++){
        Digite 
    }
    
    for(i=0; i<4; i++){
        for(j=0; j<4; j++){
            printf("\nVenda %s: %d", nome[i], vendas[i][j]);
        }
        printf("\n");
    }
    
    

    return 0;
}
