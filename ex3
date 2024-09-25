/*

Crie um programa em C para gerenciar um catálogo de produtos. Cada produto
deve ter um nome (string), um código (inteiro), uma descrição (string) e um preço
(float). O programa deve permitir ao usuário adicionar produtos ao catálogo e exibir
todos os produtos cadastrados. Utilize alocação dinâmica para armazenar os
produtos e permita que o usuário insira a quantidade desejada de produtos. Ao final,
o programa deve liberar a memória alocada.

*/
#include <stdio.h>
#include <stdlib.h>
struct Produto{	
	char nome[10];
	int codigo;
	char descricao[50];
	float preco;
	
};

int main(){
	
	int i; 
	int quantidade;
	
	printf("Digite a quantidade de produtos: ");
	scanf("%d", &quantidade);
	struct Produto *produto = (struct Produto *)malloc (quantidade * sizeof (struct Produto));
	
	for (i = 0; i < quantidade; i ++){
		
		printf("Digite o nome do %d° Produto: ", i + 1);
		scanf("%s", produto[i].nome);
		printf("Digite o codigo do %d° Produto: ", i + 1);
		scanf("%d", &produto[i].codigo);
		printf("Digite o descricao do %d° Produto: ", i + 1);
		scanf("%s", produto[i].descricao);
		printf("Digite o preco do %d° Produto: ", i + 1);
		scanf("%f", &produto[i].preco);
		
	}
	
		for (i = 0; i < quantidade; i ++){
		printf("==============================================\n");
		printf("%s\n", produto[i].nome);
		printf("%d\n", produto[i].codigo);
		printf("%s\n", produto[i].descricao);
		printf("%f\n", produto[i].preco);
		printf("==============================================");
		
	}

	
	
}


