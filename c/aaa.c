#include <stdio.h>
int main(){
    int age;
    printf("Enter age : ");
    scanf("%d",&age);
    if (age > 18){
        printf("Adult");
    } else{
        printf("Child");
    }
    return 0;
}