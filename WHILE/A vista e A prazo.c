#include <stdio.h>

int main() {
    char codigo;
    float valor, total_vista = 0, total_prazo = 0, total_compras = 0;

    printf("Digite o codigo (V para vista, P para prazo, X para sair): ");
    scanf(" %c", &codigo);

    while (codigo != 'X') {
        printf("Digite o valor da transacao: ");
        scanf("%f", &valor);

        if (codigo == 'V') {
            total_vista += valor;
        } else if (codigo == 'P') {
            total_prazo += valor;
        } else {
            printf("Codigo invalido.\n");
        }

        total_compras += valor;

        printf("Digite o codigo (V para vista, P para prazo, X para sair): ");
        scanf(" %c", &codigo);
    }

    printf("Valor total das compras a vista: %.2f\n", total_vista);
    printf("Valor total das compras a prazo: %.2f\n", total_prazo);
    printf("Valor total das compras efetuadas: %.2f\n", total_compras);

    return 0;
}
