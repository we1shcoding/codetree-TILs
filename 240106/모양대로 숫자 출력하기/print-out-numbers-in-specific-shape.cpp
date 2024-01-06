#include <stdio.h>

int main() {

    int n,i,j,k;

    scanf("%d", &n);

    for(i=0; i<n; i++){
        for(k=0; k<=2*i-1; k++){
            printf(" ");
        }
        for(j=n; j>i; j--){
            printf("%d ", j - i);
        }


        printf("\n");
    }
    // 여기에 코드를 작성해주세요.
    return 0;
}