#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	char nome[30];
	int idade;
	float peso;
	
	
	printf("Informe o seu primeiro nome: ");
	scanf("%29[^\n]", nome);
	
	printf("Informe a sua idade: ");
	scanf("%d", &idade);
	
	printf("Informe o seu peso: ");
	scanf("%f", &peso);
	
	printf("\nSeu nome é: %s", nome);
	printf("\nSua idade é: %d", idade);
	printf("\nO seu peso é: %.2f", peso);
	
	if(idade > 16 && idade < 69){
		if(peso > 50){
			printf("\nSeu nome é %s, Você está apto a doar sangue!", nome);
		}
		else{
			printf("\nSeu nome é %s, Você não está apto a doar sangue!", nome);
		}
	}
	else{
		printf("\nSeu nome é %s, você não está apto a doar sangue!", nome);
	}
	return 0;
}






	//printf("Seu nome é: %s, e o tamanho é %d.", nome, strlen(nome));
