#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define TAM 2
typedef struct
{
    char nome[50];
    int depen;
    int horas;
} funcionario;

int main()
{
    int i, Bruto, Liquido, Bruto_total, Desconto_total;
    funcionario Empresa[TAM];
    for (i=0; i<TAM; i++)
    {
        printf("Funcionario[%d]\nNome:",i);
        scanf("%s", &Empresa[i].nome);
        printf("N de dependentes:");
        scanf("%d", &Empresa[i].depen);
        printf("Horas trabalhadas:");
        scanf("%d", &Empresa[i].horas);
    }
    for (i=0; i<TAM; i++)
    {
        Bruto = 100*Empresa[i].horas + 125.55*Empresa[i].depen;
        Liquido = Bruto*0.78;
        printf("\nNome:%s", Empresa[i].nome);
        printf("\nSalario bruto: R$ %d", Bruto);
        printf("\nSalario liquido: R$ %d", Liquido);
        printf("\nDesconto: R$ %d",  Bruto - Liquido);
        Bruto_total =  Bruto_total + Bruto;
        Desconto_total = Bruto - Liquido + Desconto_total;
    }
    printf("\nTotal de funcionarios = %d", TAM);
    printf("\nTotal de salarios = R$ %d", Bruto_total);
    printf("\nTotal de descontos = R$ %d", Desconto_total);
}
