#include <stdio.h>

int main(void) {
    int a = 0, b = 0;
    int small, big;
    char arr[100][100] = {};
    scanf("%d%d", &a, &b);

    for(int i = 0; i < a; i++) {
            scanf("%s", arr[i]);
    }
    if (a <= b) {
        small = a;
        big = b;
        a--;
        b--;
        for(int k = 0; k <= a; a--) {
         for(int i = 0; i < small - a; i++) {
            for(int j = 0; j < big - a; j++) {
                if (a == 0) {
                    printf("1");
                    return 0;
                }
                else if (arr[i][j] == arr[a + i][j] && arr[i][a + j] == arr[a + i][a + j] && arr[i][a + j] == arr[i][j]) {
                    printf("%d", (a + 1) * (a + 1));  
                    return 0;           
                }
            }
         }
        }
    }
    else {
        small = b;
        big = a;
        a--;
        b--;
        for(int k = 0; k <= b; b--) {
         for(int i = 0; i < big - b; i++) {
            for(int j = 0; j < small - b; j++) {
                if (b == 0) {
                    printf("1");
                    return 0;
                }
                else if (arr[i][j] == arr[b + i][j] && arr[i][b + j] == arr[b + i][b + j] && arr[i][b + j] == arr[i][j]) {
                    printf("%d", (b + 1) * (b + 1));  
                    return 0;      
                }
            }
         }
        }
    }
}