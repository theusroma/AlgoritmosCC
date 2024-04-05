#include <stdio.h>

int main() {
    
    float salario, tempo, novosalario, bonus, total;
    
    printf("Qual o valor do salário atual? ");
    scanf("%f", &salario);
    
    printf("Qual o tempo de serviço? ");
    scanf("%f", &tempo);
    
    if(salario <= 500){
        novosalario = salario + (salario * 0.25);
    }
    else if(salario >= 501 && salario <= 1000){
        novosalario = salario + (salario * 0.20);
    }
    else if(salario >= 1001 && salario <= 1500){
        novosalario = salario + (salario * 0.15);
    }
    else if(salario >= 1501 && salario <= 2000){
        novosalario = salario + (salario * 0.10);
    }
    else if(salario >= 2001){
        novosalario = salario;
    }
    
    if(tempo < 1){
        bonus = 0;
        total = novosalario + bonus;
    }
    else if(tempo >= 1 && tempo <= 3){
        bonus = 100;
        total = novosalario + bonus;
    }
    else if(tempo >= 4 && tempo <= 6){
        bonus = 200;
        total = novosalario + bonus;
    }
    
    else if(tempo >= 7 && tempo <= 10){
        bonus = 300;
        total = novosalario + bonus;
    }
    
    else if(tempo >= 11){
        bonus = 500;
        total = novosalario + bonus;
    }
    
    printf("Salário: %.3f \n", salario);
    printf("Novo salário: %.3f \n", novosalario);
    printf("Bônus: %.3f \n", bonus);
    printf("Total: %.3f \n", total);

    return 0;
}
