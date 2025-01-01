
#include<stdio.h>
#include<string.h>

int main()
{

	int tcase = 0; 
	scanf("%d", &tcase);

	char files[50][51] = {0};
	char pattern[51] = { 0 };

	for (int i = 0; i < tcase; i++)
	{
		scanf("%s", &files[i]);

	}

	for (int i = 0 ; i < strlen(files[0]) ; i ++ )
	{
		for (int j = 0; j < tcase; j++)
		{
			pattern[i] = files[j][i];
			if (j > 0 && files[j][i] != files[j - 1][i])
			{
				pattern[i] = '?';
				break;
			}
		}
	}
	printf("%s\n", pattern);
	return 0;
}