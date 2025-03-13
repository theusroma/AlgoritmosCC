/*Crie um programa em C para registrar o tempo gasto em tarefas diferentes. O programa deve permitir ao usuário especificar o número de tarefas, 
inserir nomes de tarefas e o tempo gasto em cada uma. Use alocação dinâmica para armazenar as informações das tarefas e, no final, 
calcule o tempo total gasto e exiba as tarefas e o tempo gasto em cada uma.*/


#include <stdio.h>
#include <stdlib.h>


struct Tarefa{
	
	char nome_tar[50];
	int temp_gast;
};


int main(){
	
	
	int qtdTarefa, soma;
	
	printf("Digite o número de tarefas: ");
	scanf("%d", &qtdTarefa);
	
	struct Tarefa *tarefa = (struct Tarefa *)malloc (qtdTarefa * sizeof (struct Tarefa));
	
	for (int i = 0; i < qtdTarefa; i ++){
		printf("====================================\n");
		printf("Digite o nome da %dª tarefa: ", i + 1);
		scanf("%s", tarefa[i].nome_tar);
		printf("Digite o tempo gasto na %dª tarefa: ", i + 1);
		scanf("%d", &tarefa[i].temp_gast);
		printf("====================================");
		
		soma += tarefa[i].temp_gast;
		
	}
	printf("\n");
	printf("\n");
	printf("\n O tempo gasto em todas as tarefas é de: %d \n", soma);
	printf("\n");
	printf("\n");
	
		for (int i = 0; i < qtdTarefa; i ++){
		printf("====================================\n");
		printf("%s\n", tarefa[i].nome_tar);
		printf("%d\n", tarefa[i].temp_gast);
		printf("====================================");
		
		
	}
	
}
