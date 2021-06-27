#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct
{
    int cartao;
    int aposta[6];
} apostador;
int main()
{
    int A[6],i,j,acertos;
    apostador jogo[5];
    for (i=0; i<6; i++)
    {
        printf("A[%d] =",i+1);
        scanf("%d",&A[i]);
    }
    for (i=0; i<5; i++)
    {
        printf("Jogador [%d]\nCartao =",i+1);
        scanf("%d",&jogo[i].cartao);
        for (j=0; j<6; j++)
        {
            printf("Numero[%d]=",j+1);
            scanf("%d",&jogo[i].aposta[j]);
        }
    }
    for (i=0; i<5; i++)
    {
        acertos=0;
        for (j=0; j<6; j++)
        {
            if(jogo[i].aposta[j]=A[j])
            {
                acertos++;
            }
        }
        printf("Jogador %d acertou %d numeros.\n", i+1, acertos);
    }

}
