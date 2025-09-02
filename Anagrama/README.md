### Implementada solução para verificar se duas strings são anagramas e sua complexidade.


A forma mais eficiente e simples para esta verificação é contar a frequência de cada caractere em ambas as strings. Se forem idênticas são anagramas.

1.Cria um array de inteiros (charCounts) para armazenar a conta-gem de cada caractere. O tamanho 256 cobre todo o conjunto de caracteres ASCII estendido.

2.Itera uma vez sobre as strings. Para cada caractere, ele in-crementa a contagem para a string s e decrementa para a string t.

3.Se as strings forem anagramas, todas as contagens no array charCounts se anularão e o resultado final para cada posição se-rá 0.4.A verificação final confirma se todas as contagens são zero.
