#include <stdio.h>
#include <stdlib.h>


int main (){
	
	
	int linha, coluna, i, j, **p, soma;
	
	printf("Digite a quantidade de linhas: ");
	scanf("%d", &linha);
	printf("Digite a quantidade de colunas: ");
	scanf("%d", &coluna);

	p = (int **) malloc (linha * sizeof (int *));
	for ( i = 0; i < linha; i ++){
		p[i] = (int *) malloc (coluna * sizeof(int *));
		for ( j = 0; j < coluna; j ++){
			printf("Prencha a matriz: ");
			scanf("%d", &p[i][j]);
			soma += p[i][j];
			
		}
		}
		printf("%d", soma);
		
		for(i = 0; i < linha; i ++){
			free (p[i]);
		}
		free (p);
		
	}

