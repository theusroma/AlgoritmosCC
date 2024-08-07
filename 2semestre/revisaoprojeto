#include <stdio.h>

#define QTD_FUNC 3

    typedef struct {
        int qtd_depend;
        double gratificacao;
        double salario_bruto;
        char usa_plano;
        char usa_valetr;
        double valor_valetr;
        double valor_plano;
    } funcionario;
    
        double calcula_valetr(double salario) {
        double salario_bruto_6p;
        double vale_transporte;
        
        salario_bruto_6p = salario * 0.06;
        vale_transporte = 44 * 4.50;
        
        //
        
        if(vale_transporte > salario_bruto_6p){
        vale_transporte = salario_bruto_6p;
        }   
        return vale_transporte;
    }

int main(void) {
    
    funcionario func[QTD_FUNC];
     // variaveis auxiliares
    double salario_bruto_6p;
    
    
    for (int i = 0; i < QTD_FUNC; i++){
    
    
    printf("Salario bruto: ");
    scanf("%lf", &func[i].salario_bruto);
    
    printf("Gratificaçao");
    scanf("%lf", &func[i].gratificacao);
    
    printf("Quantos de dependentes: ");
    scanf("%d", &func[i].qtd_depend);
    
    printf("Usa vale transporte? (S/N)");
    fflush(stdin);
    scanf("%c", &func[i].usa_valetr);
    
    printf("Usa plano de saúde? (S/N)");
    getchar();
    scanf("%c", &func[i].usa_plano);

    salario_bruto_6p = func[i].salario_bruto * 0.06;
    func[i].valor_valetr = 44 * 4.50;
    printf("6 porc: %lf vale transp: %lf", salario_bruto_6p, func[i].valor_valetr);
    
    // calculo do vale transporte, considerando o maximo
    // de 6% do salario bruto
    
    if((func[i].usa_valetr == 'S' || func[i].usa_valetr == 's')) {
        //se o funcionario recebe vale transporte, chamo a função que o calucula
        //passando por parâmetro o valor do salario bruto e
        //recebendo o valor do vale
        func[i].valor_valetr = calcula_valetr(func[i].salario_bruto);
    
} else {
    //se o funcionario nao recebe, o valor é 0
    func[i].valor_valetr = 0.0;
        }
    }
    for(int i = 0; i < QTD_FUNC; i++){
    printf("-----Funcionario %d-----", i);
    printf("Valor do salario bruto: %.2lf\n", func[i].salario_bruto);
    printf("Valor do vale transporte: %.2lf\n", func[i].valor_valetr);
    }
    return 0;
}

/*
    
    if((func.usa_valetr == 'S' || func.usa_valetr == 's')) {
    double salario_bruto_6p;
    
    if(func.valor_valetr > salario_bruto_6p){
        func.valor_valetr = salario_bruto_6p;
    }
} else {
    func.valor_valetr = 0.0;
}*/
