#include <stdio.h>

int main(){
	/*1. Escreva um programa em C que declare e inicialize um array para armazenar o nome completo de 5
		funcionários de uma empresa, com até 30 caracteres cada nome, e utilize estrutura de repetição para apresentar
		na tela uma lista numerada contendo o nome de todos os funcionários.
	*/
	char nomes[5][31] = {	"Fabricio Gabriel Olivo",
							"Michael Jackson Silva",
							"Arnaldo Antunes Oliver",
							"Marcia Renata",
							"Jaime Bernardo Cunha"
						};
	int i, j;
	
	printf("LISTA DE FUNCIONARIOS\n");
	for(i=0; i<5; i++){
		printf("\n  %d- %s", i+1, nomes[i]);
	}
	
	/*	2. Altere o programa anterior para também declarar e 
		inicializar um array que armazene o código de cada
		funcionário (número inteiro positivo), e utilize estrutura 
		de repetição para apresentar na tela uma lista numerada
		contendo o código e o nome de cada funcionário da empresa.
	*/
	int codigos[5] = {111, 222, 333, 444, 555};
	
	printf("\n\nLISTA DE CODIGOS E FUNCIONARIOS\n");
	for(i=0; i<5; i++){
		printf("\n  %d- %d %s", i+1, codigos[i], nomes[i]);
	}	
	
	/*	3. Altere o programa anterior para também declarar e 
		inicializar um array que armazene o valor de 4 vendas
		feitas por cada funcionário, e utilize estrutura de 
		repetição para apresentar na tela uma lista numerada 
		contendo o código, o nome, o valor de cada venda, e o 
		valor total das vendas (somatória) de cada vendedor
	*/
	
	int vendas[5][4]; /*= {	10,	10, 10, 10,
							20, 20, 20, 20,
							30, 30, 30, 30,
							40, 40, 40, 40,
							50, 50, 50, 50	
						};*/
	
	printf("\n\nINICIALIZACAO DAS VENDAS\n");
	for(i=0; i<5; i++){
		for(j=0; j<4; j++){
			printf("Venda[%d][%d]= ", i, j);
			scanf("%d", &vendas[i][j]);
		}
		printf("\n");
	}					
						
	int soma[5] = {0,0,0,0,0};
	int indice = 0, maior=0;
	printf("\n\nLISTA DE CODIGOS, FUNCIONARIOS E SOMATORIA\n");
	for(i=0; i<5; i++){
		printf("\n  %d- %d %s", i+1, codigos[i], nomes[i]);
		for(j=0; j<4; j++){
			soma[i] = soma[i] + vendas[i][j];
			printf("\n     Venda[%d][%d]: %d", i, j, vendas[i][j]);
		}
		printf("\n     Somatoria das vendas: %d\n", soma[i]);
		
		if(maior < soma[i])
		{
			maior = soma[i];
			indice = i;
		}	
	}
	printf("\n  Maior venda: %d- %d %s", indice+1, codigos[indice], nomes[indice]);
	
	/*	4. Altere o programa anterior para apresentar no fim das 
		listas o código e nome do vendedor com maior valor total
		de vendas.
	*/
	
	return 0;
}
